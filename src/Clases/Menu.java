package Clases;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	static void MostrarMenuPrincipal() {
    	System.out.println("------MENU-------");
		System.out.println("1. Insertar Libro");
		System.out.println("2. Eliminar Libro");
		System.out.println("3. Ver Libro");
		System.out.println("0. Salir");
		System.out.println("Elije una de las opciones");
	}

	static void MostrarMenuLibros() {
		System.out.println("------MENU-------");
		System.out.println("1. Gestionar Libros");
		System.out.println("2. Gestionar Socios");
		System.out.println("3. Gestionar Prestamos");
		System.out.println("0. Salir");
		System.out.println("Elije una de las opciones");
	}
	static void MostrarMenuSocios() {
		System.out.println("------MENU-------");
		System.out.println("1. ver Socios");
		System.out.println("0. Salir");
		System.out.println("Elije una de las opciones");
	}
	static void MostrarMenuPrestamos() {
		System.out.println("------MENU-------");
		System.out.println("1. Realizar prestamo");
		System.out.println("0. Salir");
		System.out.println("Elije una de las opciones");
	}
}
