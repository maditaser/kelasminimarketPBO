/**
 * Created by maditaser on 11/04/2017.
 */
public class pegawai {

    String kode_pegawai;
    String nama_pegawai;
    String password_pegawai;
    String alamat_pegawai;
    String no_hp_pegawai;
    String tanggal_lahir_pegawai;
    String hak_akses;

    public pegawai( String xkode_pegawai, String xnama_pegawai, String xpassword_pegawai, String xalamat_pegawai, String xno_hp_pegawai, String xtanggal_lahir_pegawai, String xhak_akses){
        kode_pegawai = xkode_pegawai;
        nama_pegawai = xnama_pegawai ;
        password_pegawai = xpassword_pegawai;
        alamat_pegawai = xalamat_pegawai;
        no_hp_pegawai = xno_hp_pegawai;
        tanggal_lahir_pegawai = xtanggal_lahir_pegawai;
        hak_akses = xhak_akses;
    }

    public void print(){
        System.out.println("Kode Pegawai    : "+kode_pegawai);
        System.out.println("Nama Pegawai    : "+nama_pegawai);
        System.out.println("Tanggal Lahir   : "+tanggal_lahir_pegawai);
        System.out.println("Alamat Pegawai  : "+alamat_pegawai);
        System.out.println("No HP           : "+no_hp_pegawai);
        System.out.println("Password        : "+password_pegawai);
        System.out.println("Status Karyawan : "+hak_akses);

    }
}
