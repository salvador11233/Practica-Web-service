package mx.edu.itspa.general;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
	private static final String HOST="localhost";
    private static final String USER="root";
    private static final String PASSW="";
    private static final String BD="pruebap";
    // AHORA VAMOS A CREAR UNA FUNCION MEJOR
    public static Connection obtenerConexion() {//throws SQLException
        Connection conn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } 
        catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
		try {
			conn = DriverManager.getConnection("jdbc:mysql://"+HOST+"/"+BD, USER, PASSW);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}        
        return conn;
    }
}