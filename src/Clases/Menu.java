package Clases;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	
	final static int GESTIONAR_LIBROS=1;
	final static int GESTIONAR_SOCIOS=2;
	final static int GESTIONAR_PRESTAMOS=3;

	final static int INSERTAR_LIBRO=1;
	final static int ELIMINAR_LIBRO=2;
	final static int MODIFICAR_LIBRO=3;
	final static int VER_LIBROS=4;

	final static int INSERTAR_SOCIO=1;
	final static int ELIMINAR_SOCIO=2;
	final static int MODIFICAR_SOCIO=3;
	final static int VER_SOCIOS=4;


	final static int REALIZAR_PRESTAMO=1;

	final static int SALIR=0;

	static void MostrarMenuPrincipal() {
		System.out.println("------MENU-------");
		System.out.println(GESTIONAR_LIBROS +". Gestionar Libros");
		System.out.println(GESTIONAR_SOCIOS + ". Gestionar Socios");
		System.out.println(GESTIONAR_PRESTAMOS + ". Gestionar Prestamos");
		System.out.println(SALIR + ". Salir");
		System.out.println("Elije una de las opciones");
	}

	static void MostrarMenuLibros() {
		System.out.println("------MENU-------");
		System.out.println(INSERTAR_LIBRO + ". Insertar Libro");
		System.out.println(ELIMINAR_LIBRO + ". Eliminar Libro");
		System.out.println(MODIFICAR_LIBRO + ". Modificar Libro");
		System.out.println(VER_LIBROS + ". Ver Libro");
		System.out.println(SALIR + ". Salir");
		System.out.println("Elije una de las opciones");
	
	}
	static void MostrarMenuSocios() {
		System.out.println("------MENU-------");
		System.out.println(INSERTAR_SOCIO + ". Insertar Socios");
		System.out.println(ELIMINAR_SOCIO + ". Eliminar Socios");
		System.out.println(MODIFICAR_SOCIO + ". Modificar Socios");
		System.out.println(VER_SOCIOS + ". ver Socios");
		System.out.println(SALIR + ". Salir");
		System.out.println("Elije una de las opciones");
	}
	static void MostrarMenuPrestamos() {
		System.out.println("------MENU-------");
		System.out.println(REALIZAR_PRESTAMO + "1. Realizar prestamo");
		System.out.println(SALIR + "0. Salir");
		System.out.println("Elije una de las opciones");
	}
}
