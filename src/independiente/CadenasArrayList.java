package independiente;

import java.util.ArrayList;


public class CadenasArrayList {

	public static void main(String[] args) {
		
		ArrayList <String> nombres = new ArrayList<>();
		
		nombres.add("Tomás");
		nombres.add("Eva");
		nombres.add("Tomás");
		nombres.add("Sara");
		
		System.out.println("Tamaño del array = " + nombres.size());
		
		//Iteración con "for i". Utilizamos el método .get()
		//El método .get() en un array devuelve el valor del índice indicado 
		for (int i=0; i<nombres.size(); i++) {
			System.out.println(nombres.get(i));
		}
		
		
		//Iteración con "for each"
		//.indexOf() devuelve el PRIMER índice del valor indicado
		for (String nombre:nombres) {
			int posicion = nombres.indexOf(nombre);
			System.out.println(posicion + "-" + nombre);
		}
		
		
		/*
		 * El caso siguiente puede dar un error (IndexOutOfBounds) si el valor
		 * añadido no existe (por ejemplo, si metemos un nombre
		 * que no esté en la lista). Para solucionarlo, debemos 
		 * incluir una condición donde indique que solo se ejecute
		 * en caso de que el valor devuelto sea distinto de -1.
		 * Si devuelve -1 quiere decir que no existe en el ArrayList.
		 */
		
		int posicion = nombres.indexOf("María");
		if (posicion != -1) {
			System.out.println(nombres.get(posicion));
		}else {
			System.out.println("El nombre no existe \n");
		}
		
		
		/*
		 * El siguiente método es .contains(),
		 * que nos devolverá un boolean.
		 * True si el parámetro existe,
		 * False si el parámetro no existe.
		 * Podemos utilizar este método para ejecutar
		 * una acción dependiendo de si existe o no existe
		 * el parámetro en nuestro ArrayList
		 */
		
		if (!nombres.contains("Chocapic"))
			nombres.add("Chocapic");
		
		for (String nombre:nombres) {
			System.out.println("#" + nombre);
		}
		
		/*
		 * .set() se utiliza para cambiar el valor
		 * de una posición determinada del ArraList
		 */
		
		nombres.set(2, "Esteban");
		
		/*
		 * .remove() se utiliza para quitar un valor o el índice.
		 * Al eliminar un valor, el ArrayList se reconstruye
		 */
		
		nombres.remove("Tomás");
		nombres.remove(0);
		for (String nombre:nombres) {
			System.out.println("--> "+ nombre);
		}
		
		//Hay que tener cuidado con el remove de no quitar una posición que no exista
		//Para ello podemos incluir siempre un if
		
		
		
		
	}
}
