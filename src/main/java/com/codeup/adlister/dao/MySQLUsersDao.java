package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.mysql.jdbc.Driver;
import util.Config;

import java.sql.*;

public class MySQLUsersDao implements Users {

    private Connection connection = null;

    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public User findByUsername(String username) {
        PreparedStatement statement = null;
        try {
            String sql = "SELECT * FROM users WHERE username LIKE ?";
            statement = connection.prepareStatement(sql);
            statement.setString(1, username);

            ResultSet resultSet = statement.executeQuery();

            User user = null;

            while (resultSet.next()) {
                user = new User(
                        resultSet.getLong("id"),
                        resultSet.getString("username"),
                        resultSet.getString("email"),
                        resultSet.getString("password")
                );
            }
            return user;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Long insert(User user) {
        try {
            String sql = "INSERT INTO users(username, email, password) VALUES ( ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            String username = user.getUsername();
            String email = user.getEmail();
            String password = user.getPassword();

            statement.setString(1, username);
            statement.setString(2, email);
            statement.setString(3, password);

            statement.executeUpdate();

            ResultSet resultSet = statement.getGeneratedKeys();
            resultSet.next();
            return resultSet.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
