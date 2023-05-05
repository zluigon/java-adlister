package dao;

import models.Ads;
import util.Config;

public class DaoFactory {
    private static Ads adsDao;

    private static Config config = new Config();

    public static Ads getAdsDao() {
        if (adsDao == null) {
            // adsDao = new dao.ListAdsDao();
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }
}
