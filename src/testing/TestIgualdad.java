package testing;

import javabeans.Libro;

public class TestIgualdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libro libro1 = new Libro();
		Libro libro2 = libro1;
		
		System.out.println(libro1.equals(libro2));
	
	
	if (libro1.hashCode() == libro2.hashCode()) {
		System.out.println("Iguales");
	}
	
	
	}
}
