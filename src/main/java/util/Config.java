package util;

public class Config {
    public String getUrl() {
        return "jdbc:mysql://localhost:3306/adlister_db?allowPublicKeyRetrieval=true&useSSL=false";
    }

    public String getUser() {
        return "adlist_user";
    }

    public String getPassword() {
        return "codeup";
    }
}
