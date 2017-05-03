import java.util.HashMap;

/**
 * Created by maditaser on 11/04/2017.
 */
public class gudang {

    barang barang;
    String tgl_masuk_barang;

    public gudang(String xtgl_masuk_barang){
        tgl_masuk_barang = xtgl_masuk_barang;
    }

    public void  print(){
        System.out.println("Tanggal Masuk Barang : "+ tgl_masuk_barang);
    }
}
