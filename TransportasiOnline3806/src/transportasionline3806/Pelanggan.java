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
public class Pelanggan extends Orang{
    private Pesanan[] pesanan;
    private long idPelanggan;
    private String alamat;
    private int jml;
    
    public Pelanggan (String nama, String notelp, long idPelanggan, String alamat){
        Pelanggan p = new Pelanggan(nama, notelp, idPelanggan, alamat);
        p.setNama(nama);
        p.setNotelp(notelp);
        this.idPelanggan = idPelanggan;
        this.alamat = alamat;
    }
    
    public void createPesanan (String idTrans, String jenisPesanan, String tujuan, int jarak, int tarif){
        pesanan[jml] = new Pesanan (idTrans, jenisPesanan, tujuan, jarak, tarif);
        jml++;
    }
    
    public void createPesananKurir (String idTrans, String jenisPesanan, String tujuan, int jarak, int tarif, String namaBarang){
        pesanan[jml] = new Kurir (idTrans, jenisPesanan, tujuan, jarak, tarif, namaBarang);
        jml++;
    }
    
    public void setIdPelanggan (long idPelanggan){
        this.idPelanggan = idPelanggan;
    }
    
    public long getIdPelanggan (){
        return idPelanggan;
    }
    
    public void setAlamat (String alamat){
        this.alamat = alamat;
    }
    
    public String getAlamat(){
        return alamat;
    }
 
    public Pesanan getPesanan (int x) {
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
