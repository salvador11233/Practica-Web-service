package mx.edu.itspa.service;

import java.util.List;

import mx.edu.itspa.dao.AlumnoDAO;
import mx.edu.itspa.dto.Alumno;
import mx.edu.itspa.general.DAOException;

public class AlumnoServiceImplement implements AlumnoService {

	@Override
	public Alumno[] getAlumnos() {
		List<Alumno> alumnos = null;
		try {
			alumnos = new AlumnoDAO().obtenerTodos();
		}catch(DAOException e) {
			e.printStackTrace();
		}
		return alumnos.toArray(new Alumno[alumnos.size()]);
	}

}
