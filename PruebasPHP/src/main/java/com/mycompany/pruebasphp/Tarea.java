/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebasphp;

/**
 *
 * @author daw2
 */
public class Tarea {
    
    
    private int id;
    private String nombre;
    private String asignatura;

    public Tarea(int id, String nombre, String asignatura) {
        this.id = id;
        this.nombre = nombre;
        this.asignatura = asignatura;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tarea -> ");
        sb.append("Id: ").append(id);
        sb.append(", Nombre: ").append(nombre);
        sb.append(", Asignatura: ").append(asignatura);
        return sb.toString();
    }
    
    
    
    
    
    
    
}
