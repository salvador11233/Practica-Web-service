package mx.edu.itspa.dto;

public class Alumno {
	
	private Integer matricula = null;
	private Integer carrera;
	private Integer semestre;
	private Integer persona_id;
	
	public Integer getMatricula() {
		return matricula;
	}
	
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	
	public Integer getCarrera() {
		return carrera;
	}
	
	public void setCarrera(Integer carrera) {
		this.carrera = carrera;
	}
	
	public Integer getSemestre() {
		return semestre;
	}
	
	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}
	
	public Integer getPersona_id() {
		return persona_id;
	}
	
	public void setPersona_id(Integer persona_id) {
		this.persona_id = persona_id;
	}
}
