/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118056.latihan43.gajipegawai;


/**
 *
 * @author 
 * Nama : Mirraz Ibrahim
 * Nim : 10118056
 * Kelas: IF-2
 */
public class Mainclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GajiPegawai gaji = new GajiPegawai();
        gaji.setNama("Rizki Adam Kurniawan");
        gaji.setAlamat("Jalan Semar dlm 4 No 72/66");
        gaji.totalGaji(300000, 250000, 4500000);
        gaji.tampilData("", "", 300000, 250000);
        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("-------------------------------------");
        System.out.println("Nama Karyawan : " + gaji.getNama() );
        System.out.println("Alamat : " + gaji.getAlamat());
        System.out.println("Uang Transport : " + gaji.getUangTransport());
        System.out.println("Uang Tunjangan : " + gaji.getUangTunjangan());
        System.out.println("gaji Pokok : " + gaji.getGajiPokok());
        System.out.println("TOTAL GAJI : " + gaji.getTotalGaji());
    }
    
}
