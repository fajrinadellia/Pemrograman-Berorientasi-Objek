/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar;

/**
 *
 * @author user
 */
public class ProjectBangunDatar {

    public static void main(String[] args) {
        // membuat obyek persegi panjang A
        PersegiPanjang C = new PersegiPanjang();
        
        // memberi nilai atribut panjang & lebar dari A
        C.panjang = 17;
        C.lebar = 8;
        
        // menghitung luas dan keliling dari A
        C.hitungLuas();
        C.hitungKeliling();
        
        // membuat obyek persegi panjang B
        PersegiPanjang D = new PersegiPanjang();
        
        // memberi nilai atribut panjang & lebar dari B
        D.panjang = 26;
        D.lebar = 14;
        
        // menghitung luas dan keliling dari B
        D.hitungLuas();
        D.hitungKeliling();
        
        
        //membuat obyek lingkaran 1
        Lingkaran L1 = new Lingkaran();
        
        //memberi nilai atribut jejari(r) pada L1
        L1.r = 6;
        
        //menghitung luas dan keliling dari L1
        L1.hitungLuasLingkaran();
        L1.hitungKelilingLingkaran();
                
        //membuat obyek lingkaran 2
        Lingkaran L2 = new Lingkaran();
        
        //memberi nilai atribut jejari(r) pada L2
        L2.r = 12;
        
        //menghitung luas dan keliling L2
        L2.hitungLuasLingkaran();
        L2.hitungKelilingLingkaran();
    }
    
}
