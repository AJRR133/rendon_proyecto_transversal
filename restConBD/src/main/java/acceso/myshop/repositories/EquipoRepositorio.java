package acceso.myshop.repositories;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import acceso.myshop.models.Equipo;


public interface EquipoRepositorio extends JpaRepository<Equipo, Long> { 
	
	   List<Equipo> findAll();
	   Set<Equipo> findByNombre(String nombre);
	   Set<Equipo> findByRegion(String region);


}
