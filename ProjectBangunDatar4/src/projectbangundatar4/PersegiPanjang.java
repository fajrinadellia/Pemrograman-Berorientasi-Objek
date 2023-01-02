/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar4;
import java.util.*;
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
    PersegiPanjang(){
       
    }
    void hitungLuas(){
        double luas = this.panjang * this.lebar;
        System.out.println("Luas Persegi Panjang adalah :" +luas+"satuan luas");
    }
    void hitungKeliling(){
        double keliling = 2*( this.panjang + this.lebar);
        System.out.println("Keliling Persegi Panjang adalah :" +keliling+"satuan keliling");
    }
    
    void input(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan panjang: ");
        int p = input.nextInt();
        
        System.out.print("Masukkan lebar: ");
        int l = input.nextInt();
        
        PersegiPanjang p1 = new PersegiPanjang(p, l);
        p1.hitungLuas();
        p1.hitungKeliling();
    }
}
