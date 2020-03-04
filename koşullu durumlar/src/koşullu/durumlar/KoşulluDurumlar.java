/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koşullu.durumlar;

import java.util.Scanner;

/**
 *
 * @author kursa
 */
public class KoşulluDurumlar {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("YAŞINIZI GİRİN");
        int a = scanner.nextInt();
        if (a<18){
        System.out.println("Giriş yapamazsınız");
        }
        else  {
            System.out.println("girebilirsiniz");
                }
        
        
        
        
    }
    
}
