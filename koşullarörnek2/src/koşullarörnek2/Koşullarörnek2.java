/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koşullarörnek2;

/**
 *
 * @author kursa
 */
public class Koşullarörnek2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //çarpım tablosu
        for (int i = 1 ; i < 10 ; i++){
                    System.out.println("*****************");

            for (int k = 1 ; k < 10 ; k++){
                System.out.println(i + "x" + k + "=" + (i*k));
                
            }
        }
        System.out.println("******************");
       
    }
    
}
