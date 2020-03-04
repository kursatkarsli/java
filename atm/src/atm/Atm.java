/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.Scanner;

/**
 *
 * @author kursa
 */
public class Atm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner i = new Scanner(System.in);
        
              int bakiye = 1000 ;
              double dolar = 6.02;
                     String a = "1. işlem  = Bakiye öğrenme\n"+
                                "2. işlem = Para çekme \n"+
                                 "3.işlem = para yatırma  \n"+
                                 "4. İşlem  = Döviz alma \n"+
                                 "5. işlem = kredi çekme \n"+
                                   "Çıkış yapmak için q'ya basınız ";
        
        
        
              while ( true){
                  System.out.println(a);
        System.out.print("Lütfen işlem seçiniz : ");
         String b = i.nextLine();                  
              if (b.equals("q") || b.equals("Q") ) {
                  
                  System.out.println("Programdan çıkılıyor");
                  
                  break ; 
              } 
                  else if (b.equals("1")){
                      
                  System.out.println("BAKİYENİZ : " + bakiye + "\n");
                         }
                                else if (b.equals("2")){
                                    System.out.println("para çekilecek mikatarı giriniz : ");
                                    int tutar = i.nextInt();
                                    i.nextLine();
                                    if (bakiye - tutar < 0 ){
                                        System.out.println("yetersiz bakiye : " + "bakiyeniz : " + bakiye);
                                          }
                                    else {
                                        bakiye -= tutar ; 
                                        System.out.println("PARA ÇEKME İŞLEMİNİZ GERÇEKLEŞMİŞTİR \n" + "Yeni bakiyeniz : " + bakiye + "\n");
                                        
                                    }
                                    }
                                else if (b.equals("3")){
                                       System.out.println("Yatırılacak miktarı giriniz : ");
                                       int p = i.nextInt();
                                       i.nextLine();
                                       bakiye += p ;
                                       System.out.println("Para yatırma işleminiz gerçekleşmiştir \n " + "yeni bakiyeniz : " + bakiye );
                                       
                                }
                                else if (b.equals("4")){
                                    System.out.println("güncel dolar oranı = " + dolar );
                                    System.out.println("Satın almak istediğiniz tutarı TL cinsinden giriniz = ");
                                    int miktar = i.nextInt();
                                    i.nextLine();
                                    
                                     if (bakiye - miktar <=0 ){
                                        System.out.println("satın almak için yetersiz bakiye" + "\n geçerli miktar giriniz");
                                                 
                                                 
                                       
                                    }
                                    
                                    else {
                                        System.out.println("satın alma işleminiz gerçekleşmiştir");
                                        bakiye -= miktar ;
                                        System.out.println("güncel bakiyeniz " + bakiye );
                                        
                                       double kkk = miktar ;
                                       
                                       
                                       
                                                
                                      kkk = (double)(miktar * dolar);
                                      
                                        
                                        System.out.println("dolar hesabınız : " + kkk);
                                    }    
                                    }
                                    
                                
                                else if (b.equals("5")){
                                    System.out.println("ne kadar kredi çekmek istersiniz :  ");
                                    
                                    int miktar = i.nextInt();
                                    i.nextLine();
                                    
                                    if (miktar >( bakiye *= 50)){
                                        
                                        System.out.println("üzgünüz Bakiyenizin 50 katına kadar kredi verebiliriz \n"+ 
                                                "lütfen geçerli aralıklarda bir değer giriniz ");
                                                                  
                                    }
                                    
                                    else {
                                        System.out.println("Krediniz hesabınıza tanımlanmıştır ");
                                        bakiye /= 50;
                                   bakiye += miktar;
                                            System.out.println("Yeni bakiyeni = " + bakiye );
                                            
                                    }
                                        
                                    }
              
                                
              else {
                   System.out.println("yanlış işlem seçtiniz ");
                      }
              }
              }
         }
   
