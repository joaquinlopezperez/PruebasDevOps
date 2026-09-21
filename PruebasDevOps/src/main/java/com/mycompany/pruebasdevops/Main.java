/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.pruebasdevops;

import java.util.Scanner;

/**
 *
 * @author daw2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion= 0;
        
        Scanner entrada = new Scanner(System.in);
        
        do{
            
            System.out.println("=== MENU ===");
            System.out.println("1. Añadir tarea");
            System.out.println("2. Leer tareas");
            System.out.println("3. Eliminar tareas");
            System.out.println("4. Salir");
            System.out.println("Introduce un numero para elegir: ");
            
            opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1:
                    
                    System.out.println("Introduce el nombre de la tarea: ");
                    String nombre = entrada.nextLine();
                    
                    entrada.nextLine();
                    
                    System.out.println("Introduce la asignatura: ");
                    String asignatura = entrada.nextLine();
                    
                    GestorTareas.anadirTarea(nombre, asignatura);
                    break;
                case 2:
                    
                    GestorTareas.verTareas();
                    break;
                        
                case 3:
                    
                    GestorTareas.borrarTareas();
                    break;
                    
                case 4:
                    System.out.println("Saliendo...");
                    break;
                    
            }
            
            
            
            
        }while(opcion != 4);
        
        
        
        
        
    }
    
    
}
