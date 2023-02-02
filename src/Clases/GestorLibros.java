package Clases;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorLibros {

public void run(Scanner scan) throws SQLException {
int opcion;

ArrayList<Libro> libros = new ArrayList<>();
Libro libro = new Libro();
GestorBBDD gbd = new GestorBBDD();
do {
System.out.println("------MENU GESTOR LIBRO-------");
Menu.MostrarMenuLibros();

opcion=Integer.parseInt(scan.nextLine());

switch (opcion) {
case Menu.INSERTAR_LIBRO:
	libro = formularioDeDatos.PedirDatosLibro(scan);
	gbd.conectar();
	gbd.insertarLibro(libro);
	gbd.cerrar();
break;
case Menu.ELIMINAR_LIBRO:
	int id = formularioDeDatos.pedirIdLibro(scan);
	gbd.conectar();
	gbd.eliminarLibro(id);
	gbd.cerrar();
break;
case Menu.MODIFICAR_LIBRO:
	libro = formularioDeDatos.ModificarDatosLibro(libro, scan);
	gbd.conectar();
	gbd.mdificarLibro(libro);
	gbd.cerrar();
break;
case Menu.VER_LIBROS:
	gbd.conectar();
	libros = gbd.getLibros();
	Visor.mostrarLibros(libros);
	gbd.cerrar();
break;
case Menu.SALIR:

break;
default:
System.out.println("Opcion incorrecta!");
}

} while (opcion != Menu.SALIR);
}
}
