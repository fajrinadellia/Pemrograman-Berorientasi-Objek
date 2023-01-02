/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author user
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        ClassA a = new ClassA();
        a.x = 10;
        a.y = 5;
        a.myMethod1();
        
        ClassB b = new ClassB();
        b.x = 8;
        b.y = 8;
        b.myMethod2();
        
        ClassC c = new ClassC();
        c.x = 7;
        c.y = 8;
        c.x = 9;
        c.myMethod3();
       
        */
        Dosen p1 = new Dosen();
        p1.kodePegawai = "P01";
        p1.namaPegawai = "Satir";
        p1.golPegawai = 3;
        p1.nidn = "9001";
        System.out.println("Hasil: "+ p1.hitungGajiPokok());
        System.out.println("Hasil: "+ p1.hitungTunjangan());
    }
    
    
}
