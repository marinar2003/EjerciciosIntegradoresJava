import java.util.Scanner;

/***
 * Suma de valores: Pide al usuario que ingrese 10 valores enteros. 
 * Utilizando un bucle while, suma todos los valores ingresados y muestra el resultado final.
 */
public class Ejercicio_2 {
	
	private Scanner teclado;
	private int nro, cantidad, suma;
	private int [] nros; // aray para almacenar los nros y poder mostrarlos

	public Ejercicio_2() {
		// TODO Auto-generated constructor stub
		cantidad = 0;
		suma= 0;
		teclado = new Scanner(System.in);
		nros = new int[10];
	}
	
	public void suma() {
		while (cantidad <10) {
			System.out.println("Ingrese un valor: ");
			nro = teclado.nextInt();
			nros[cantidad] = nro; // carga del array
			suma= nro + suma;
			cantidad++;
		}
	}
	
	public void nrosIngresados() {
		System.out.println("Los nros ingresados son: ");
		for(int x = 0; x < nros.length; x++) { // recorrido del array
			System.out.print(nros[x] + " - ");
		}
		System.out.println();
	}
	
	
	public void imprimir() {
		
		System.out.println("La suma de los nros ingresados es: " + suma);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio_2 e = new Ejercicio_2();
		
		
		e.suma();
		e.nrosIngresados();
		e.imprimir();
	}

}
