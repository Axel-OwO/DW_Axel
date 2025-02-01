/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoFinal.Intento1.Controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proyectoFinal.Intento1.Entidad.Usuario;
import proyectoFinal.Intento1.Servicio.ServicioUsuario;


@RestController
@RequestMapping("/Usuario")
public class ContrladorUsuario {
    @Autowired
    ServicioUsuario sUsuario;
    
    @GetMapping("/")
    public List <Usuario> consultar(){
        return sUsuario.ObtenerTodos();
    }
    
    
    
    @PostMapping("")
    public List<Usuario> insertarUsuario(@RequestBody Usuario a){
        if (sUsuario.insertarUsuario(a)){
            return sUsuario.ObtenerTodos();
        }else{
            return null;
        }
    }
     @PutMapping("")
    public List<Usuario> actualizarUsuario(@RequestBody Usuario a){
        if(sUsuario.actualizarUsuario(a)){
           return sUsuario.ObtenerTodos();
        }else{
            return null;
        }
    }
    
    @DeleteMapping("")
    public List<Usuario> eliminarUsuario(@RequestBody Usuario a){
        if(sUsuario.eliminarUsuario(a)){
           return sUsuario.ObtenerTodos();
        }else{
            return null;
        }
    }
}
