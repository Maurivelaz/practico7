/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico7.velazquez;
import practico7.velazquez.entidades.*;
import practico7.velazquez.vistas.*;
/**
 *
 * @author Ulp
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno a1 =new Alumno(1,"Martin","Lopez");
        Alumno a2 =new Alumno(1,"Brenda","Martinez");
        Materia m1 = new Materia(1,"Ingles 1",1);
        Materia m2 = new Materia(2,"Matematicas ",1);
        Materia m3 = new Materia(3,"lab 1",1);
        
        a1.agregarMaterias(m1);
        a1.agregarMaterias(m2);
        a1.agregarMaterias(m3);
        
        a2.agregarMaterias(m1);
        a2.agregarMaterias(m2);
        a2.agregarMaterias(m3);
        a2.agregarMaterias(m1);
        
        System.out.println(a1.cantidadMaterias());
        System.out.println(a2.cantidadMaterias());
        
        
    }
    
}
