/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba1;

/**
 *
 * @author user
 */
public class Coba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persegi pp1 = new Persegi ();
        pp1.hitungLuas(4);
        pp1.hitungKeliling(4);
        
        System.out.println("/////////////////////////////////////");
        
        PersegiPanjang pp2 = new PersegiPanjang();
        pp2.hitungLuas(5, 6);
        pp2.hitungKeliling(5, 6);
        
    }
    
}
//