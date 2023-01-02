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
public class Hatchback extends Mobil {
    
    //atribut
    public int TARIF_DASAR_SEWA = 300000;
    //dengan sopir maka setatus sopir itu misalkan 1
    //tanpa sopir maka setatus sopir itu misalkan 0
    public int statusSopir;
    public int tarifSopir;
    
    @Override
    public double hitungSewaMobil() {
        double sewa = this.durasi / 12 * this.TARIF_DASAR_SEWA;
        return sewa;
    }

    @Override
    public void tampilRincianBiaya() {
        if (this.statusSopir == 1){
            if (this.tujuan == 1){
                this.tarifSopir = this.durasi / 12 * 250000;
            }else if (this.tujuan == 0){
                this.tarifSopir = this.durasi / 12 * 300000;
            }
        }else if (this.statusSopir== 1){
            this.tarifSopir = 0;
        }
        double totalBiaya = this.hitungSewaMobil() + this.tarifSopir;
        double diskon;
        if (this.durasi > 24){
            diskon = 0.05 * totalBiaya;
        } else {
            diskon = 0;
        }
        System.out.println("Nama Mobil: "+ this.merk);
        System.out.println("Nama Penyewa: "+ this.namaPenyewa);
        System.out.println("-----------------------------------");
        System.out.println("Biaya Sewa Mobil: "+ this.hitungSewaMobil());
        System.out.println("Biaya Sopir: "+this.tarifSopir);
        System.out.println("--------------------------------------");
        System.out.println("Total: "+ totalBiaya);
        System.out.println("Diskon: "+ diskon);
        System.out.println("--------------------------------------");
        System.out.println("Biaya Nett: "+ (totalBiaya-diskon));
        System.out.println("========================================");
    }
}
