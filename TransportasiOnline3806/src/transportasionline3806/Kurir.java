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
public class Kurir extends Pesanan{
    private String namaBarang;
    

    public Kurir(String idTrans, String jenisPesanan, String tujuan, int jarak, int tarif, String namaBarang) {
        super(idTrans, jenisPesanan, tujuan, jarak, tarif);
    }
    
    
    public void setNamaBarang (String namaBarang){
        this.namaBarang = namaBarang;
    }
    
    public String getNamaBarang (){
        return namaBarang;
    }
    
}
