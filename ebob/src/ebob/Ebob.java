/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebob;

import java.util.Scanner;

/**
 *
 * @author kursa
 */
public class Ebob {
    public static int ebob(int sayı,int sayı1){
        int ebor = 1;
        for (int i = 1 ; i<=sayı && i <=sayı1 ; i++ ){
            if ((sayı % i == 0) && (sayı1 % i == 0)){
                ebor = i ;
                
            }
        }
                
    return ebor ;
    }
            

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner i = new Scanner(System.in);
        System.out.println("birinci sayıyı giriniz = " );
        int a = i.nextInt();
        System.out.println("ikinci sayıyı giriniz = ");
        int b = i.nextInt();
        System.out.println("SAYILARIN EBOB'U = " + ebob(a, b));
        
    }
    
}
