/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author user
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Persegi Panjang
        PersegiPanjang p1 = new PersegiPanjang();
        System.out.println("1. Luas Persegi Panjang 1 adalah: " + p1.hitungLuas(10,5));
        System.out.println("   Keliling Persegi Panjang 1 adalah: " + p1.hitungKeliling(10,5));
        
        PersegiPanjang p2 = new PersegiPanjang();
        System.out.println("2. Luas Persegi Panjang 2 adalah: " + p2.hitungLuas(3.6,8));
        System.out.println("   Keliling Persegi Panjang 2 adalah: " + p2.hitungKeliling(3.6,8));
        
        PersegiPanjang p3 = new PersegiPanjang();
        System.out.println("3. Luas Persegi Panjang 3 adalah: " + p3.hitungLuas(6,8.3));
        System.out.println("   Keliling Persegi Panjang 3 adalah: " + p3.hitungKeliling(6,8.3));
        
        PersegiPanjang p4 = new PersegiPanjang();
        System.out.println("4. Luas Persegi Panjang 4 adalah: " + p4.hitungLuas(5.6,8.8));
        System.out.println("   Keliling Persegi Panjang 4 adalah: " + p4.hitungKeliling(5.6,8.8));
        
        //Persegi
        Persegi s1 = new Persegi();
        System.out.println("1. Luas Persegi  1 adalah: " + s1.hitungLuas(4.5));
        System.out.println("   Keliling Persegi  1 adalah: " + s1.hitungKeliling(4.5));
        
        Persegi s2 = new Persegi();
        System.out.println("2. Luas Persegi  2 adalah: " + s2.hitungLuas(7));
        System.out.println("   Keliling Persegi  2 adalah: " + s2.hitungKeliling(7));
        
        //Lingkaran
        Lingkaran l1 = new Lingkaran();
        l1.r = 5;
        l1.hitungLuas();
        l1.hitungKeliling();
        
        Lingkaran l2 = new Lingkaran();
        l2.r = (int)7.4;
        l2.hitungLuas();
        l2.hitungKeliling();
    }
    
}
