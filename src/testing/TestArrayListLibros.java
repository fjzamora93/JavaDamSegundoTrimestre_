package testing;

import java.util.ArrayList;
import javabeans.Libro;


public class TestArrayListLibros {

	public static void main(String[] args) {
		
		
		ArrayList <Libro> biblioteca = new ArrayList <>();
		
		//La L se pone por si excede el tamaño al ser un long. La L no molesta
		biblioteca.add(new Libro(1L, "Harry Potter", "Autor A", "Paraninfo", 10));
		biblioteca.add(new Libro(2L, "El Señor de los Anillos", "Autor B", "Salamandra", 15));
		biblioteca.add(new Libro(3L, "Los juegos del Hambre", "Autor C", "Planeta", 20));
		biblioteca.add(new Libro(7L, "Sefer Yetzirá", "Autor C", "Planeta", 20));
		biblioteca.add(new Libro(5L, "La llamada de Cthulhu", "Autor C", "Planeta", 20));
		biblioteca.add(new Libro(6L, "Los Siete Sellos", "Autor D", "Círculo", 25));
		
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
		
		System.out.println("DISTINTAS FORMAS DE BUSCAR CON FOR \n");
		
		//supongamos que solamente nos dan el ISBN
		long isbnBuscado = 3;
		
		//PRIMERA FORMA DE BÚSQUEDA
		boolean encontrado = false;
		System.out.println("1. Búsqueda con for i");
		for (int i = 0; i < biblioteca.size(); i++) {
			if (biblioteca.get(i).getIsbn() == isbnBuscado) {
				System.out.println(biblioteca.get(i) + "en la posición" + i);
				encontrado = true;
				break;
			}
		}
		
		if (!encontrado) {
			System.out.println("Libro no encontrado");
		}
		
		//SEGUNDA FORMA DE BÚSQUEDA
		System.out.println("\n2. Búsqueda por indexOf()");
		
		Libro libroBuscado = new Libro();
		libroBuscado.setIsbn(isbnBuscado);
		
		//Recordamos, index of devuelve el índice de un determinado contenido.
		int pos = biblioteca.indexOf(libroBuscado);
		
		if (pos != -1) {
			System.out.println("Libro buscado: " + biblioteca.get(pos).getTitulo() + "\n");
		} else {
				System.out.println("Libro no encontrado");
		}
		
		
		//AÑADIR A UNA NUEVA LISTA
		System.out.println("\n3. Añadir a una nueva lista con filtro");
		ArrayList <Libro> auxiliar = new ArrayList<>();
		
		for (Libro libro:biblioteca) {
			if (libro.getEditorial().equalsIgnoreCase("Planeta")) {
				auxiliar.add(libro);
			}
		}
		for (Libro libro:auxiliar) {
			System.out.println(libro.getTitulo());
		}
		

		
	}
}