import java.util.Scanner;

/***
 * Adivina el número: Genera un número aleatorio entre 1 y 100. 
 * Pídele al usuario que adivine el número. Utiliza un bucle while para seguir pidiéndole que adivine hasta que ingrese el número correcto. 
 * Después de cada intento, dile si el número a adivinar es mayor o menor que el que ingresó
 */
public class Ejercicio_3 {
	
	private Scanner teclado;
	private int nro, nro2, cont;

	public Ejercicio_3() {
		// TODO Auto-generated constructor stub
		teclado = new Scanner(System.in);
		nro = 1 + (int)(Math.random()*100);
		System.out.println("Ingrese un valor");
		nro2 = teclado.nextInt();
	}
	
	public void adivinaElnro() {
		
		while(nro2 != nro) {
			
			if (nro2 < nro) {
				System.out.println("El nro que ud ingreso es menor.");
			} else {
				System.out.println("El nro ingresado es mayor");
			}
			System.out.print("El nro ingresado no corresponde al nro ganador, intentelo de nuevo: ");
			nro2 = teclado.nextInt();
		}
		System.out.println("Adivinó el nro!, el nro ganador es: " + nro);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio_3 e = new Ejercicio_3();
			
		e.adivinaElnro();
	}

}
