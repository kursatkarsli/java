/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faiz;

import java.util.Scanner;

/**
 *
 * @author kursa
 */
public class Faiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner i = new Scanner(System.in);
        System.out.println("********************");
        System.out.println("Faiz Hesaplama Programına Hoşgeldiniz.... ");
        System.out.println("********************");
       
       double faiz = 0.06 ;
        System.out.println("yatırılacak para miktarını giriniz = ");
        int para = i.nextInt();
        System.out.println("vadeyi giriniz : ");
        int vade = i.nextInt();
        double d = para ;
        
        for (int sayı= 1 ; sayı <= vade ; sayı++){
         d = (d*faiz) + d ;
        System.out.println( sayı +".yılın sonunda toplam para = " + d );
           
        }
            
        
    }
                
        
        
        
        
    }
    

