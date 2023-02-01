package Clases;

import java.util.Scanner;

public class formularioDeDatos {
public static Libro PedirDatosLibro(Scanner scan) {
	
	Libro libro = new Libro();
	System.out.println("Introduce el id del libro");
	libro.setId(Integer.parseInt(scan.nextLine()));
	
	System.out.println("Introduce el titulo del libro");
	libro.setTitulo(scan.nextLine());
	
	System.out.println("Introduce el autor del libro");
	libro.setAutor(scan.nextLine());
	
	System.out.println("introduce el numero de paginas del libro");
	libro.setNum_pag(Integer.parseInt(scan.nextLine()));
	
	return libro;
}

public static Libro ModificarDatosLibro(Libro libro, Scanner scan) {
	
	System.out.println("Introduce el id del libro");
	libro.setId(Integer.parseInt(scan.nextLine()));
	
	System.out.println("Introduce el titulo del libro");
	libro.setTitulo(scan.nextLine());
	
	System.out.println("Introduce el autor del libro");
	libro.setAutor(scan.nextLine());
	
	System.out.println("introduce el numero de paginas del libro");
	libro.setNum_pag(Integer.parseInt(scan.nextLine()));
	
	return libro;
}

public static int pedirIdLibro( Scanner scan) {
	
	Libro libro = new Libro();
	
	System.out.println("Introduce el id del libro a eliminar");
	libro.setId(Integer.parseInt(scan.nextLine()));
	
	int id = libro.getId();
	
	return id;
	
	
}
public static Socio PedirDatosSocio(Scanner scan) {
	
	Socio socio = new Socio();
	
	System.out.println("Introduce el id del Socio");
	socio.setId(Integer.parseInt(scan.nextLine()));
	
	System.out.println("Introduce el nombre del socio");
	socio.setNombre(scan.nextLine());;
	
	System.out.println("Introduce el apellido del socio");
	socio.setApellido(scan.nextLine());
	
	System.out.println("introduce la direccion del socio");
	socio.setDireccion(scan.nextLine());
	
	System.out.println("introduce la poblacion del socio");
	socio.setPoblacion(scan.nextLine());
	
	System.out.println("introduce la provincia del socio");
	socio.setProvincia(scan.nextLine());
	
	System.out.println("Introduce el dni del socio");
	socio.setDni(Integer.parseInt(scan.nextLine()));
	
	return socio;
}

public static Socio ModificarDatosSocio(Socio socio, Scanner scan) {
	
	System.out.println("Introduce el id del Socio");
	socio.setId(Integer.parseInt(scan.nextLine()));
	
	System.out.println("Introduce el nombre del socio");
	socio.setNombre(scan.nextLine());;
	
	System.out.println("Introduce el apellido del socio");
	socio.setApellido(scan.nextLine());
	
	System.out.println("introduce la direccion del socio");
	socio.setDireccion(scan.nextLine());
	
	System.out.println("introduce la poblacion del socio");
	socio.setPoblacion(scan.nextLine());
	
	System.out.println("introduce la provincia del socio");
	socio.setProvincia(scan.nextLine());
	
	System.out.println("Introduce el dni del socio");
	socio.setDni(Integer.parseInt(scan.nextLine()));
	
	return socio;
}

public static int pedirIdSocio( Scanner scan) {
	
	Socio socio = new Socio();
	
	System.out.println("Introduce el id del libro a eliminar");
	socio.setId(Integer.parseInt(scan.nextLine()));
	
	int id = socio.getId();
	
	return id;
	
	
}
}
