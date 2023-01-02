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
public class PersegiPanjang {
    double panjang;
    double lebar;
   
    //construktor
    PersegiPanjang(double p, double l){
        this.panjang = p;
        this.lebar = l;
    }
    void hitungLuas(){
        double luas = this.panjang * this.lebar;
        System.out.println("Luas Persegi Panjang adalah :" +luas+"satuan luas");
    }
    void hitungKeliling(){
        double keliling = this.panjang * this.lebar;
        System.out.println("Keliling Persegi Panjang adalah :" +keliling+"satuan keliling");
    }
    
}
