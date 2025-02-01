/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoFinal.Intento1.Entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 *
 * @author Axell
 */
@Entity
public class Docente {
 @Id
 private String RFC;
 
 private String Nombre;
 private String Apellido;
 private char Genero;
 private String GradoEstudio;
 private String Celular;
 private String Telefono;
 private String Correo;
 private float Pago;

    public Docente() {
    }

    public Docente(String RFC, String Nombre, String Apellido, char Genero, String GradoEstudio, String Celular, String Telefono, String Correo, float Pago) {
        this.RFC = RFC;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Genero = Genero;
        this.GradoEstudio = GradoEstudio;
        this.Celular = Celular;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.Pago = Pago;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public char getGenero() {
        return Genero;
    }

    public void setGenero(char Genero) {
        this.Genero = Genero;
    }

    public String getGradoEstudio() {
        return GradoEstudio;
    }

    public void setGradoEstudio(String GradoEstudio) {
        this.GradoEstudio = GradoEstudio;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public float getPago() {
        return Pago;
    }

    public void setPago(float pago) {
        this.Pago = pago;
    }
 
 
 
}
