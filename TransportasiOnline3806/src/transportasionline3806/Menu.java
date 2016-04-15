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
    int f = 0;
    boolean ex = false;
    private int pilihan;
    private int pilihPengemudi;
    private int pilihPelanggan;
    ArrayList<Pengemudi> listDriver = new ArrayList<>();
    ArrayList<Pelanggan> listPelanggan = new ArrayList<>();

    public Menu() throws IOException {
//        this.tampilMenu();
    }

//    public void tampilMenu() throws IOException {
//        System.out.println("============================");
//        System.out.println("|     TRANSPORTASI ONLINE   |");
//        System.out.println("============================");
//        System.out.println("| Pilih:                    |");
//        System.out.println("|        1. Pengemudi       |");
//        System.out.println("|        2. Pelanggan       |");
//        System.out.println("|        3. Pesanan         |");
//        System.out.println("|        4. Kurir           |");
//        System.out.println("|        5. Exit            |");
//        System.out.println("============================");
//        System.out.print("Pilih Menu Diatas : ");
//        pilihan = sc.nextInt();
//        this.pilihMenu(pilihan);
//    }
    
    public void menuPelanggan(Pelanggan p) {
        int a;
        System.out.println("MENU PELANGGAN");
        System.out.println("1. Pesan Transportasi");
        System.out.println("2. Kurir");
        System.out.println("3. Riwayat Pemesanan");
        System.out.println("4. Logout");
        System.out.println("Masukkan Pilihan : ");
        a = sc.nextInt();
        this.pilihMenuPelanggan(a, p);
    }
    public void menuPengemudi(Pengemudi p) {
        int b;
        System.out.println("=============================");
        System.out.println("|    TRANSPORTASI ONLINE    |");
        System.out.println("|    -----PENGEMUDI-----    |");
        System.out.println("         1. Ambil Pesanan ");
        System.out.println("         2. History Pesanan ");
        System.out.println("Pilih Menu Diatas");
        b = sc.nextInt();
        this.pilihMenuPengemudi(b,p);
    }
    
