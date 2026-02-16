package acceso.myshop.services;

import java.util.List;
import java.util.Set;

import acceso.myshop.models.Equipo;

public interface EquipoService {

	 List<Equipo> findAll();
	 Set<Equipo> findByNombre(String nombre);
	 Set<Equipo> findByRegion(String region);
	 public Equipo createEquipo(Equipo equipo);
	 public Equipo deleteEquipo(Equipo equipo);
	 public Equipo updateregionEquipo(long id, Equipo equipo);
	 
}
