/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e.servicee;

import java.util.Scanner;

/**
 *
 * @author Tejanata
 */
public class EServicee {

    
    public static void main(String[] args) {
        
        EServicee eServicee = new EServicee();
        eServicee.mainMenu();
}
    public void mainMenu(){
        
        System.out.println("SISTEM INPUT SERVICE MOTOR ");
        System.out.println("Masukkan Username dan Password");
        
        masuk();
       }
       
       public void masuk(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nama : ");
        String username = scanner.nextLine();
        System.out.print("Status : ");
        String status = scanner.nextLine();
        
        System.out.println("Selamat datang "+ status + username);
        
        System.out.println("Ketik 1 untuk lanjut ke halaman selanjutnya");
        
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
               cust.page();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
        
        scanner.close();
       
    
    }
}
    
