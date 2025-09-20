import java.util.Scanner;
/***
 * Contador de números: Crea un programa que le pida al usuario que ingrese un número entero positivo. 
 * Usando un bucle while, muestra en la consola todos los números desde 1 hasta el número ingresado.
 */
public class Ejercicio_1 {
	
	private Scanner teclado;
	private int nro;
	
	public Ejercicio_1() {
		// TODO Auto-generated constructor stub
		teclado = new Scanner(System.in);
		System.out.println("Ingrese un valor, partiendo desde el nro 1 al 100: ");
		nro = teclado.nextInt();
		
	}
	
	public void verificacion() {
		int cont = 1;
		System.out.println("Los nros comprendidos entre " + cont + " y el nro ingresado " + nro + " son: ");
		while (cont <= nro ) {
			
			System.out.print(cont + " - ");
			cont++;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio_1 e = new Ejercicio_1();
		
		e.verificacion();
	}

}
