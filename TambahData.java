package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author RICKY
 */
public class TambahData {
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
            statement.executeUpdate("INSERT INTO biodata_mhs"
                +"(nim, nama, jenis_kelamin, tanggal_lahir, alamat"
                +"fakultas, jurusan, angkatan)"
                +"VALUES ('111310004, 'Rahmat Santoso', 'L', '1988-19-21',"
                +"'Bekasi Utara', 'TI', 'Informatika', '2011');"
            );
            
            System.out.println("Koneksi Berhasil");
            
        } catch (final SQLException ex) {
        } catch (final InstantiationException ex) {
        } catch (final IllegalAccessException ex) {
        } catch (final ClassNotFoundException ex) {
        }
    }
}

