/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico7.velazquez.entidades;

import java.util.HashSet;
import javax.swing.JOptionPane;
/**
 *
 * @author Ulp
 */
public class Alumno {
    int legajo;
    String apellido;
    String nombre;
    HashSet<Materia> materias = new HashSet<>();

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        
    }

    
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarMaterias(Materia m){
        if(materias.add(m) == false){
                
            JOptionPane.showMessageDialog(null,"El alumno ya esta registrado en esa materia" );
        }
        else { JOptionPane.showMessageDialog(null, "Alumno Inscripto");
    } 
        //System.out.println(materias.add(m));
    }
    public int  cantidadMaterias(){
        return  materias.size();
    }

    @Override
    public String toString() {
        return  nombre + " " + apellido;
    }
 
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.legajo;
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.legajo != other.legajo) {
            return false;
        }
        return true;
    }
    
}
