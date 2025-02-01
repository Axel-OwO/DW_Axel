/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package proyectoFinal.Intento1.Repositorio;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import proyectoFinal.Intento1.Entidad.Docente;

/**
 *
 * @author Axell
 */
@Repository
public interface RepositorioDocente extends JpaRepository<Docente,String>{
    @Query(value="select * from docente where nombre like %?1%",nativeQuery=true)
    List<Docente> obtenerDocenteConNombre(String nombre);
}
