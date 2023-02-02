package Clases;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorSocios {
	public void run(Scanner scan) throws SQLException {
	
	int opcion;
	ArrayList<Socio> socios = new ArrayList<>();
	Socio socio = new Socio();
	GestorBBDD gbd = new GestorBBDD();
	do {
	System.out.println("------MENU GESTOR LIBRO-------");
	Menu.MostrarMenuSocios();
	
	opcion=Integer.parseInt(scan.nextLine());
	
	switch (opcion) {
	case Menu.INSERTAR_SOCIO:
	socio = formularioDeDatos.PedirDatosSocio(scan);
	gbd.conectar();
	gbd.insertarSocio(socio);
	gbd.cerrar();
	break;
	case Menu.ELIMINAR_SOCIO:
	int id = formularioDeDatos.pedirIdLibro(scan);
	gbd.conectar();
	gbd.eliminarSocio(id);
	gbd.cerrar();
	break;
	case Menu.MODIFICAR_SOCIO:
	socio = formularioDeDatos.ModificarDatosSocio(socio, scan);
	gbd.conectar();
	gbd.modificarSocio(socio);
	gbd.cerrar();
	break;
	case Menu.VER_LIBROS:
	gbd.conectar();
	socios = gbd.getSocios();
	Visor.mostrarSocios(socios);
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
