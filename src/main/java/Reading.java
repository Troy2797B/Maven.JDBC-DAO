import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Reading {
    public static Properties getPropertyObject() throws IOException {
        FileInputStream fis = new FileInputStream("/Users/troyanna/Dev/Projects/Labs/Maven.JDBC-DAO/src/main/resources/config.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String URL = prop.getProperty("URL");
        String USER = prop.getProperty("USER");
        String PASS = prop.getProperty("PASS");
        return prop;
    }

//    public static String getURL() throws IOException{
//        return getPropertyObject().getProperty("URL");
//    }
//
//    public static String getUser() throws IOException{
//        return getPropertyObject().getProperty("USER");
//    }
//
//    public static String getPass() throws IOException{
//        return getPropertyObject().getProperty("PASS");
//    }
}
