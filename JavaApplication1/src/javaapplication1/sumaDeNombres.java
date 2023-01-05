/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

public class sumaDeNombres {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String nombre;
         String apellido;
       
        
        System.out.println("ingresar tu nombre");
        nombre = leer.nextLine();
        
        System.out.println("ingresa tu apellido");
        apellido = leer.nextLine();
                  
        String suma= nombre + apellido;
        int id;
        System.out.println("ingrese su id");
        id = leer.nextInt();
        
        System.out.println("Buenos dias " +  suma + " espero estes bien, " + suma + " tu id es " + id );
        
                
    }
    
}
