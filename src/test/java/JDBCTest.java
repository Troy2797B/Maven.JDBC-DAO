import com.mysql.cj.jdbc.Driver;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest {
    private static Connection con = null;
    public static final String URL="URL";
    public static final String USER= "USER";
    public static final String PASS = "PASS";

    /**
     * Get a connection to database
     * @return Connection object
     */
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        String DRIVER = "com.mysql.cj.jdbc.Driver";
        Class.forName(DRIVER);
        return con = DriverManager.getConnection(URL,USER,PASS);
//        try {
//            DriverManager.registerDriver(new Driver());
//            return DriverManager.getConnection(URL, USER, PASS);
//        } catch (SQLException ex) {
//            throw new RuntimeException("Error connecting to the database", ex);
//        }
    }

    /**
     * Test Connection
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection connection = JDBCTest.getConnection();
    }

}
