/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author user
 */
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Persegi A = new Persegi();
       A.sisi = 42;
       int luasA = A.hitungLuas();
       System.out.println("Luas Persegi :" + luasA + " cm2");
        
       Lingkaran B = new Lingkaran();
       B.jari = 21;
       double luasB = B.hitungLuas() * 2;
       System.out.println("Luas Dua Lingkaran :" + luasB + " cm2");
        
       double totalLuas = luasA + luasB;
       System.out.println("Total Luas Bangun Pada Project 1 : " + totalLuas + " cm2");
                
        //PROJECT 2
       Lingkaran C = new Lingkaran();
       C.jari = 14;
       double luasC = C.hitungLuas() / 2;
       System.out.println("Luas Setengah Lingkaran Besar :" + luasC + " cm2");
        
       Lingkaran D = new Lingkaran();
       D.jari = 7;
       double luasD = D.hitungLuas();
       System.out.println("Luas Lingkaran kecil :" + luasD + " cm2");
        
       double luasTotal = luasC - luasD;
       System.out.println("Total Luas Bangun Berwarna Abu-Abu : " + luasTotal + " cm2");
    }
    
}

