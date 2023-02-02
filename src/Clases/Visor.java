package Clases;

import java.util.ArrayList;

public class Visor {

	public static void mostrarLibros(ArrayList<Libro> libros) {
		  
	System.out.println("Lista de libros:");
		   
	for (int i = 0; i < libros.size(); i++) {
	  Libro libro = libros.get(i);
	  System.out.println("ID: " + libro.getId());
	  System.out.println("Título: " + libro.getTitulo());
	  System.out.println("Autor: " + libro.getAutor());
	  System.out.println("Número de páginas: " + libro.getNum_pag());
	  System.out.println("-----------------------------------------------------------");
	  
	   }
 }

public static void mostrarLibro( Libro libro) {
	
}

public static void mostrarMensaje(String mensaje) {

	
}
public static void mostrarSocios(ArrayList<Socio> socios) {
	  
	System.out.println("Lista de Socios:");
		   
	for (int i = 0; i < socios.size(); i++) {
	  Socio socio = socios.get(i);
	  System.out.println("ID del Socio: " + socio.getId());
	  System.out.println("Nombre: " + socio.getNombre());
	  System.out.println("Apellido: " + socio.getApellido());
	  System.out.println("Dirección: " + socio.getDireccion());
	  System.out.println("Población: " + socio.getPoblacion());
	  System.out.println("Provincia: " + socio.getProvincia());
	  System.out.println("DNI: " + socio.getDni());
	  System.out.println("-----------------------------------------------------------");
	   }
 }


}

