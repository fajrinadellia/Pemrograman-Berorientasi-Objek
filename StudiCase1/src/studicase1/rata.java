/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studicase1;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class rata {
    double sum = 0;
    double rata;
    int a=0;
   
    void input(){
        Scanner input = new Scanner(System.in);
        int data;
        char jawab;
        do{
            System.out.print("Masukkan bil bulat: ");
            data = input.nextInt();
            this.sum += data;
            this.a++;
            input.nextLine();
            System.out.print("Entry nilai (y/n): ");
            jawab = input.nextLine().charAt(0);
        } while(jawab !='n');
    }
    
    void hitungRata(){
        this.rata = this.sum/this.a;
    
    }
    
    void output(){
        System.out.println("------------------------");
        System.out.println("Rata-ratanya adalah: " + this.rata);
    }
    
    
}
