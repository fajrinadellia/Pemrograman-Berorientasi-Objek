/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus;

/**
 *
 * @author user
 */
public class StudiKasus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hatchback h1 = new Hatchback();
        h1.namaPenyewa = "Mrs. H";
        h1.merk = "Brio 2";
        h1.tujuan = 1;
        h1.durasi= 24;
        h1.statusSopir= 1;
        h1.hitungSewaMobil();
        h1.tampilRincianBiaya();
        
        Sedan s1 = new Sedan();
        s1.namaPenyewa = "Mrs. S";
        s1.merk = "Sedan";
        s1.tujuan = 1;
        s1.durasi= 27;
        s1.statusSopir= 1;
        s1.hitungSewaMobil();
        s1.tampilRincianBiaya();
          
    }
    
}
