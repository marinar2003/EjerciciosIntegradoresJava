import java.util.Scanner;

/***
 * Suma de números pares: Crea un programa que le pida al usuario que ingrese 10 números enteros. 
 * Utiliza un bucle for para recorrer los números y sumar únicamente los que sean pares.
 *  Muestra el resultado final.
 */

public class Ejercicio_4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int [] nro;
		int contPares =0;
		int contImpares= 0;
		int suma = 0;
		int sumaImpar = 0;
		
		nro = new int[10];
		
		for(int x=0; x < nro.length; x++) {
			System.out.println("Ingrese un valor: ");
			nro[x] = teclado.nextInt();
		
			if(nro[x] %2==0) {
				contPares++;
				suma = suma + nro[x];
			} else {
				contImpares++;
				sumaImpar = sumaImpar + nro[x];
			}
		}
		
		System.out.println("Los nros ingresados son: ");
		for(int y= 0; y < nro.length; y++) {
			System.out.print(nro[y] + " - ");
		}
		System.out.println();
		System.out.println("La cantiada de nros pares es: " + contPares);
		System.out.println("La suma de todos ellos es: " + suma + ".");
		System.out.println("La cantidad de nros impares es: " + contImpares);
		System.out.println("La suma de todos ellos es: " + sumaImpar + ".");
	}
}
