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
    private long idPengemudi;
    private int jml;
    
    public Pengemudi (String nama, int notelp, long idPengemudi){
        this.setNama(nama);
        this.setNotelp(notelp);
        this.idPengemudi = idPengemudi;
//        pesanan = new Pesanan[100];
        jml = 0;
    }
    
    public void addPesanan(Pesanan p){
        pesanan[jml] = p;
        jml++;
    }
    public void setIdPengemudi (long idPengemudi){
        this.idPengemudi = idPengemudi;
    }
    public long getIdPengemudi (){
        return idPengemudi;
    }
    
    public Pesanan getPesanan(int x){
        return pesanan[x];
    }
    
    public void removePesanan(Pesanan p){
        boolean ktm = false;
        for (int i=0; i<jml;i++){
            if(pesanan[i].equals(p)){
                ktm = true;
                for (int j=i; j<jml; j++){
                    pesanan[j] = pesanan[j+1];
                }
                jml--;
                break;
            }
        }
        if (ktm == false){
            System.out.println("Pesanan tidak ada.");
        }
        
    }
}
