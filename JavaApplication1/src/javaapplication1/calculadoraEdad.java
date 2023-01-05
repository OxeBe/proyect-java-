/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author hcombita
 */
public class calculadoraEdad {
    public static void main(String[] args) {
          Scanner leer = new Scanner (System.in);
          int a;
          int b;
          
          System.out.println("Ingrese tu año dde nacimiento");
          a = leer.nextInt();
          
          System.out.println("Ingrese el año actual");
          b = leer.nextInt();
          
          int resta = b - a;
          
          System.out.println("tu edad es " + resta);
          
          
        
        
    }
    
}
