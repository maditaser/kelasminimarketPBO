import com.sun.xml.internal.ws.api.ha.StickyFeature;

/**
 * Created by maditaser on 03/05/2017.
 */
public class hadiah {
    String kode_hadiah;
    int poin_hadiah;
    String nama_hadiah;
    int jumlah_hadiah;
    String tanggal_hadiah;
    String batas_tgl_hadiah;

   public hadiah(String xkode_hadiah, int xpoin_hadiah, String  xnama_hadiah, int xjumlah_hadiah,String  xtanggal_hadiah, String  xbatas_tgl_hadiah){
       kode_hadiah = xkode_hadiah;
       poin_hadiah = xpoin_hadiah;
       nama_hadiah = xnama_hadiah;
       jumlah_hadiah = xjumlah_hadiah;
       tanggal_hadiah = xtanggal_hadiah;
       batas_tgl_hadiah = xbatas_tgl_hadiah;
   }

   public void print(){
       System.out.println("Nama Hadiah  : "+nama_hadiah);
       System.out.println("Poin Hadiah  : "+poin_hadiah);
       System.out.println("Jumlah Hadiah: "+jumlah_hadiah);
   }

}
