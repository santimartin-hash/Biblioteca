package Clases;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorBBDD extends Connector{
	
public void insertarLibro(Libro libro) throws SQLException {
	
	PreparedStatement preparedSt = con.prepareStatement("INSERT INTO libros ( id, titulo, autor, num_pag) VALUES (?,?,?,?);");
	preparedSt.setInt(1, libro.getId());
	preparedSt.setString(2, libro.getTitulo());
	preparedSt.setString(3, libro.getAutor());
	preparedSt.setInt(4, libro.getNum_pag());
	preparedSt.execute();
}
public void eliminarLibro(int id) throws SQLException {
	

	
	PreparedStatement preparedSt = con.prepareStatement("DELETE FROM libros WHERE id = ? ;");
	preparedSt.setInt(1, id);
	preparedSt.execute();
}

	
public Libro getLibro (int id) throws SQLException {

	PreparedStatement preparedSt = con.prepareStatement("SELECT * FROM libros WHERE id = ? ");
	
	Libro libro = new Libro();
	
	preparedSt.setInt(1, libro.getId());
	ResultSet resultado = preparedSt.executeQuery();
	
	if (resultado.next()) {
	libro.setId(resultado.getInt("id"));
	libro.setTitulo(resultado.getString("titulo"));
	libro.setAutor(resultado.getString("autor"));
	libro.setNum_pag(resultado.getInt("num_pag"));
	}
	return libro;
	}Libro libro = new Libro();

public ArrayList<Libro> getLibros () throws SQLException {
   
	ArrayList<Libro> libros = new ArrayList<>();
	
	PreparedStatement preparedSt = con.prepareStatement("SELECT * FROM libros");
	ResultSet resultado = preparedSt.executeQuery();
	
	while (resultado.next()) {
	Libro libro = new Libro();
	libro.setId(resultado.getInt("id"));
	libro.setTitulo(resultado.getString("titulo"));
	libro.setAutor(resultado.getString("autor"));
	libro.setNum_pag(resultado.getInt("num_pag"));
	libros.add(libro);
	}
	return libros;
}


public void mdificarLibro(Libro libro) throws SQLException {

	PreparedStatement preparedStModify = con.prepareStatement("UPDATE libros SET titulo= (?),autor= (?),num_pag= (?) WHERE id = (?);");
	
	preparedStModify.setInt(4, libro.getId());
	preparedStModify.setString(1, libro.getTitulo());
	preparedStModify.setString(2, libro.getAutor());
	preparedStModify.setInt(3, libro.getNum_pag());
	
	preparedStModify.execute();
	}

public void insertarSocio(Socio socio) throws SQLException {
PreparedStatement preparedSt = con.prepareStatement("INSERT INTO socios ( id, nombre, apellido, direccion, poblacion, provincia, dni) VALUES (?,?,?,?,?,?,?);");

preparedSt.setInt(1, socio.getId());
preparedSt.setString(2, socio.getNombre());
preparedSt.setString(3, socio.getApellido());
preparedSt.setString(4, socio.getDireccion());
preparedSt.setString(5, socio.getPoblacion());
preparedSt.setString(6, socio.getProvincia());
preparedSt.setInt(7, socio.getDni());

preparedSt.execute();
}

public void eliminarSocio (int id) throws SQLException {

Socio socio = new Socio();

PreparedStatement preparedStel = con.prepareStatement("DELETE FROM socios WHERE id = ? ;");

preparedStel.setInt(1, id);
preparedStel.execute();
}

public void modificarSocio(Socio socio) throws SQLException {

PreparedStatement preparedStModify = con.prepareStatement("UPDATE socios SET nombre= (?),apellido= (?),direccion= (?),"
+ "poblacion = (?),provincia = (?), dni = (?) WHERE id = (?);");

preparedStModify.setInt(7, socio.getId());
preparedStModify.setString(1, socio.getNombre());
preparedStModify.setString(2, socio.getApellido());
preparedStModify.setString(3, socio.getDireccion());
preparedStModify.setString(4, socio.getPoblacion());
preparedStModify.setString(5, socio.getProvincia());
preparedStModify.setInt(6, socio.getDni());

preparedStModify.execute();
}

public Socio getSocio (int id) throws SQLException {

String sentenciaSelect = "SELECT * FROM socios WHERE id = ? ";
PreparedStatement preparedSt = con.prepareStatement(sentenciaSelect);

Socio socio = new Socio();

preparedSt.setInt(1, socio.getId());
ResultSet resultado = preparedSt.executeQuery();

if (resultado.next()) {
socio.setId(resultado.getInt("id"));
socio.setNombre(resultado.getNString("nombre"));
socio.setApellido(resultado.getNString("apellido"));
socio.setDireccion(resultado.getString("direccion"));
socio.setPoblacion(resultado.getNString("poblacion"));
socio.setProvincia(resultado.getNString("provincia"));
socio.setDni(resultado.getInt("dni"));
}

return socio;

}
public ArrayList<Socio> getSocios () throws SQLException {
	   
	ArrayList<Socio> socios = new ArrayList<>();
	
	PreparedStatement preparedSt = con.prepareStatement("SELECT * FROM socios");
	ResultSet resultado = preparedSt.executeQuery();
	
	while (resultado.next()) {
	Socio socio = new Socio();
	socio.setId(resultado.getInt("id"));
	socio.setNombre(resultado.getString("nombre"));
	socio.setApellido(resultado.getString("apellido"));
	socio.setDireccion(resultado.getString("direccion"));
	socio.setPoblacion(resultado.getString("poblacion"));
	socio.setProvincia(resultado.getString("provincia"));
	socio.setDni(resultado.getInt("dni"));
	socios.add(socio);
	}
	return socios;
}

		
	
}

