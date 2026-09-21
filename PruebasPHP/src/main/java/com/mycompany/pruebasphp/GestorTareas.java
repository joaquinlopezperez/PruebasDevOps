/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebasphp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daw2
 */
public class GestorTareas {
    
    private List tareas = new ArrayList<>();
    
    
    public void anadirTarea(int id, String nombre, String asignatura){
        
        Tarea t = new Tarea(id, nombre, asignatura);
        
        if(t == null){
            System.out.println("No se ha podido crear la tarea");
            
        }else{
            tareas.add(t);
            System.out.println("Se ha añadidola tarea correctamente");
        }

    }
    
    public void verTareas(){
        
        if(tareas.isEmpty()){
            System.out.println("No hay tareas");
        }else{
            System.out.println("Las tareas son las siguientes: ");
            tareas.toString();
        }
  
    }
    
    
    
    
    
}
