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
public class PersegiPanjang {
    int hitungLuas(int panjang, int lebar){
        int luas;
        luas = panjang*lebar;
        return luas;
    }
    int hitungKeliling(int panjang, int lebar){
        int keliling;
        keliling = 2*(panjang*lebar);
        return keliling;
    }
    double hitungLuas(double panjang, double lebar){
        double luas;
        luas = panjang*lebar;
        return luas;
    }
    double hitungKeliling(double panjang, double lebar){
        double keliling;
        keliling = 2*(panjang*lebar);
        return keliling;
    }
}