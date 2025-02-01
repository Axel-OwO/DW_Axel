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
import proyectoFinal.Intento1.Entidad.Docente;
import proyectoFinal.Intento1.Servicio.ServicioDocente;

/**
 *
 * @author Axell
 */
@RestController
@RequestMapping("/Docente")
public class ControladorDocente {
    @Autowired
    ServicioDocente sDocente;
    
    @GetMapping("/")
    public List <Docente> consultar(){
        return sDocente.ObtenerTodos();
    }
    @GetMapping("/Nombre")
    public List <Docente> consultarNombre(String nombre){
        return sDocente.obtenerDocenteConNombre(nombre);
    }
    
    @PostMapping("")
    public List<Docente> insertarDocente(@RequestBody Docente a){
        if (sDocente.insertarDocente(a)){
            return sDocente.ObtenerTodos();
        }else{
            return null;
        }
    }
     @PutMapping("")
    public List<Docente> actualizarDocente(@RequestBody Docente a){
        if(sDocente.actualizarDocente(a)){
           return sDocente.ObtenerTodos();
        }else{
            return null;
        }
    }
    
    @DeleteMapping("")
    public List<Docente> eliminarDocente(@RequestBody Docente a){
        if(sDocente.eliminarDocente(a)){
           return sDocente.ObtenerTodos();
        }else{
            return null;
        }
    }
}
