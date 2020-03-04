/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gelişmişçarpımtablosu;

import java.util.Scanner;

/**
 *
 * @author kursa
 */
public class Gelişmişçarpımtablosu {
    
    public static int çıkarma(int a , int b , int c ){
        return (a-b-c);
    }
        public static int çıkarma(int a , int b ){
            return a-b;
        }
            public static double bölme(int a , int b , int c ){
                return (double)a / b / c;
                
            }
    public static double bölme(int a , int b  ){
        return ((double)a / b);
        
    }
    public static int toplama(int a , int b , int c ){
        return a + b + c ;
        
    }
    public static int toplama(int a , int b){
        return a + b;
         }
    public static int çarpma(int a , int b , int c ){
        return a * b * c;
        
    }
    public static int çarpma(int a , int b ){
        return a * b;
        
    }


    
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner i = new Scanner(System.in);
        
        String giris = "  \n\n1. işlem toplama"
                        + "\n2.işlem çıkarma"
                        + "\n3.işlem çarpma"
                        + "\n4.işlem bölme "
                        + "\nProgramı kapatmak için q'ya basınız ";
        System.out.println("HESAP MAKİNESİNE HOŞGELDİNİZ ");
            
            while(true){
                System.out.println(giris);
                System.out.println("Lütfen işlem seçiniz : " );
                String y = i.nextLine();
                
             if ((y.equals("q"))||(y.equals("Q"))){
                 System.out.println("Programdan çıkılıyor : ");
                 break ;
                  }
             else if (y.equals("1")){
                 
                 System.out.println("kaç sayı ile işlem yapacaksınız (2 veya 3) ");
                 int sayı = i.nextInt();
                 if (sayı == 2){
                     System.out.println("birinci sayıyı giriniz : ");
                     int birinci = i.nextInt();
                     System.out.println("ikinci sayıyı giriniz : ");
                     int ikinci = i.nextInt();
                     System.out.println("TOPLAM = " + toplama(birinci,ikinci));
                    i.nextLine();
                 }
                 else if (sayı == 3){
                     System.out.println("birinci sayıyı giriniz : ");
                     int birinci = i.nextInt();
                     System.out.println("ikinci sayıyı giriniz : ");
                     int ikinci = i.nextInt();
                     System.out.println("üçüncü sayıyı giriniz : ");
                     int üçüncü = i.nextInt();
                     System.out.println("TOPLAM = " + toplama(birinci, ikinci, üçüncü));
                     i.nextLine();
                 }
                 
                 else {
                     
                     System.out.println("yanlış işlem girdiniz...");  
                 }
                              }
             
             else if (y.equals("2")){
                 System.out.println("kaç sayı ile işlem yapmak istediğiniz giriniz (2 veya 3 )");
                 int sayı = i.nextInt();
                 if (sayı == 2){
                     System.out.println("birinci sayıyı giriniz : ");
                     int birinci = i.nextInt();
                     System.out.println("ikinci sayıyı giriniz : ");
                     int ikinci = i.nextInt();
                     System.out.println("ÇIKAN = " + çıkarma(birinci,ikinci));
                               i.nextLine();      }
                 else if (sayı == 3){
                     System.out.println("birinci sayıyı giriniz : ");
                     int birinci = i.nextInt();
                     System.out.println("ikinci sayıyı giriniz : ");
                     int ikinci = i.nextInt();
                     System.out.println("üçüncü sayıyı giriniz : ");
                     int üçüncü = i.nextInt();
                     
                     System.out.println("ÇIKAN = " + çıkarma(birinci, ikinci, üçüncü));
                     i.nextLine();
                 }
                 else {
                     System.out.println("HATALI İŞLEM YAPTINIZ...!");
                 }
                         
                    }
                  else if (y.equals("3")){
                      System.out.println("kaç sayı ile işlem yapacağınızı seçiniz : (2 veya 3 )");
                      int sayı = i.nextInt();
                        if (sayı == 2){
                          System.out.println("birinci sayıyı giriniz : ");
                          int birinci = i.nextInt();
                          System.out.println("ikinci sayıyı giriniz : ");
                          int ikinci = i.nextInt();
                          System.out.println("ÇARPIM = " + çarpma(birinci, ikinci));
                          i.nextLine(); }
                      else if ( sayı == 3){
                          System.out.println("birinci sayıyı giriniz : ");
                          int birinci = i.nextInt();
                          System.out.println("ikinci sayıyı giriniz : ");
                          int ikinci = i.nextInt();
                          System.out.println("üçüncü sayıyı giriniz : ");
                          int üçüncü = i.nextInt();
                          System.out.println("ÇARPIM = " + çarpma(birinci, ikinci , üçüncü));
                          i.nextLine();
                      }
                      else {
                          System.out.println("Hatalı işlem yaptınız....!");
                          
                      }
             }
                  else if (y.equals("4")){
                      System.out.println("kaç sayı ile işlem yapacağınız seçiniz : (2 veya 3 )");
                      int sayı = i.nextInt();
                      if (sayı == 2){
                          System.out.println("birinci sayıyı giriniz : ");
                          int birinci = i.nextInt();
                          System.out.println("ikinci sayıyı giriniz : ");
                          int ikinci = i.nextInt();
                          System.out.println("BÖLÜM = " + bölme(birinci, ikinci));
                          i.nextLine(); }
                      else if (sayı == 3){
                          System.out.println("birinci sayıyı giriniz : ");
                          int birinci = i.nextInt();
                          System.out.println("ikinci sayıyı giriniz : ");
                          int ikinci = i.nextInt();
                          System.out.println("üçüncü sayıyı giriniz : ");
                          int üçüncü = i.nextInt();
                          System.out.println("BÖLÜM = " + bölme(birinci, ikinci,üçüncü));
                          i.nextLine();
                           }
                      else {
                          System.out.println("hatalı işlem yaptınız....!");
                          
                      }
                          }
                            
            
             else{
                      System.out.println("LÜTFEN GEÇERLİ İŞLEM SEÇİNİZ....!");
                         }
                   }
                }
    
                }
