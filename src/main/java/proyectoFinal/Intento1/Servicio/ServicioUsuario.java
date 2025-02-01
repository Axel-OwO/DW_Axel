/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoFinal.Intento1.Servicio;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyectoFinal.Intento1.Entidad.Usuario;
import proyectoFinal.Intento1.Repositorio.RepositorioUsuario;

@Service
public class ServicioUsuario {
    @Autowired
    RepositorioUsuario rUsuario;
    
    public boolean insertarUsuario(Usuario a) {
        boolean respuesta = false;

        try {
            rUsuario.save(a);
            respuesta = true;
        } catch (Exception e) {
            respuesta = false;
        }
        return respuesta;
    }
    
    public Usuario obtenerUno(String id) {
        String id2 = null;
        Optional<Usuario> Cliente = rUsuario.findById(id);
        if (Cliente.isEmpty()) {
            return null;
        } else {
            return Cliente.get();
        }
    }
    
    public boolean actualizarUsuario(Usuario a) {
        boolean respuesta;
        Usuario UsuarioBuscado = obtenerUno(a.getUsuario());
        if (UsuarioBuscado == null) {
            respuesta = false;
        } else {
            try {
                rUsuario.save(a);
                respuesta = true;
            } catch (Exception e) {
                respuesta = false;
            }
        }
        return respuesta;
    }

    public boolean eliminarUsuario(Usuario a) {
        boolean respuesta = false;
        try {
            rUsuario.delete(a);
            respuesta = true;
        } catch (Exception e) {
            respuesta = false;
        }
        return respuesta;
    }
    
    public List <Usuario> ObtenerTodos(){
        return rUsuario.findAll();
    }
    
    public String existeUser(String usuario, String contra){
        return rUsuario.existeUser(usuario, contra);
    }
    
    
}
