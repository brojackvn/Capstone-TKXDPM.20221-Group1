
package entity.db;

import utils.Utils;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 * Ket noi DB
 * @author tandb
 */
public class CapstoneDB {
    private static Logger LOGGER = Utils.getLogger(Connection.class.getName());
    private static Connection connection;

    public static Connection getConnection() {
        if (connection != null) return connection;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/ecodb", "root", "brojackvn");
            LOGGER.info("Connect database successfully");
        } catch (SQLException e) {
            LOGGER.info(e.getMessage());
        }
        return connection;
    }
    public static void main(String[] args) {
        CapstoneDB.getConnection();
    }
}