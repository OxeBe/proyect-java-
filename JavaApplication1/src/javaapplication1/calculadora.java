package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author hcombita
 */


public class calculadora {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); //importamos escaner
        
        int a;
        int b;
        
        
        System.out.println("ingrese el valor de a");
        a = leer.nextInt();
        
        System.out.println("ingrese el valor de b");
        b = leer.nextInt();
        
        int suma = a + b;
        
        System.out.println("la suma de "+a+ " + "+ b+ " = "+suma);
        
        
    }
    
}
