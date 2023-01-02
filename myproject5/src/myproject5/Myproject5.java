/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject5;

/**
 *
 * @author user
 */
public class Myproject5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClass a = new MyClass();
        a.tampil();
        
        MyClass a1 = new MyClass(5);
        a1.tampil();
        
        MyClass a2 = new MyClass(7,3);
        a2.tampil();
    }
    
}
//int i = 0;
//while (i<5){
//system.out.println(i);
//i++;
//}