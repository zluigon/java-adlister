package dao;

import com.mysql.jdbc.Driver;
import models.Ad;
import models.Ads;
import util.Config;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {

    private Connection connection;

    public MySQLAdsDao(Config config) {
        try {

            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword());

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Ad> all() {

        List<Ad> ads = new ArrayList<>();
        String selectQuery = "SELECT * FROM ads";

        try {

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectQuery);

            while (resultSet.next()) {
                ads.add(new Ad(resultSet.getByte("user_id"), resultSet.getString("title"), resultSet.getString("description")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return ads;
    }

    @Override
    public Long insert(Ad ad) {

        String insertStmt = String.format("INSERT INTO ads (user_id, title, description) VALUES ('%d', '%s', '%s')", ad.getUserId(), ad.getTitle(), ad.getDescription());

        System.out.println(insertStmt);

        try {

            Statement statement = connection.createStatement();
            statement.executeUpdate(insertStmt, statement.RETURN_GENERATED_KEYS);

            ResultSet resultSet = statement.getGeneratedKeys();

            if (resultSet.next()) {
                System.out.println("Inserted a new record! New id: " + resultSet.getLong(1));

            }

            return resultSet.getLong(1);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
