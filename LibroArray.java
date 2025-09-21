import java.util.Scanner;

/***
 * Array de Libro: Usando la clase Libro que ya creaste, crea un array de 5 libros. 
 * Pide al usuario los datos para cada libro en un bucle y guárdalos en el array. 
 * Después de llenar el array, recorre todos los libros y cuenta cuántos tienen más de 500 páginas.
 */
public class LibroArray {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro[] libro = new Libro[5];
		Scanner teclado = new Scanner(System.in);
		
		for(int x = 0; x < libro.length; x++) {
			System.out.println("<-- Ingrese los datos del " + (x + 1) + " libro -->");
			System.out.println("Titulo: ");
			String titulo = teclado.nextLine();
			System.out.println("Autor/a: ");
			String autor = teclado.nextLine();
			System.out.println("Cantidad de paginas: ");
			int paginas = teclado.nextInt();
			teclado.nextLine();
			System.out.println("-----------------------------------");
			
			libro[x] = new Libro(titulo, autor, paginas);
			
		}
		
		int cont = 0;
        for(int x = 0; x < libro.length; x++) {
            // Usamos el método esLargo() de cada objeto
            if(libro[x].esLargo()) {
                cont++;
            }    
        }
        

        for(int x = 0; x < libro.length; x++) {
            libro[x].mostrarInfo();
            }    
        
		System.out.println("La cantidad de libros que tiene mas de 500 paginas son " + cont);
		
		teclado.close();
	}
}