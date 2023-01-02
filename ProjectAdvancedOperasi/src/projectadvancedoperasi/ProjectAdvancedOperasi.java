/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author user
 */
public class ProjectAdvancedOperasi {
    public static void main(String[] args) {
        Operasi a = new Operasi();
        System.out.println(a.jumlahkan(3,4));
        System.out.println(a.jumlahkan(4, 7, (-9)));
        System.out.println(a.jumlahkan(3.4, (-0.002), 0.12313));
    }
    
}
