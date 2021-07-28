/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daftarpembelajaran;

/**
 *
 * @author PC
 */
public class Daftarpembelajaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nomortransaksi,totalharga,totalpembayaran,kembalian,tanggal,bulan,tahun;
        
        nomortransaksi = 44598;
        totalharga = 175000;
        totalpembayaran = 200000;
        kembalian = 25000;
        tanggal = 27;
        bulan = 8;
        tahun = 2020;
        
        System.out.println("nomor transaksi : " + nomortransaksi);
        System.out.println("total harga : " + totalharga);
        System.out.println("total pembayaran : " + totalpembayaran);
        System.out.println("kembalian : " + kembalian);
        System.out.println("tanggal dan waktu pembayaran : " + tanggal + "-" + bulan + "_" + tahun);
    
}
