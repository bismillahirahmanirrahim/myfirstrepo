/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

/**
 *
 * @author PC
 */
public class testsiswa {
    public static void main(String[] args) {
        siswa siswa01 = new siswa ();
        siswa01.setNama("muhammad rafifirdaus s");
        siswa01.setKelas("xrpl6");
        siswa01.setAbsen("22");
        siswa01.setTelepon("082143978804");
        
       System.out.println("Name : "+ siswa01.getNama()+"\n"+"Absen : "+ siswa01.getAbsen()+"\n"+"Telepon : " +siswa01.getTelepon());
        
    }
 
}
