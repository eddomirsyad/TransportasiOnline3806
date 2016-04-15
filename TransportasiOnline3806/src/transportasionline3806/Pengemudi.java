/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportasionline3806;

/**
 *
 * @author eddomirsyad
 */
public class Pengemudi extends Orang{
    private Pesanan[] pesanan;
    private String idPengemudi;
    private int jml;
    public static int hitungPengemudi;
    
    public Pengemudi (String nama, String notelp, String idPengemudi){
        super(nama, notelp);
        pesanan = new Pesanan[100];
        jml = 0;
        hitungPengemudi++;
        this.idPengemudi = idPengemudi;
//        pesanan = new Pesanan[100];
        jml = 0;
    }
    
    public void addPesanan(Pesanan p){
        pesanan[jml] = p;
        jml++;
        if(p.getJenisPesanan().equals("Kurir")){
            pesanan[jml] = p;
            p.setTaken();
            jml++;
        }else {
            System.out.println("Anda tidak bisa mengambil pesanan ini.");
        }
        
    }
    public void setIdPengemudi (String idPengemudi){
        this.idPengemudi = idPengemudi;
    }
    public String getIdPengemudi (){
        return idPengemudi;
    }
    
    public Pesanan getPesanan(int x){
        return pesanan[x];
    }
    
    public void removePesanan(String idTrans){
        boolean ktm = false;
        for (int i=0; i<jml;i++){
            if(pesanan[i].getIdTrans().equals(idTrans)){
                ktm = true;
                for (int j=i; j<jml; j++){
                    pesanan[j] = pesanan[j+1];
                }
                jml--;
                System.out.println("Data berhasil dihapus.");
                break;
            }
        }
        if (ktm == false){
            System.out.println("Pesanan tidak ditemukan.");
        }
        
    }
     public int getJml(){
         return jml;
     }
}
