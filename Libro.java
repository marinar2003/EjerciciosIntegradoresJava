// import java.util.Scanner;
/***
 * Clase Libro: Crea una clase llamada Libro con los atributos titulo, autor y paginas.

Implementa un constructor para inicializar los atributos.

Crea un método esLargo() que devuelva true si el libro tiene más de 500 páginas y false en caso contrario.

Crea un método mostrarInfo() que imprima el título, autor y la cantidad de páginas.

En el main, crea dos objetos Libro (uno largo y uno corto), y luego llama a los métodos para imprimir su información y saber si son largos o no.
 */
public class Libro {
	
	private String titulo, autor;
	private int paginas;
	//private Scanner teclado; 
	
	
	public Libro(String titulo, String autor, int paginas) {
	    this.titulo = titulo;
	    this.autor = autor;
	    this.paginas = paginas;
	}
	
	/***
	public Libro() {
		teclado = new Scanner(System.in);
		System.out.println("---------------------------------------------------");
		System.out.println("Ingrese el titulo del libro de su agrado: ");
		titulo = teclado.nextLine();
		System.out.println("Quien es el autor de " + titulo + "? ");
		autor = teclado.nextLine();
		System.out.println("Cuantas paginas tiene " + titulo + "? ");
		paginas = teclado.nextInt();
		System.out.println("---------------------------------------------------");
	}
	*/
	
	public boolean esLargo() {
	    return this.paginas > 500;
	}
	
	public void mostrarInfo() {
		System.out.println("<--Datos del libro ingresasdo--> ");
		System.out.println("-Titulo: " + titulo);
		System.out.println("-Autor: " + autor);
		System.out.println("-Cantidad de paginas: " + paginas);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libro l1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 496);
		Libro l2 = new Libro("El Señor de los Anillos", "J. R. R. Tolkien", 1216);
		
		/***
		Libro l1 = new Libro();
		Libro l2 = new Libro();
		*/
		
		l1.mostrarInfo();
		System.out.println("¿Es un libro largo? " + l1.esLargo());
		System.out.println("-----------------------------");
		l2.mostrarInfo();
		System.out.println("¿Es un libro largo? " + l2.esLargo());
		
	}

}
