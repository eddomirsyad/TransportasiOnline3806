/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportasionline3806;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author eddomirsyad
 */
public class Menu {

    Scanner sc = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private int pilihan;
    ArrayList<Pengemudi> listDriver = new ArrayList<>();
    ArrayList<Pelanggan> listPelanggan = new ArrayList<>();

    public Menu() throws IOException {
        this.tampilMenu();
    }

    public void tampilMenu() throws IOException {
        System.out.println("============================");
        System.out.println("|     TRANSPORTASI ONLINE   |");
        System.out.println("============================");
        System.out.println("| Pilih:                    |");
        System.out.println("|        1. Pengemudi       |");
        System.out.println("|        2. Pelanggan       |");
        System.out.println("|        3. Pesanan         |");
        System.out.println("|        4. Kurir           |");
        System.out.println("|        5. Exit            |");
        System.out.println("============================");
        System.out.print("Pilih Menu Diatas : ");
        pilihan = sc.nextInt();
        this.pilihMenu(pilihan);
    }

    public int pilihMenu(int pilihan) throws IOException {
        switch (pilihan) {
            case 1:
                System.out.print("Input Id Pengemudi : ");
                int idPengemudi = sc.nextInt();
                System.out.print("Input No Telepon Pengemudi : ");
                int telpPengemudi = sc.nextInt();
                System.out.print("Input Nama Pengemudi : ");
                String namaPengemudi = br.readLine();
               
                inputDriver(namaPengemudi, telpPengemudi, idPengemudi);
                tampilMenu();
                break;
            case 2:
                System.out.print("Input Id Pelanggan :");
                int idPelanggan = sc.nextInt();
                System.out.print("Masukkan Nama Pelanggan :");
                String namaPelanggan = br.readLine();
                System.out.print("Masukkan No Telepon Pelanggan :");
                int telpPelanggan = sc.nextInt();
                System.out.print("Masukkan Alamat Pelanggan : ");
                String alamatPelanggan = br.readLine();
                
                inputPelanggan(namaPelanggan, telpPelanggan, idPelanggan, alamatPelanggan);

                tampilDriver();
                tampilPelanggan();
                break;
            case 3:
                System.out.println("Anda memilih Pesanan");
                break;
            case 4:
                System.out.println("Anda memilih Kurir");
                break;
            case 5:
                System.out.println("Exit selected");
                System.exit(pilihan);
                break;
            default:
                System.out.println("Invalid selection");
                break; // This break is not really necessary
        }
        return pilihan;
    }

    private void inputDriver(String nama, int noTelp, int idPengemudi) {
        Pengemudi driver = new Pengemudi(nama, noTelp, idPengemudi);
        listDriver.add(driver);
    }
    
    private void tampilDriver(){
        for (Pengemudi lD : listDriver) {
            System.out.println("=============");
            System.out.println("idPengemudi = "+lD.getIdPengemudi());
            System.out.println("Nama Pengemudi = "+lD.getNama());
            System.out.println("No Telp = "+lD.getNotelp());
        }
        
    }
    
    private void inputPelanggan(String nama, int notelp, long idPelanggan, String alamat){
        Pelanggan pel = new Pelanggan (nama, notelp, idPelanggan, alamat);
        listPelanggan.add(pel);
    }
    
    private void tampilPelanggan(){
        for(Pelanggan ID : listPelanggan){
            System.out.println("==============");
            System.out.println("idPelanggan = "+ID.getIdPelanggan());
            System.out.println("Nama Pelanggan = "+ID.getNama());
            System.out.println("No Telp = "+ID.getNotelp());
            System.out.println("Alamat Pelanggan = "+ID.getAlamat());
        }
    }
}
