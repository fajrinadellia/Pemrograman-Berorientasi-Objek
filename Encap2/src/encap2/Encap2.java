/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encap2;

/**
 *
 * @author user
 */
public class Encap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KaryawanA k1 = new KaryawanA();
        k1.nik = "100000000";
        k1.nama = "affc";
        k1.setMasaKerja(10);
        k1.printKaryawan();
        
        KaryawanB k2 = new KaryawanB();
        k2.nik = "000000000";
        k2.nama = "adel";
        k2.setMasaKerja(15);
        k2.printKaryawan();
        
    }
    
}
