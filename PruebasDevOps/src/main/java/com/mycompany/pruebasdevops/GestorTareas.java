/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebasdevops;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author daw2
 */
public class GestorTareas {
    
    private static List tareas = new ArrayList<>();
    
    
    public static void anadirTarea(String nombre, String asignatura){
        
        Tarea t = new Tarea(nombre, asignatura);
        
        if(t == null){
            System.out.println("No se ha podido crear la tarea");
            
        }else{
            tareas.add(t);
            System.out.println("Se ha añadido la tarea correctamente");
        }

    }
    
    public static void verTareas(){
        
        if(tareas.isEmpty()){
            System.out.println("No hay tareas");
        }else{
            System.out.println("Las tareas son las siguientes: ");
            System.out.println(tareas.toString());
        }
  
    }
    
    public static void borrarTareas(){
        
        if(tareas.isEmpty()){
            System.out.println("No hay tareas");
        }else{
            System.out.println("Las tareas son las siguientes: ");
            tareas.toString();
            System.out.println("Introduce el nombre de la tarea para borrar: ");
            
            
   
        }
  
    }
    
    
    
    
    
}
