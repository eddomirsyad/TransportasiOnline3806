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
public abstract class Orang {
    private String nama;
    private String notelp;

    public Orang(String nama, String notelp) {
        this.nama = nama;
        this.notelp = notelp;
    }
    
    public void setNama (String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setNotelp (String notelp){
        this.notelp = notelp;
    }

    public String getNotelp() {
        return notelp;
    }
    
}
