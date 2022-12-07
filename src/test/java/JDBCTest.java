import com.mysql.cj.jdbc.Driver;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest {

    public static final String URL;
    public static final String USER;
    public static final String PASS;

    static {

        try {
            URL = getURL();
            USER = getUser();
            PASS = getPass();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Get a connection to database
     * @return Connection object
     */
    public static Connection getConnection()
    {
        try {
            DriverManager.registerDriver(new Driver());
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException ex) {
            throw new RuntimeException("Error connecting to the database", ex);
        }
    }

    /**
     * Test Connection
     */
    public static void main(String[] args) {
        Connection connection = JDBCTest.getConnection();
    }

}
