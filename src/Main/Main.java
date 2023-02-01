package Main;

import java.sql.SQLException;

import Clases.GestorLibros;

public class Main {
public static void main(String[] args) throws SQLException {
GestorLibros gb = new GestorLibros();
gb.run(null);
}
}
