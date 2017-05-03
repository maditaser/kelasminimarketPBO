/**
 * Created by maditaser on 11/04/2017.
 */
public class barang_masuk {
    int kode_masuk;
    int jumlah_barang_masuk;
    String tanggal_masuk;
    String hari;

    public barang_masuk(int xkode_masuk, int xjumlah_barang_masuk, String xtanggal_masuk, String xhari){
        kode_masuk = xkode_masuk;
        jumlah_barang_masuk = xjumlah_barang_masuk;
        tanggal_masuk = xtanggal_masuk;
        hari = xhari;
    }

    public void print(){
        System.out.println("Kode Masuk      : "+kode_masuk);
        System.out.println("Jumlah Barang   : "+jumlah_barang_masuk);
        System.out.println("Tanggal Masuk   : "+tanggal_masuk);
        System.out.println("Hari            : "+hari);
    }
}
