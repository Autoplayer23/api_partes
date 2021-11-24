package backend.spring.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import backend.spring.model.Parte;

@RestController
@CrossOrigin(origins="*")
public class ParteController {
	
	@Autowired
	private ParteService parteservice;
	
	
	@PostMapping("api/partes")
	public Parte  guardar (@RequestBody Parte parte ) {
		System.out.println(parte);
		parteservice.Guardar(parte);
		return parte;
	}
	
	@GetMapping("api/partes")
	public List<Parte> Obtener(){
		return parteservice.Obtener();
	}
	
	@GetMapping("api/partes/{id}")
	public Parte ObtenerParte(@PathVariable("id") Integer id) {
		return parteservice.Obtenerparte(id);
	}
	@PutMapping("api/partes")
	public void actualizar(@RequestBody Parte parte) {
		
		parteservice.actualizar(parte);
	}
	
	@DeleteMapping("api/partes/{id}")
	public void eliminar(@PathVariable("id") Integer id){
		parteservice.eliminar(id);
	}
	
}
