/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bölünebilme;

import java.util.Scanner;

/**
 *
 * @author kursa
 */
public class Bölünebilme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        Scanner i = new Scanner(System.in);
        int a = 0;
        for (int c = 0 ; c < 100 ; c++){
            if ( !(c % 5 == 0) )
                System.out.println(c);
        }
            
    
    }
    
}
