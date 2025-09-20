/***
 * Array de números: Crea una clase que tenga un array de 50 elementos enteros.

Crea un método que cargue el array con valores aleatorios entre 1 y 10.

Crea un método que imprima todos los valores del array.

Crea un método que cuente y muestre cuántos valores son pares e impares dentro del array.
 */


public class Array {

	private int [] array;
	
	public Array() {
		// TODO Auto-generated constructor stub
		array = new int[50];
		
	}
	
	public void carga() {
		for(int x = 0; x < array.length;x++) {
			array[x] = 1 + (int)(Math.random()*10);
		}
	}
	
	public void imprimir() {
		for(int x= 0; x < array.length; x++) {
			System.out.print(array[x] + " - ");
		}
		System.out.println();
	}
	
	public void esPar() {
		int cont_par= 0;
		int cont_impar=0;
		for(int x= 0; x < 50; x++) {
			if (array[x] %2 == 0) {
				cont_par++;
			}else {
				cont_impar++;
			}
		}
		System.out.println("La cantidad de nros pares es: " + cont_par);
		System.out.println("La cantidad de nros impares es: " + cont_impar);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array array = new Array();
		
		array.carga();
		array.imprimir();
		array.esPar();
	}

}
