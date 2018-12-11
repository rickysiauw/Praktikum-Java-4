package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author RICKY
 */
public class HapusData {
    /**
     * @param args the command line arguments
     */    
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            final String username = "root";
            final String password = "rahasia";
            final Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/latihanjavadanmysql", username, password);
            
            Statement statement = koneksi.createStatement();
            statement.executeUpdate("DELETE FROM biodata_mhs"
                +"WHERE nim = '111310004';"
            );
            
            System.out.println("Koneksi Berhasil");
            
        } catch (final SQLException ex) {
        } catch (final InstantiationException ex) {
        } catch (final IllegalAccessException ex) {
        } catch (final ClassNotFoundException ex) {
        }
    }
}
