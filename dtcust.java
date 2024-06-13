/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.servicee;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class dtcust {
    private int jRecord = 10;
    public int aRec = 0;
    public String cust = "Nama Customer : ";
    public String motor = "Merek Motor : ";
    public String dk = "Nomor DK : ";
    public String Keluhan = "Keluhan : ";
    public String tgl = "Tanggal Service : ";
    public String status = "Status : ";


    
    //Array
    private String[][] dtcust = new String[jRecord][6];
    Scanner dtIN = new Scanner(System.in);
    private String[][] dtSelesai = new String[jRecord][6];

    
    //constactor
    public dtcust (int nval){
        this.jRecord = nval;
    }
 
    //StoreData
    public void InputData(){
        int idx = aRec;
        
        if(idx >= jRecord){
            System.out.println("Tempat Penyimpanan Data Sudah Penuh");
            System.out.println("");
            return;
        }
        System.out.println("Pendaftaran Service Motor");
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.print(cust);
        dtcust[idx][0] = dtIN.nextLine();
        
        System.out.print(motor);
        dtcust[idx][1] = dtIN.nextLine();
        
        System.out.print(dk);
        dtcust[idx][2] = dtIN.nextLine();
        
        System.out.print(Keluhan);
        dtcust[idx][3] = dtIN.nextLine();
        
        System.out.print(tgl);
        dtcust[idx][4] = dtIN.nextLine();
        
        System.out.print(status);
        dtcust[idx][5] = dtIN.nextLine();
        
        aRec++;
    }
    
    
    
    
    public void pembayaran(){
    viewSelesai();
    
    System.out.print("Pilih customer (masukkan nomor menu): ");
    String txidx = dtIN.nextLine();
    int idx = Integer.parseInt(txidx);
    
    if(idx >= jRecord){
        System.out.println("customer tidak tersedia");
        return;
    }
    
    System.out.println("Pembayaran service");
    System.out.println("~~~~~~~~~~~~~~~~~~");
    System.out.print("Jenis service: ");
    String jenisService = dtIN.nextLine();
    System.out.print("harga service: ");
    String hargaService = dtIN.nextLine();
    
    
    
    String namaCust = dtSelesai[idx][0];
    
    System.out.println("Lampiran Pembayaran");
    System.out.println("--------------");
    System.out.println(cust + namaCust);
    System.out.println(dk + dtSelesai[idx][2]);
    System.out.println(Keluhan + dtSelesai[idx][3]);
    System.out.println("Jenis Service " + jenisService);
    System.out.println("Total pembayaran: " + hargaService);
    
    System.out.println("Tekan enter untuk kembali ke menu awal...");
    dtIN.nextLine();
}
    
    
    //UpdateData = Mengubah data
    public void UpdateData(){
        System.out.println("Ubah Data Service");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Data cust: ");
        
        String txidx = dtIN.nextLine();
        int idx = Integer.parseInt(txidx);
        System.out.println("Data Lama");
        System.out.println("~~~~~~~~~");
        System.out.println(cust+dtcust[idx][0]);
        System.out.print("Diubah menjadi: ");
        dtcust[idx][0] = dtIN.nextLine();
        
        System.out.println(motor+dtcust[idx][1]);
        System.out.print("Diubah menjadi: ");
        dtcust[idx][1] = dtIN.nextLine();
        
        System.out.println(dk+dtcust[idx][2]);
        System.out.print("Diubah menjadi: ");
        dtcust[idx][2] = dtIN.nextLine();
        
        System.out.println(Keluhan+dtcust[idx][3]);
        System.out.print("Diubah menjadi: ");
        dtcust[idx][2] = dtIN.nextLine();
        
        System.out.println(tgl+dtcust[idx][4]);
        System.out.print("Diubah menjadi: ");
        dtcust[idx][2] = dtIN.nextLine();
        
        System.out.println(status+dtcust[idx][5]);
        System.out.print("Diubah menjadi: ");
        dtcust[idx][2] = dtIN.nextLine();
          
        System.out.println("Data cust ke "+idx+" telah diubah");
                
    }
    
    
    
    
            
    //Destroy = Menghapus Data
    public void DestroyData(){
        String[][] tmp = new String[jRecord][5];
        
        System.out.println("Hapus Data service ");
        System.out.println("~~~~~~~~~~~~~~~~~");
        System.out.println("Nomor cust: ");
        
        String txidx = dtIN.nextLine();
        
        int idx = Integer.parseInt(txidx);
        System.out.println("Data yang dihapus");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(cust+dtcust[idx][0]);
        System.out.println(motor+dtcust[idx][1]);
        System.out.println(dk+dtcust[idx][2]);
        System.out.println(Keluhan+dtcust[idx][2]);
        System.out.println(tgl+dtcust[idx][2]);
        System.out.println(status+dtcust[idx][2]);


        
        int cidx = 0;
        for(int i=0;i<aRec;i++){
            if(i == idx){
                continue;
            }
                
            tmp[cidx][0] = dtcust[i][0];   
            tmp[cidx][1] = dtcust[i][1];   
            tmp[cidx][2] = dtcust[i][2];
            tmp[cidx][2] = dtcust[i][3];
            tmp[cidx][2] = dtcust[i][4];
            tmp[cidx][2] = dtcust[i][5];

            cidx++;
        }
        aRec--;
        for(int i=0; i<aRec; i++){
            tmp[cidx][0] = dtcust[i][0];   
            tmp[cidx][1] = dtcust[i][1];   
            tmp[cidx][2] = dtcust[i][2]; 
            tmp[cidx][2] = dtcust[i][3]; 
            tmp[cidx][2] = dtcust[i][4]; 
            tmp[cidx][2] = dtcust[i][5]; 

        }

    }
    
    //ViewData = Melihat Data
    public void viewData(){
        System.out.println("Daftar Data Customer ("+aRec+"/"+jRecord+")");
        System.out.println("~~~~~~~~~~~~~~~~");
        
        for (int i=0; i<aRec; i++){
            System.out.println("Daftar Cust ke : "+i);
            System.out.println(cust+dtcust[i][0]);
            System.out.println(motor+dtcust[i][1]);
            System.out.println(dk+dtcust[i][2]);
            System.out.println(Keluhan+dtcust[i][3]);
            System.out.println(tgl+dtcust[i][4]);
            System.out.println(status+dtcust[i][5]);
        }
        System.out.println("");
        
    }
    

public void updateStatus() {
    viewData();
    System.out.print("Pilih customer (masukkan nomor menu): ");
    String txidx = dtIN.nextLine();
    int idx = Integer.parseInt(txidx);
    
    if(idx >= jRecord) {
        System.out.println("customer tidak tersedia");
        return;
    }
    
    System.out.println("Ubah Status Service");
    System.out.println("~~~~~~~~~~~~~~~~~~~~");
    System.out.println("1. Dikerjakan");
    System.out.println("2. Selesai");
    System.out.print("Pilih status: ");
    String statusPilihan = dtIN.nextLine();
    
    if(statusPilihan.equals("1")) {
        dtcust[idx][5] = "Dikerjakan";
    } else if(statusPilihan.equals("2")) {
        dtcust[idx][5] = "Selesai";
        
        for(int i=0; i<6; i++) {
            dtSelesai[aRec][i] = dtcust[idx][i];
        }
        aRec++;
    } else {
        System.out.println("Pilihan tidak valid");
    }
}

// Method untuk menampilkan data yang sudah selesai
public void viewSelesai() {
    System.out.println("Daftar Data Customer yang Sudah Selesai ("+aRec+"/"+jRecord+")");
    System.out.println("~~~~~~~~~~~~~~~~");
    
    for (int i=0; i<aRec; i++){
        System.out.println("Daftar Cust ke : "+i);
        System.out.println(cust+dtSelesai[i][0]);
        System.out.println(motor+dtSelesai[i][1]);
        System.out.println(dk+dtSelesai[i][2]);
        System.out.println(Keluhan+dtSelesai[i][3]);
        System.out.println(tgl+dtSelesai[i][4]);
        System.out.println(status+dtSelesai[i][5]);
    }
    System.out.println("");
}
    
}
