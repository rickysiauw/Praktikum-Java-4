package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author RICKY
 */
public class TampilData {
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
            final ResultSet result = statement.executeQuery("SELECT * FROM biodata_mhs;");
            
            while (result.next()) {
                //Proses
                final String nim = result.getString("nim");
                final String nama = result.getString("nama");
                final String jenisKelamin = result.getString("jenis_kelamin");
                final String tanggalLahir = result.getString("tanggal_lahir");
                final String alamat = result.getString("alamat");
                final String fakultas = result.getString("fakultas");
                final String jurusan = result.getString("jurusan");
                final String angkatan = result.getString("angkatan");
                System.out.println("NIM : " + nim);
                System.out.println("NAMA : " + nama);
                System.out.println("JENIS KELAMIN : " + jenisKelamin);
                System.out.println("TANGGAL LAHIR : " + tanggalLahir);
                System.out.println("ALAMAT  : " + alamat);
                System.out.println("FAKULTAS: " + fakultas);
                System.out.println("JURUSAN : " + jurusan);
                System.out.println("ANGKATAN : " + angkatan);
                System.out.println("---------------------------------");
            }
            
            
            System.out.println("Koneksi Berhasil");
            
        } catch (final SQLException ex) {
        } catch (final InstantiationException ex) {
        } catch (final IllegalAccessException ex) {
        } catch (final ClassNotFoundException ex) {
        }
    }
}
