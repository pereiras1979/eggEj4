/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggej4;

/**
 *
 * @author cazad
 */
public class claseSeba {
    private String nombre;
    private String apellido;
    private Long edad;

    public claseSeba() {
    }

    public claseSeba(String nombre, String apellido, Long edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getEdad() {
        return edad;
    }

    public void setEdad(Long edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "claseSeba{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }
    
    
    
}
