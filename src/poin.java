/**
 * Created by maditaser on 03/05/2017.
 */
public class poin {
    int kode_poin;
    String kode_member;
    int jumlah_poin = 0;

    public poin(int xkode_poin,String xkode_member){
        kode_poin = xkode_poin;
        kode_member = xkode_member;
    }

    public void HitungPoin(int jmlPoin){
        jumlah_poin = jumlah_poin + jmlPoin;
    }

    public void print(){
        System.out.println("Jumlah Poin : "+jumlah_poin);
    }

}
