/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koşullar.örnek;

import java.util.Scanner;

/**
 *
 * @author kursa
 */
public class KoşullarÖrnek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner i = new Scanner(System.in);
        System.out.println("Lütfen sayıyı giriniz : ");
        int sayı = i.nextInt();
        System.out.println("Lütfen basamak sayısını giriniz = ");
        int basamak = i.nextInt();
        int gecici = sayı;
        int toplam = 0;// toplam burada basamak sayılarının üslerini toplarken yardımcı olacak //
        do {
            int yüzde = gecici % 10;
            gecici /= 10;
            toplam += Math.pow(yüzde,basamak);
                }
        
        while (gecici > 0);
        
        if (toplam == sayı){
            
                System.out.println("bu sayı armstrong sayısıdır");
            
        }
        else {
            System.out.println("bu sayı armstrong sayısı değildir");
        }
           }
            
        }
        
    
    

