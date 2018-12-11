package koneksimysql;

/**
 *
 * @author RICKY
 */
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {

    private static Connection koneksi;

    public static Connection getConnection() throws SQLException {
        if (koneksi == null) {
            // panggil Driver MySQL
            Driver driver = new Driver();
            // buat koneksi
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/latihanjavadanmysql", "root", "");
        }
        return koneksi;
    }

    public static void main(String args[]) {
        try {
            getConnection();
            System.out.println("Koneksi Berhasil");
        } catch (SQLException ex) {
            System.err.println("Koneksi Gagal");
        }
    }
}