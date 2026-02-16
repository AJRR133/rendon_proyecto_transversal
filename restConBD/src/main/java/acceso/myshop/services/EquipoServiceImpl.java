package acceso.myshop.services;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acceso.myshop.models.Equipo;
import acceso.myshop.repositories.EquipoRepositorio;

@Service
public class EquipoServiceImpl implements EquipoService {

	@Autowired
	private EquipoRepositorio repoequipo; 
	
	@Override
	public List<Equipo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Equipo> findByNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Equipo> findByRegion(String region) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Equipo createEquipo(Equipo equipo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Equipo deleteEquipo(Equipo equipo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Equipo updateregionEquipo(long id, Equipo equipo) {
		// TODO Auto-generated method stub
		return null;
	}

}
