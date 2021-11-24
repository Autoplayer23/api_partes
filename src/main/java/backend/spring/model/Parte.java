package backend.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Partes")
@JsonIgnoreProperties({"hibernateLazyInitializer", "Handler"})
public class Parte {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String parte;
	private String nombre_domonio;
	private String resultado_batalla;
	
	public Parte() {
		
	}

	

	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getParte() {
		return parte;
	}

	public void setParte(String parte) {
		this.parte = parte;
	}

	public String getNombre_domonio() {
		return nombre_domonio;
	}

	public void setNombre_domonio(String nombre_domonio) {
		this.nombre_domonio = nombre_domonio;
	}

	public String getResultado_batalla() {
		return resultado_batalla;
	}

	public void setResultado_batalla(String resultado_batalla) {
		this.resultado_batalla = resultado_batalla;
	}

	@Override
	public String toString() {
		return "Parte [id=" + id + ", parte=" + parte + ", nombre_domonio=" + nombre_domonio + ", resultado_batalla="
				+ resultado_batalla + "]";
	}

	
	
	

}
