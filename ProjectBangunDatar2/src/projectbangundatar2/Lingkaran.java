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
public class Lingkaran {
    int r;
    
    void hitungLuas(){
        double luas;
        if(r % 7 == 0){
            luas = r * r * 22/7;
        }
        else{
            luas = r * r * 3.14;
        }
        System.out.println("Luas lingkaran: " + luas + " satuan panjang");
    }
    
   void hitungKeliling(){
        double keliling;
        if(r % 7 == 0){
            keliling = 2 * r * 22/7;
        }
        else{
            keliling = 2 * r * 3.14;
        }
        System.out.println("Keliling lingkaran: " + keliling + " satuan panjang");
    }
    
}
