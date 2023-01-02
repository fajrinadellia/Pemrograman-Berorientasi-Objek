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
public class Persegi {
    double s;
    
    //consturktor
    Persegi(double a){
        this.s = a;
    }
    void hitungLuas(){
        double luas = this.s * this.s;
        System.out.println( luas );
    }
    
    void hitungKeliling(){
        double keliling = 4*this.s;
        System.out.println( keliling );
    }
 
    
}
