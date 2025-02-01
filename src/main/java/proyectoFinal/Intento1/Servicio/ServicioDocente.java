/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoFinal.Intento1.Servicio;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyectoFinal.Intento1.Entidad.Docente;
import proyectoFinal.Intento1.Repositorio.RepositorioDocente;

/**
 *
 * @author Axell
 */
@Service
public class ServicioDocente {
    @Autowired
    RepositorioDocente rDocente;
    
    public List <Docente> ObtenerTodos(){
        return rDocente.findAll();
    }
    public List <Docente> obtenerDocenteConNombre(String nombre) {

        return rDocente.obtenerDocenteConNombre(nombre);
    }
    
    public boolean insertarDocente(Docente a) {
        boolean respuesta = false;

        try {
            rDocente.save(a);
            respuesta = true;
        } catch (Exception e) {
            respuesta = false;
        }
        return respuesta;
    }
    
    public Docente obtenerUno(String id) {
        String id2 = null;
        Optional<Docente> Cliente = rDocente.findById(id);
        if (Cliente.isEmpty()) {
            return null;
        } else {
            return Cliente.get();
        }
    }
    
    public boolean actualizarDocente(Docente a) {
        boolean respuesta;
        Docente DocenteBuscado = obtenerUno(a.getRFC());
        if (DocenteBuscado == null) {
            respuesta = false;
        } else {
            try {
                rDocente.save(a);
                respuesta = true;
            } catch (Exception e) {
                respuesta = false;
            }
        }
        return respuesta;
    }

    public boolean eliminarDocente(Docente a) {
        boolean respuesta = false;
        try {
            rDocente.delete(a);
            respuesta = true;
        } catch (Exception e) {
            respuesta = false;
        }
        return respuesta;
    }
}
