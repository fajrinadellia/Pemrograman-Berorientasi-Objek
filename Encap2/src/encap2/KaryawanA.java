/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encap2;

/**
 *
 * @author user
 */
public class KaryawanA {
    public String nik;
    public String nama;
    private int gapok = 3000000;
    protected int tunjangan;
    protected int masaKerja;
    private int totalGaji;
    
    public void setMasaKerja(int mk){
        if(mk > 0){
            this.masaKerja = mk;
        }else{
            System.out.println("masa kerja tdk valid");
            System.exit(0);
        }
    }
    
    protected void hitungTunjangan(){
        if (this.masaKerja < 10){
            this.tunjangan = 2000000;
        }else{
            this.tunjangan = 3000000;
        }
        
    }
    
    private void hitungTotalGaji(){
        this.totalGaji = this.gapok + this.tunjangan;
    }
    
    public void printKaryawan(){
        this.hitungTunjangan();
        this.hitungTotalGaji();
        System.out.println("NIK:"+this.nik);
        System.out.println("Nama:"+this.nama);
        System.out.println("Masa Kerja:"+this.masaKerja);
        System.out.println("-----------------------");
        System.out.println("gaji pokok: "+this.gapok);
        System.out.println("tunjangan:"+this.tunjangan); 
        System.out.println("------------------------");
        System.out.println("total gaji:"+this.totalGaji);
    }
    
}
