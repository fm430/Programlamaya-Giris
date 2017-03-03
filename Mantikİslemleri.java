package MantikIslemleri;

import java.util.Scanner;

public class Mantikislemleri {

    
    public static void main(String[] args) {
        
        Scanner c = new Scanner(System.in);
		System.out.println("Bir sayı giriniz:");
		int a = c.nextInt();
		System.out.println("İkinci sayı giriniz:");
		int b = c.nextInt();
		
		if (a==b){
			System.out.println("sayılar eşittir.");	
		}
                else {
                        System.out.println("sayılar eşit değildir");
                }
                if (a!=b){
                        System.out.println("sayılar farklıdır");
                }
                else{
                        System.out.println("sayılar farklı değildir.");
                }
                if (a<b){
                        System.out.println("ilk sayı küçüktür");
                }
                else 
                {
                        System.out.println("ilk sayı küçük değildir");
                }
                if (a>b){
                        System.out.println("ikinci sayı küçüktür");
                }
                else{
                        System.out.println("ikinci sayı küçük değildir.");
                        
                }
                if (a<=b){
                        System.out.println("ilk sayı küçük eşittir");
                       
                }
                else {
                        System.out.println("ilk sayı küçük eşittir");
                }
                if (a>=b) {
                        System.out.println("ikinci sayı küçük eşittir");
                }
                else {
                        System.out.println("ikinci sayı küçük eşittir");
                }
                }
    }
