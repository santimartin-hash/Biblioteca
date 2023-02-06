package Clases;

import java.util.Scanner;

public class GestorPrestamo {
	public static void run(Scanner scan) {

		int opcion;
		GestorBBDD gestorBBDD = new GestorBBDD();

		do {
			Menu.MostrarMenuPrestamos();
			opcion = Integer.parseInt(scan.nextLine());

			switch (opcion) {
			case Menu.REALIZAR_PRESTAMO:
				Prestamo presatamo = formularioDeDatos.getDatosDePrestamo(scan);
				gestorBBDD.conectar();
				gestorBBDD.insertPrestamo(presatamo);
				gestorBBDD.cerrar();

				System.out.println("prestamo realizado correctamente");

				break;
			case Menu.DEVOLVER_LIBRO:
				int idLibro = formularioDeDatos.pedirIdLibro(scan);
				gestorBBDD.conectar();
				gestorBBDD.devolverLibro(idLibro);
				gestorBBDD.cerrar();
				
				break;
			case Menu.VER_PRESTAMOS:
				int idPrestamo = formularioDeDatos.pedirIdPrestamo(scan);
				gestorBBDD.conectar();
				gestorBBDD.devolverLibro(idPrestamo);
				gestorBBDD.cerrar();
				break;

			case Menu.SALIR:
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}

		} while (opcion != Menu.SALIR);
	
	}
}
