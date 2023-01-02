/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject1;

/**
 *
 * @author user
 */
public class Persegi {
    //atribut
    
    int sisi;
    
    //method
    
    void hitungLuas(){
        int luas = this.sisi * this.sisi;
        System.out.println("Luasnya adalah : " + luas);
    }
    
    void hitungKeliling(){
        int keliling = this.sisi * 4;
        System.out.println("Kelilingnya adalah : " + keliling);
    }
    
    public static void main(String[] args) {
        Persegi p1 =  new Persegi();
        p1.sisi = 5;
        p1.hitungLuas();
        p1.hitungKeliling();
        
        System.out.println("///////////////////////");
        
        Persegi p2 = new Persegi();
        p2.sisi = 8;
        p2.hitungLuas();
        p2.hitungKeliling();
        
        System.out.println("///////////////////////");
        
        Persegi p3 = new Persegi();
        p3.sisi = 13;
        p3.hitungLuas();
        p3.hitungKeliling();
        
    }
}
