import java.util.Date;

/**
 * Created by maditaser on 11/04/2017.
 */
public class barang {
    String kode_barang;
    String nama_barang;
    String jenis_barang;
    int harga_beli;
    int harga_jual;
    int jumlah_barang;
    String batas_jual_barang;

    public barang( String xkode_barang, String xnama_barang, String xjenis_barang, int xharga_beli, int xharga_jual, int xjumlah_barang ){
        kode_barang = xkode_barang;
        nama_barang = xnama_barang;
        jenis_barang = xjenis_barang;
        harga_beli = xharga_beli;
        harga_jual = xharga_jual;
        jumlah_barang = xjumlah_barang;
    }

    public void  print(){
        System.out.println("Kode Barang       : "+ kode_barang);
        System.out.println("Nama Barang       : "+ nama_barang);
        System.out.println("Jenis Barang      : "+ jenis_barang);
        System.out.println("Harga Beli        : "+ harga_beli);
        System.out.println("Harga Jual        : "+ harga_jual);
        System.out.println("Jumlah Barang     : "+ jumlah_barang);
    }
}
