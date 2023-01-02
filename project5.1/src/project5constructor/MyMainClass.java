/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project5constructor;

/**
 *
 * @author user
 */
public class MyMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersegiPanjang p1 = new PersegiPanjang(5.5, 7.7);
        p1.hitungLuas();
        p1.hitungKeliling();
        
        System.out.println("/////////////////////////////////");
        
        Persegi s1 = new Persegi(4.4);
        s1.hitungLuas();
        s1.hitungKeliling();
       
    }
    
}
