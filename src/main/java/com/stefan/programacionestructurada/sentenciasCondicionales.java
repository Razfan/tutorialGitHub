/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templatesaaaa
 * and open the template in the editor.aaaa
 */
package com.stefan.programacionestructurada;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Dark_
 */
public class sentenciasCondicionales {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero del menu: ");
        int var = sc.nextInt();
        
        switch (var) {
            case 1: {
//                numeroTeclado();
                  
            }
            break;
            case 2: {
                anoBisiesto();
            }
            break;
            case 4: {
                ordenar();
            }
            break;
            case 5: {
                ordenadarConsecutivo();
            }
            break;
            case 6: {
                numeroCifra();
            }
            break;
            case 7: {
                numeroMayorMenor();
            }
            break;
        }
               
    }
    
    static void numeroTeclado(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int a = sc.nextInt();
        System.out.println("Introduce un numero: ");
        int b = sc.nextInt();
        
        if(a>b){
            System.out.println(a-b);
        }else{
            System.out.println(b-a);
        }
        
    }
    
    static void anoBisiesto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un año: ");
        int a = sc.nextInt();
        
        if(a%4==0){
            System.out.println("Es bisiesto");
        }else{
            System.out.println("No es bisiesto");
        }
    }
    
    static void ordenar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int a = sc.nextInt();
        System.out.println("Introduce un numero: ");
        int b = sc.nextInt();
        System.out.println("Introduce un numero: ");
        int c = sc.nextInt();
        
        if(a<b && b<c && a<c){
            System.out.println(a + "" + b + "" + c);
            System.out.println("Estan ordenados");
        }else{
            System.out.println(a + "" + b + "" + c);
            System.out.println("No estan ordenados");
        }
        
    }
    
    static void ordenadarConsecutivo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int a = sc.nextInt();
        System.out.println("Introduce un numero: ");
        int b = sc.nextInt();
        System.out.println("Introduce un numero: ");
        int c = sc.nextInt();
        
        if(a<b && b<c && a<c){
            if(b == a+1 && c==b+1){
                System.out.println(a + "" + b + "" + c);
                System.out.println("Estan ordenados consecutivamente");
            }
            
        }else{
            System.out.println(a + "" + b + "" + c);
            System.out.println("No estan ordenados");
        }
    }
    
    static void numeroCifra(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int a = sc.nextInt();
        if(a>=0 && a<=9 || a<=-1 && a>=-9){
            System.out.println("1");
        }else if(a>9 && a<=99 || a<-9 && a>=-99){
            System.out.println("2");
        }else if(a>99 && a<=999 || a<-99 && a>=-999){
            System.out.println("3");
        }else if(a>999 && a<=9999 || a<-999 && a>=-9999){
            System.out.println("4");
        }
    }
    
    static void numeroMayorMenor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int a = sc.nextInt();
        System.out.println("Introduce un numero: ");
        int b = sc.nextInt();
        System.out.println("Introduce un numero: ");
        int c = sc.nextInt();
        
        if (a > b && b > c) {
            System.out.println("El numero mayor es: " + a
                    + "El numero medianos es: " + b
                    + "El numero menor es: " + c);
        } else if (a > b && b < c) {
            System.out.println("El numero mayor es: " + a
                    + "El numero medianos es: " + c
                    + "El numero menor es: " + b);
        } else if (a < b && a > c) {
            System.out.println("El numero mayor es: " + b
                    + "El numero medianos es: " + a
                    + "El numero menor es: " + c);
        }else if (a < b && a < c) {
            System.out.println("El numero mayor es: " + b
                    + "El numero medianos es: " + c
                    + "El numero menor es: " + a);
        } else if (c > a && a < b) {
            System.out.println("El numero mayor es: " + c
                    + "El numero medianos es: " + b
                    + "El numero menor es: " + a);
        } else if (c > a && a > b) {
            System.out.println("El numero mayor es: " + c
                    + "El numero medianos es: " + a
                    + "El numero menor es: " + b);
        }
    }
    
    
    
}
