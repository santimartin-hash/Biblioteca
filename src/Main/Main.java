package Main;

import java.sql.SQLException;

import Clases.GestorBiblioteca;
import Clases.GestorLibros;

public class Main {
public static void main(String[] args) throws SQLException {
GestorBiblioteca gl = new GestorBiblioteca();
gl.run();
}
}
