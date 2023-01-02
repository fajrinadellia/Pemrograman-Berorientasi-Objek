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
public class PersegiPanjang {
    
     double p;
     double l;
     
     //construktor
     PersegiPanjang(double a, double b){
         this.p = a;
         this.l = b;
     }
     
    void hitungLuas(){
        double luas = this.p * this.l;
        System.out.println( luas );
    }
    
    void hitungKeliling(){
        double keliling = 2 * (this.p + this.l);
        System.out.println( keliling );
    }
 
}