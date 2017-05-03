/**
 * Created by maditaser on 11/04/2017.
 */
public class member {
    String kode_member;
    String nama_member;
    String ttl_member;
    String no_hp;
    String alamat_member;
    String agama_member;
    String status_nikah;
    String tgl_gabung;
    int poin = 0;

    public member(String  xkode_member, String  xnama_member, String xttl_member, String xno_hp, String xalamat_member, String xagama_member, String xstatus_nikah,String xtgl_gabung
    ){
        kode_member = xkode_member;
        nama_member = xnama_member;
        ttl_member = xttl_member;
        no_hp = xno_hp;
        alamat_member = xalamat_member;
        agama_member = xagama_member;
        status_nikah = xstatus_nikah;
        tgl_gabung = xtgl_gabung;
    }

    public void tambahPoin(int jmlPoin){
        poin = poin + jmlPoin;
    }

    public void print(){
        System.out.println("Kode Member         : "+kode_member);
        System.out.println("Nama Member         : "+nama_member);
        System.out.println("Tanggal Lahir       : "+ttl_member);
        System.out.println("No. HP Member       : "+ttl_member);
        System.out.println("Alamat Member       : "+alamat_member);
        System.out.println("Agama               : "+agama_member);
        System.out.println("Status Pernikahan   : "+status_nikah);
        System.out.println("Tanggal Gabung      : "+tgl_gabung);
        System.out.println("Total Point         : "+poin);
    }

}
