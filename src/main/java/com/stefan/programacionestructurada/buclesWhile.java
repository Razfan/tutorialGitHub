/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stefan.programacionestructurada;

import java.util.Scanner;

/**
 *
 * @author Dark_
 */
public class buclesWhile {
    //Matroska
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero del menu: ");
        int var = sc.nextInt();
        
        switch (var) {
            case 1: {
                numero10al20();
            }
            break;
            case 2: {
               numerosImpares();
            }
            break;
            case 3: {
                numerosPares();
            }
            break;
            case 4: {
                numerosParesOImpares();
            }
            break;
            case 5: {
                multiplicar();
            }
            break;
            case 6: {
                dosNumeros();
            }
            break;
            case 7: {
                dosNumerosPrimero();
            }
            break;
            case 8: {
                imparoPar();
            }
            break;
            case 9: {
                sumaPar();
            }
            break;
        }
    }
    
    static void numero10al20(){
        int num = 10;
        while (num < 21) {
            System.out.println(num);            
            num++;
        }
        
    }
    
    static void numerosImpares(){
        int num = 1;
        while (num < 11){
            if(num%2==0){
            }else{
                System.out.println(num);
            }
            num++;
        }
    }
    
    static void numerosPares(){
        int num = 1;
        while(num < 11){
            if(num%2==0){
                System.out.println(num);
            }else{
                
            }
            num++;
        }
    }
    
    static void numerosParesOImpares(){
        int num = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Pares/Impares: ");
        String var = sc.nextLine().toLowerCase();
        while(num < 11){
            if(num%2==0 && var.equals("pares")){
                System.out.println(num);
            }else if(num%2!=0 && var.equals("impares")){
                System.out.println(num);
            }
            num++;
        }
    }
    
    static void multiplicar(){
        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int aux = sc.nextInt();
        while(num < 11){
            int resu = aux*num;
            System.out.println(resu);
            num++;
        }
    }
    
    static void dosNumeros(){
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Introduzca un numero: ");
        a = sc.nextInt();
        System.out.println("Introduzca un numero: ");
        b = sc.nextInt();
        
        if (a > b) {
            while (a > b) {
                System.out.println("El segundo numero tiene que ser mas grande: ");
                b = sc.nextInt();
            }
            
            int aux = a;
            while (aux!=b) {
                System.out.println(aux);
                aux++;
            }
            System.out.println(b);
        }  
    }
    
    static void dosNumerosPrimero(){
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Introduzca un numero: ");
        a = sc.nextInt();
        System.out.println("Introduzca un numero: ");
        b = sc.nextInt();
        
        if(a>b){
            int aux = a;
            while (aux!=b) {
                System.out.println(aux);
                aux--;
            }
            System.out.println(b);
        }else if(a<b){
            int aux = a;
            while (aux!=b) {
                System.out.println(aux);
                aux++;
            }
            System.out.println(b);
        }
    }
    
    static void imparoPar(){
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Introduzca un numero: ");
        a = sc.nextInt();
        System.out.println("Introduzca un numero: ");
        b = sc.nextInt();
        
        if(a>b){
            int aux = a;
            while(aux!=b){
                if(aux%2!=0){
                    System.out.println(aux);
                }
                aux--;
            }
            if(b%2!=0){
                System.out.println(b);
            }
        }else{
            int aux = a;
            while(aux!=b){
                if(aux%2!=0){
                    System.out.println(aux);
                }
                aux++;
            }
            if(b%2!=0){
              System.out.println(b);
            }
        }
    }
    
    static void sumaPar(){
        int a = 0;
        int aux = 0;
        while(a<1000){
            
        a++;
            if(a%2==0){
                aux = aux + a;
            }
        }
        System.out.println(aux);
    }
    
    
    
}
