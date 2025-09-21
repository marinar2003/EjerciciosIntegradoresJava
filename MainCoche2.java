import java.util.Scanner;
/***
 * Tu tarea es usar la clase Coche que ya creaste. Si no la tienes a mano, aquí tienes un recordatorio de cómo debe ser:

Clase Coche:

Atributos: marca, modelo, y velocidad (puedes usar String para las primeras y int para la última).

Constructor: Para inicializar los 3 atributos.

Métodos get: Para acceder a cada uno de los atributos.

Ahora, en tu método main, realiza lo siguiente:

Crea un array de 5 objetos Coche.

Mediante un bucle, pide al usuario que ingrese la marca, el modelo y la velocidad para cada uno de los 3 coches, y guárdalos en el array.

Después de llenar el array, usa un segundo bucle para encontrar el coche con la mayor velocidad.

Una vez que lo encuentres, imprime la marca, el modelo y la velocidad de ese coche en particular.
 */
public class MainCoche2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Coche[] coche = new Coche[5];
		
		System.out.println("--- Ingrese los datos del automovil ---");
		for( int x = 0; x < coche.length; x++) {
			System.out.println("Marca: ");
			String marca = teclado.next();
			System.out.println("Modelo: ");
			String modelo = teclado.next();
			System.out.println("Velocidad: ");
			int velocidad = teclado.nextInt();
			teclado.nextLine();
			
			coche[x] = new Coche(marca, modelo, velocidad);
			System.out.println("-----------------------------------------");
		}
		
		int mayorVelocidad = coche[0].getVelocidad();
		String marcaMasRapida = coche[0].getMarca();
		String modeloMasRapido = coche[0].getModelo();
		
		for( int x=0; x < coche.length; x++) {
			if(coche[x].getVelocidad()>mayorVelocidad) {
				mayorVelocidad= coche[x].getVelocidad();
				marcaMasRapida = coche[x].getMarca();
				modeloMasRapido = coche[x].getModelo();
			}
		}
		
				System.out.println("\n--- Coche más rápido ---");
				System.out.println("Marca: " + marcaMasRapida);
				System.out.println("Modelo: " + modeloMasRapido);
				System.out.println("Velocidad: " + mayorVelocidad);

				teclado.close();
	}

}
