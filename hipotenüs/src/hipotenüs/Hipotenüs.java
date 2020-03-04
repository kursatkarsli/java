/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hipotenüs;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author kursa
 */
public class Hipotenüs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a ;
        int b ;
         
        System.out.print("1. Dik kenar değerini giriniz : ");
        a = scanner.nextInt();
        System.out.print("2. dik kenar değerini giriniz : ");
        b = scanner.nextInt();
        double c = Math.sqrt(a * a + b * b);
        System.out.print("hipotenüs = " + c);
        
        
        
        
        // TODO code application logic here
    }
    
}