//    pilihMenuPelanggan(int pilihPelanggan, Pelanggan p){
//        switch(pilihPelanggan){
//            
//        }
//    }
//    
//    public void pilihMenuPengemudi(int pilihPengemudi, Pengemudi p){
//        switch(pilihPengemudi){
//            case 1:
//                ambilPesanan(p);
//                break;
//            case 2:
//                viewPesananPengemudi(p);
//                break;
//        }
//    }
    
    
    public void pilihMenuPelanggan(int a, Pelanggan p) {
        switch (a) {
            case 1:
                transPesanan(p);
                menuPelanggan(p);
                break;
            case 2:
                transKurir(p);
                menuPelanggan(p);
                break;
            case 3:
                viewPesanan(p);
                menuPelanggan(p);
                break;
            case 4:
                mainMenu();
                break;
        }
    }
    
    public void pilihMenuPengemudi(int a, Pengemudi p) {
        switch (a) {
            case 1:
                ambilPesanan(p);
                break;
            case 2:
                viewPesananPengemudi(p);
                menuPengemudi(p);
                break;
            case 3:
                mainMenu();
                break;
        }
    }
    //semua pesanan
    public void viewPesananPengemudi(Pengemudi p) {
        for (int i = 0; i < p.getJml(); i++) {
            System.out.println(p.getPesanan(i).getIdTrans());
            System.out.println(p.getPesanan(i).getAlamat());
            System.out.println(p.getPesanan(i).getJarak());
            System.out.println(p.getPesanan(i).getStatus());
        }
    }
    
    public void viewPesanan(Pengemudi p) {
        for (Pelanggan x : listPelanggan) {
            for (int i = 0; i < x.getJml(); i++) {
                if ((x.getPesanan(i).getStatus())) {
                    System.out.println(x.getPesanan(i).getIdTrans());
                    System.out.println(x.getPesanan(i).getAlamat());
                    System.out.println(x.getPesanan(i).getJarak());
                    System.out.println(x.getPesanan(i).getStatus());
                    f++;
                }
            }
        }
    }
    //view pesanan pengemudi
    public void viewPesanan(Pelanggan p) {
        for (int i = 0; i < p.getJml(); i++) {
            System.out.println(p.getPesanan(i).getIdTrans());
            System.out.println(p.getPesanan(i).getAlamat());
            System.out.println(p.getPesanan(i).getJarak());
            System.out.println(p.getPesanan(i).getStatus());
        }
    }

    public void viewPesanan() {
        this.listPelanggan.stream().forEach((x) -> {
            for (int i = 0; i < x.getJml(); i++) {
                System.out.println(x.getIdPelanggan());
                System.out.println(x.getPesanan(i).getIdTrans());
                System.out.println(x.getPesanan(i).getAlamat());
                System.out.println(x.getPesanan(i).getJarak());
                System.out.println(x.getPesanan(i).getStatus());
            }
        });
    }
    
    //Input Pelanggan Baru
    public void inputPlg() {
        System.out.println("Nama Pelanggan : ");
        String nama = sc.next();
        System.out.println("No Telepon     : ");
        String notelp = sc.next();
        System.out.println("Id Pelanggan     : ");
        String idPelanggan = sc.next();
        System.out.println("Alamat     : ");
        String alamat = sc.next();
        try {
            this.addPelanggan(new Pelanggan(nama, notelp, idPelanggan, alamat));
            System.out.println("Data Berhasil Ditambahkan.");
        } catch (Exception e) {
            System.out.println("Data Tidak Berhasil Ditambahkan.");
        }
    }

    public void addPelanggan(Pelanggan p) {
        listPelanggan.add(p);
    }
    
    //Input Pengemudi Baru
    public void inputPng() {
        System.out.println("Nama Pengemudi : ");
        String nama = sc.next();
        System.out.println("No Telepon  : ");
        String notelp = sc.next();
        System.out.println("ID Pengemudi     : ");
        String idPengemudi = sc.next();
        try {
            this.addPengemudi(new Pengemudi(nama, notelp, idPengemudi));
            System.out.println("Data Berhasil Ditambahkan.");
        } catch (Exception e) {
            System.out.println("Data Tidak Berhasil Ditambahkan.");
        }
    }
    public void addPengemudi(Pengemudi p) {
        listDriver.add(p);
    }
    
    //Buat Pesanan Baru
    public void transPesanan(Pelanggan p) {
        System.out.println("ID Trans    : ");
        String idtrans = sc.next();
        System.out.println("Alamat      : ");
        String alamat = sc.next();
        System.out.println("Tujuan      : ");
        String tujuan = sc.next();
        System.out.println("Jarak      : ");
        int jarak = sc.nextInt();
        System.out.println("Harga      : ");
        int harga = sc.nextInt();
        p.createPesanan(idtrans, "Transportasi", alamat,
                tujuan, jarak, harga);
//        (String idTrans, String jenisPesanan, String alamat, String tujuan, int jarak, int tarif)
        
    }

    public void transKurir(Pelanggan p) {
        System.out.println("ID Trans    : ");
        String idtrans = sc.next();
        System.out.println("Alamat      : ");
        String alamat = sc.next();
        System.out.println("Tujuan      : ");
        String tujuan = sc.next();
        System.out.println("Nama Barang : ");
        String namabarang = sc.next();
        System.out.println("Jarak       : ");
        int jarak = sc.nextInt();
        System.out.println("Harga       : ");
        int harga = sc.nextInt();
        p.createPesananKurir("Kurir", alamat,
                tujuan, jarak, harga, namabarang);
//        (String idTrans, String jenisPesanan, String tujuan, int jarak, int tarif, String namaBarang)
    }
    
    public void ambilPesanan(Pengemudi p) {
        
        viewPesanan(p);
        if (f > 0) {
            System.out.println("Masukkan ID Transaksi : ");
            String a = sc.next();
            for (Pelanggan x : this.listPelanggan) {
                System.out.println(x.getNama());
                if (x.getPesanan(a).getIdTrans().equals(a)) {
                    p.addPesanan(x.getPesanan(a));
                    f = 0;
                    break;
                }
            }
        } else {
            System.out.println("Data Tidak Tersedia");
        }
//        menuPengemudi(p);
    }
