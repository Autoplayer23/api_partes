package backend.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.spring.model.Parte;

@Service
public class ParteService {
	
	@Autowired
	private ParteRepository parterepository;

	public void Guardar(Parte parte) {
		parterepository.save(parte);
	}
	
	public List<Parte> Obtener(){
		return parterepository.findAll();
	}

	
	public Parte Obtenerparte(Integer id) {
		
		return parterepository.getOne(id);
	}
	
	public void actualizar (Parte parte) {
		parterepository.save(parte);
	}
	
	public void eliminar (Integer id) {
		
		parterepository.deleteById(id);
	}
}
