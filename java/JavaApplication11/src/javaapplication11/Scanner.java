package remed.pro.rpl;

/**
 *
 * @author MOKLET-2
 */import java.util.Scanner;
public class RemedProRpl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input= new Scanner (System.in);
        String nama;
        int NIK, jumlah_orang, pilihan, hari;
        double bayar, harga, nominal, kembalian, kurang, harga_total;
        
        System.out.println();
        System.out.println("-Booking Hotel Booba-");
        System.out.println("Silakan isi identitas");
        
        System.out.print("Masukkan nama : ");
        String Nama= input.nextLine();
        System.out.print("Masukkan NIK : ");
        int nik= input.nextInt();
        System.out.print("Masukkan jumlah orang : ");
        int Jumlah_orang= input.nextInt();
        
        System.out.println("-Tipe-Tipe Kamar Hotel Booba-");
        System.out.println("1.Kamar Gold = Rp 800000 ");
        System.out.println("2. Kamar Silver = Rp 500000");
        System.out.println("3. Kamar Bronze = Rp 300000");
        
        System.out.print("Masukkan pilihan kamar anda : ");
        pilihan= input.nextInt();
        if (pilihan <= 1){
            harga= 800000;
        }else if (pilihan == 2){
            harga= 500000;
        }else if (pilihan == 3){
            harga= 300000;
            
            if(pilihan <= 1){
                System.out.println("No.1 = Rp 800000");
            }else if (pilihan == 2){
                System.out.println("No.2 = Rp 500000");
            }else if (pilihan == 3){
                System.out.println("No.3 = Rp 300000");
            }
            
            System.out.print("Total hari anda menginap : ");
            hari= input.nextInt();
            
            harga_total= hari*harga;
            System.out.println("Total harga yang harus anda bayar : Rp " +harga_total);
            
            System.out.print("Masukkan nominal pembayaran : Rp ");
            bayar= input.nextDouble();
            kurang= harga-bayar;
            kembalian= bayar-harga;
            if (bayar < harga){
                System.out.println("Uang kurang" +kurang);
            }else if (bayar > harga){
                System.out.println("Kembalian" +kembalian);
            }else if (bayar == harga){
                System.out.println("Uang pas");
                System.out.println("Terima kasih");
            }
        }
        
    }