//    public int pilihMenu(int pilihan) throws IOException {
//        switch (pilihan) {
//            case 1:
//                System.out.print("Input Id Pengemudi : ");
//                int idPengemudi = sc.nextInt();
//                System.out.print("Input No Telepon Pengemudi : ");
//                int telpPengemudi = sc.nextInt();
//                System.out.print("Input Nama Pengemudi : ");
//                String namaPengemudi = br.readLine();
//               
//                inputDriver(namaPengemudi, telpPengemudi, idPengemudi);
//                tampilMenu();
//                break;
//            case 2:
//                System.out.print("Input Id Pelanggan :");
//                int idPelanggan = sc.nextInt();
//                System.out.print("Masukkan Nama Pelanggan :");
//                String namaPelanggan = br.readLine();
//                System.out.print("Masukkan No Telepon Pelanggan :");
//                int telpPelanggan = sc.nextInt();
//                System.out.print("Masukkan Alamat Pelanggan : ");
//                String alamatPelanggan = br.readLine();
//                
//                inputPelanggan(namaPelanggan, telpPelanggan, idPelanggan, alamatPelanggan);
//
//                tampilDriver();
//                tampilPelanggan();
//                break;
//            case 3:
//                System.out.println("Anda memilih Pesanan");
//                break;
//            case 4:
//                System.out.println("Anda memilih Kurir");
//                break;
//            case 5:
//                System.out.println("Exit selected");
//                System.exit(pilihan);
//                break;
//            default:
//                System.out.println("Invalid selection");
//                break; // This break is not really necessary
//        }
//        return pilihan;
//    }

//    private void inputDriver(String nama, int noTelp, int idPengemudi) {
//        Pengemudi driver = new Pengemudi(nama, noTelp, idPengemudi);
//        listDriver.add(driver);
//    }
//    
//    private void tampilDriver(){
//        for (Pengemudi lD : listDriver) {
//            System.out.println("=============");
//            System.out.println("idPengemudi = "+lD.getIdPengemudi());
//            System.out.println("Nama Pengemudi = "+lD.getNama());
//            System.out.println("No Telp = "+lD.getNotelp());
//        }
//        
//    }
//    
//    private void inputPelanggan(String nama, int notelp, long idPelanggan, String alamat){
//        Pelanggan pel = new Pelanggan (nama, notelp, idPelanggan, alamat);
//        listPelanggan.add(pel);
//    }
//    
//    private void tampilPelanggan(){
//        for(Pelanggan ID : listPelanggan){
//            System.out.println("==============");
//            System.out.println("idPelanggan = "+ID.getIdPelanggan());
//            System.out.println("Nama Pelanggan = "+ID.getNama());
//            System.out.println("No Telp = "+ID.getNotelp());
//            System.out.println("Alamat Pelanggan = "+ID.getAlamat());
//        }
//    }
    //---------------------------LOGIN------------------------------
    public void loginPel() {
        boolean cek = false;
        Pelanggan p = null;
        System.out.println("Nama        : ");
        String nama = sc.next();
        System.out.println("No. Telp    : ");
        String notelp = sc.next();
        for (Pelanggan x : this.listPelanggan) {
            if ((x.getNama().equals(nama)) && (x.getNotelp().equals(notelp))) {
                cek = true;
                p = x;
                break;
            }
        }
        if (cek) {
            this.menuPelanggan(p);
        } else {
            System.out.println("Data Tidak Ditemukan.");
        }
    }

    public void loginPeng() {
        boolean cek = false;
        Pengemudi p = null;
        System.out.println("Nama        : ");
        String nama = sc.next();
        System.out.println("No. Telp    : ");
        String notelp = sc.next();
        for (Pengemudi x : this.listDriver) {
            if ((x.getNama().equals(nama)) && (x.getNotelp().equals(notelp))) {
                cek = true;
                p = x;
                break;
            }
        }
        if (cek) {
            this.menuPengemudi(p);
        } else {
            System.out.println("Data Tidak Ditemukan.");
        }
    }
    
    //Main Menu
    public void mainMenu() {
        System.out.println(" ======================");
        System.out.println("|      MENU UTAMA      |");
        System.out.println(" ======================");
        System.out.println("|  1. Pelanggan        |");
        System.out.println("|  2. Pengemudi        |");
        System.out.println("|  3. Exit             |");
        System.out.println(" ======================");
        System.out.print("   Masukkan Pilihan :  ");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                loginPel();
                break;
            case 2:
                loginPeng();
                break;
            case 3:
                ex = true;
                break;
        }
    }
}
