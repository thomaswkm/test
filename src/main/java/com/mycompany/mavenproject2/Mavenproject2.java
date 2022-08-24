
package com.mycompany.mavenproject2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Mavenproject2 {
    static Scanner teclado = new Scanner(System.in);
    
    public static void elegirNumero(){
        

    int validacion = 0;
    System.out.println("Introduce un numero: ");
    int numero = teclado.nextInt();
    do{
        if(0<= numero && numero <= 255){
        validacion++;
        }
        
       
    }while(validacion==1);
        
    }
         
    
    public static ArrayList<Integer> calcularBinario(int nroDecimal) {
        
        ArrayList<Integer> resto = new ArrayList<>();
        
        do {
            resto.add((nroDecimal % 2));
            nroDecimal = (nroDecimal/2);
        } while (nroDecimal>0);
        
        Collections.reverse(resto);
        
        return resto;
    }
    
    public static void devolverBinario(ArrayList<Integer> resto) {
        
        for (int i = 0; i < resto.size(); i++) {
            System.out.print(resto.get(i));
        }
        
    }
    
    public static void main(String[] args) {
        
        System.out.println("Introduce un numero decimal");
        Scanner teclado = new Scanner(System.in);
        
        int nroDecimal = teclado.nextInt();
        
        devolverBinario(calcularBinario(nroDecimal));
        
       
    }
}
