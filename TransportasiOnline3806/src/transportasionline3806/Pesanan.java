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
public class Pesanan {
    private String jenisPesanan;
    private String tujuan;
    private int tarif;
    private int jarak;
    private String idTrans;

    public Pesanan(String idTrans, String jenisPesanan, String tujuan, int jarak, int tarif) {
        this.idTrans = idTrans;
        this.jenisPesanan = jenisPesanan;
        this.tujuan = tujuan;
        this.jarak = jarak;
        this.tarif = tarif;
    }
    
    public void setJenisPesanan (String jenisPesanan){
        this.jenisPesanan = jenisPesanan;
    }
    
    public String getJenisPesanan (){
        return jenisPesanan;
    }
    
    public void setTujuan (String tujuan){
        this.tujuan = tujuan;
    }
    
    public String getTujuan (){
        return tujuan;
    }
    
    public void setTarif (int tarif){
        this.tarif = tarif;
    }
    
    public int getTarif (){
        return tarif;
    }
    
    public void setJarak (int jarak){
        this.jarak = jarak;
    }
    
    public int getJarak (){
        return jarak;
    }
    }
