package mx.edu.itspa.service;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import mx.edu.itspa.dto.Alumno;

@WebService
public interface AlumnoService {
	@WebMethod(operationName = "getAlumnos")
	@WebResult(name="ResultadoOperacion") Alumno[] getAlumnos();
}
