/**
 * Created by maditaser on 03/05/2017.
 */
public class gaji {
    int kode_gaji;
    String kode_pegawai;
    int jumlah_gaji;
    int bonus=0;
    int totalGaji=0;

    public gaji(int xkode_gaji, String  xkode_pegawai){
        kode_gaji = xkode_gaji;
        kode_pegawai = xkode_pegawai;
    }

    public void hitungGaji(){
        totalGaji = jumlah_gaji + bonus;
    }

    public void print(){
        System.out.println("Gaji    : "+ jumlah_gaji);
        System.out.println("Bonus   : "+ bonus);
    }
}
