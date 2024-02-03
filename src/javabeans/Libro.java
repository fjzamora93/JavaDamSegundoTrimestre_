package javabeans;

import java.util.Objects;

public class Libro {
	
	private long isbn;
	private String titulo;
	private String autor;
	private String editorial;
	private int paginas;
	
	/*
	 * NUEVO: ¿Por qué dos libros son iguales?
	 * source > generate hashCode > 
	 * 		>seleccionar el campo que identifique la instancia (ISBN)
	 */
	
	//Un hash es un algortimo que calcula el contenido de las variables
	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}
	
	//Aquí te garantiza que para que sea equals, se comparen los hash
	//Pero en este caso los hash están relacionados con el ISBN
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return isbn == other.isbn;
	}
	
	
	//Constructor
	public Libro(long isbn, String titulo, String autor, String editorial, int paginas) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.paginas = paginas;
	}
	
	public Libro() {
		super();
		
	}
		
	//Getter and setter
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	//toString
	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial
				+ ", paginas=" + paginas + "]";
	}
	
	
	

}
	
	


