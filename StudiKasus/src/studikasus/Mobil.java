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
public abstract class Mobil {
    //atribut
  
    public String merk;
    public int tarifDasarSewa;
    public int durasi;
    //tujuan: 1 untuk dalam kota, 0 untuk luar kota
    public int tujuan;
    public String namaPenyewa;
    
    public abstract double hitungSewaMobil();
    public abstract void tampilRincianBiaya();
   
}

