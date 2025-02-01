/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoFinal.Intento1.Entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Usuario {
    @Id
    private String usuario;
    private String contra;
    private String tipo;

    public Usuario() {
    }

    public Usuario(String usuario, String contra, String tipo) {
        this.usuario = usuario;
        this.contra = contra;
        this.tipo = tipo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
}
