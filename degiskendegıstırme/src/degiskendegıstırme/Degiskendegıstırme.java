/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package degiskendegıstırme;

import java.util.Scanner;

/**
 *
 * @author kursa
 */
public class Degiskendegıstırme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("birinci sayı giriniz ");
          int a = scanner.nextInt();
          System.out.print("ikinci sayı gir ");
          int b  = scanner.nextInt();
          System.out.println("değiştirilmeden önce " + "\n birinci sayı " + a + "\n ikinci sayı " +b);
        int degıs = a;
        a=b;
        b = degıs ;
        System.out.println("değiştirildikten sonra " + "\n birinci sayı " + a +"\n ikinci sayı " + b);
        
    }
    
}
