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
public class Persegi {
    double sisi;
    
    //consturktor
    Persegi(double s){
        this.sisi = s;
    }
    void hitungLuas(){
        double luas = this.sisi * this.sisi;
        System.out.println("Luas Persegi adalah :" +luas+"satuan luas");
    }
    void hitungKeliling(){
        double keliling = 4 * this.sisi;
        System.out.println("Keliling Persegi adalah :" +keliling+"satuan keliling");
    }
    
}
