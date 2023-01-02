/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar3;

/**
 *
 * @author user
 */
public class ProjectBangunDatar3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Persegi Panjang
        PersegiPanjang p1 = new PersegiPanjang(10, 5);
        p1.hitungLuas();
        p1.hitungKeliling();
        
        PersegiPanjang p2 = new PersegiPanjang(3.6, 8);
        p2.hitungLuas();
        p2.hitungKeliling();
        
        PersegiPanjang p3 = new PersegiPanjang(6,8.3);
        p3.hitungLuas();
        p3.hitungKeliling();
        
        PersegiPanjang p4 = new PersegiPanjang(5.6, 8.8);
        p4.hitungLuas();
        p4.hitungKeliling();
        
        //Persegi
        Persegi s1 = new Persegi(4.5);
        s1.hitungLuas();
        s1.hitungKeliling();
        
        Persegi s2 = new Persegi(7);
        s2.hitungLuas();
        s2.hitungKeliling();
        
        //Lingkaran
        Lingkaran l1 = new Lingkaran(5);
        l1.hitungLuas();
        l1.hitungKeliling();
        
        Lingkaran l2 = new Lingkaran(7.4);
        l2.hitungLuas();
        l2.hitungKeliling();
    }
    
}
