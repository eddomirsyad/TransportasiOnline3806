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
    private String idPelanggan;
    private String alamat;
    private int jml;
    public static int hitungPelanggan;
    
    public Pelanggan (String nama, String notelp, String idPelanggan, String alamat){
//        Pelanggan p = new Pelanggan(nama, notelp, idPelanggan, alamat);
        super(nama, notelp);
        pesanan = new Pesanan[100];
        hitungPelanggan++;
        this.idPelanggan = idPelanggan;
        this.alamat = alamat;
//        pesanan = new Pesanan[100];
    }

    
    public void createPesanan (String idTrans, String jenisPesanan, String alamat, String tujuan, int jarak, int tarif){
        pesanan[jml] = new Pesanan (idTrans, jenisPesanan, alamat, tujuan, jarak, tarif);
        jml++;
    }
    
    public void createPesananKurir (String idTrans, String jenisPesanan, String tujuan, int jarak, int tarif, String namaBarang){
        pesanan[jml] = new Kurir (idTrans, jenisPesanan, alamat, tujuan, jarak, tarif, namaBarang);
        jml++;
    }
    
    public void setIdPelanggan (String idPelanggan){
        this.idPelanggan = idPelanggan;
    }
    
    public String getIdPelanggan (){
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
    public Pesanan getPesanan(String idTrans) {
        boolean found = false;
        Pesanan p = null;
        for (int i = 0; i < jml; i++) {
            if (pesanan[i].getIdTrans().equals(idTrans)) {
                found = true;
                p = pesanan[i];
                break;
            }
        }
        return p;
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
