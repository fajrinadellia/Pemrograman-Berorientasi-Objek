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
public class KaryawanB extends KaryawanA{
     protected void hitungTunjangan(){
        if (this.masaKerja < 10){
            this.tunjangan = 3000000;
        }else{
            this.tunjangan = 4000000;
        }
        
    }
    
    
}
