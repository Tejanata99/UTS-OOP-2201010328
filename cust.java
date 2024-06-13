/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.servicee;

/**
 *
 * @author erick
 */
public class cust {
    public static void page() {

       dtcust DA = new dtcust(10);
       String ul ="ulang";
       do{
            System.out.println("Sistem Input Service Motor");
            System.out.println("~~~~~~~~~~~~~~~~~~~~");
            System.out.println("A. Lihat Daftar Antrian");
            System.out.println("B. Tambah Data Service");
            System.out.println("C. Ubah Data Service");
            System.out.println("D. Hapus Data Menu");
            System.out.println("E. Perubahan Status");
            System.out.println("F. Data yang sudah selesai");
            System.out.println("G. Pembayaran");
            System.out.println("H. LogOut");
            System.out.println("Pilih A/B/C/D/E/F: ");
            String mPIL = DA.dtIN.nextLine();
            
            switch(mPIL){
                case "A":
                    DA.viewData();
                    break; 
                
                case "B":
                    DA.InputData();
                    break; 
                
                case "C":
                    DA.UpdateData();
                    break; 
                
                case "D":
                    DA.DestroyData();
                    break; 
                
                case "E":
                    DA.updateStatus();
                    break;
                    
                case "F":
                    DA.viewSelesai();
                    break;
                    
                case "G":
                    DA.pembayaran();
                    break;
                     
                case "H":
                    EServicee eServicee = new EServicee();
                    eServicee.mainMenu();
                    break; 
                    
                    
                default:
                        System.out.println("Plihan Tidak tersedia");
                    break;
            }
       }while( ul.equals("ulang"));
}
}
