package acceso.myshop.repositories;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import acceso.myshop.models.Juego;

public interface JuegoRepositorio extends JpaRepository<Juego, Long> { 
	
	   List<Juego> findAll();
	   Set<Juego> findByNombre(String nombre);
	   Set<Juego> findByGenero(String genero);


}