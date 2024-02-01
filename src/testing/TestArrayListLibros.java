package testing;

import java.util.ArrayList;
import javabeans.Libro;


public class TestArrayListLibros {

	public static void main(String[] args) {
		
		
		ArrayList <Libro> biblioteca = new ArrayList <>();
		
		//La L se pone por si excede el tamaño al ser un long. La L no molesta
		biblioteca.add(new Libro(1L, "Titulo 1", "Autor A", "Edit 1", 10));
		biblioteca.add(new Libro(2L, "Titulo 2", "Autor B", "Edit 2", 15));
		biblioteca.add(new Libro(3L, "Titulo 3", "Autor C", "Edit 3", 20));
		biblioteca.add(new Libro(4L, "Titulo 4", "Autor D", "Edit 4", 25));
		
		System.out.println("Tamaño del array = " + biblioteca.size() + "\n");
		for (int i=0; i<biblioteca.size(); i++) {
			System.out.println(biblioteca.get(i));
		}
		
		//Ahora creamos un nuevo libro, 
		//el cuál no sabemos si ya está en la biblioteca. 
	
		Libro nuevoLibro = new Libro(4L, "Titulo 4", "Autor D", "Edit 4", 25);
		
		//Lo primero es preguntanos si el libro está en la Biblioteca
		//PASO 1: Comprobamos si está el índice.
		int posicion = biblioteca.indexOf(nuevoLibro);
		 //PASO 2: Si el índice existe (no es -1), lo va a modificar
		if (posicion != -1) {
			biblioteca.set(posicion, nuevoLibro);
		//Si el índice no existe, lo va a añadir.
		}else {
			biblioteca.add(nuevoLibro);
		}
		
		//IMPRIMIMOS EL RESULTADO
		for (Libro libro:biblioteca) {
			System.out.println("#" + libro);
		}
		
		/*
		 * LAS OPERACIONES BÁSICAS CONTRA UNA BASE DE DATOS:
		 * 		1. INSERTAR uno que no existe.
		 * 		2. MODIFICAR O ELIMINAR uno que ya existe.
		 * 		3. CONSULTAR uno por clave.
		 * 		5. CONSULTAR todos.
		 * 		6. CONSULTAR de forma especializada (filtrando).
		 * 	
		 */
		
	
		
	}
}