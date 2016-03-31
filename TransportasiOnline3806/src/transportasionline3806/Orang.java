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
    private int notelp;
    
    public void setNama (String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setNotelp (int notelp){
        this.notelp = notelp;
    }
    public int getNotelp(){
        return notelp;
    }
}
