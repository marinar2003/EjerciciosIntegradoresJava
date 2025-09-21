import java.util.Scanner;
/***
 * Tabla de multiplicar: Pídele al usuario que ingrese un número. 
 * Usando un bucle for, muestra la tabla de multiplicar de ese número del 1 al 10. 
 * Por ejemplo, si el usuario ingresa 5, el programa debe imprimir: 5 x 1 = 5, 5 x 2 = 10, etc.
 */
public class Ejercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int nro;
		
		System.out.println("Ingrese un valor: ");
		nro = teclado.nextInt();
		
		for(int x = 1; x <= 10; x++) {
			int multiplicar = nro * x;
			System.out.println(x + " x " + nro + " = " + multiplicar);
		}
	}

}
