/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance2;

/**
 *
 * @author user
 */
public class Inheritage2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.x = 7;
        a.y = 9;
        a.myMethod1();
        
        ClassB b = new ClassB();
        b.x = 1;
        b.y = 2;
        b.z = 3;
        b.myMethod2();
    }
    
}
