/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.aragon.fes;

/**
 *
 * @author Administrador
 */
public class UsaPersona {
    public static void main(String[] args) {
        System.out.println("Programa usar persona");
        Persona per1 = new Persona();
        Persona per2 = new Persona();
        System.out.println(per1.getNombre());
        
        per2.setNombre("Adamari");
        System.out.println(per2.getNombre());
        
        System.out.println( per2.toString());
    }
         
    
}    
        
       