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
public class MyClass {
    int x;
    int y;
    
    //construktor
    MyClass(){
        this.x = 0;
        this.y = 0;
    }
    
    MyClass(int a){
        this.x = a;
        this.y = 0;
    }
    
    MyClass(int a, int b){
        this.x = a;
        this.y = b;  
    }
    
    void tampil(){
        System.out.println("Tampilannya: " + this.x);
        System.out.println("Tampilannya: " + this.y);
    }
}
