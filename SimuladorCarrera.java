/***
 * Ejercicio: Simulador de Carrera
Para este desafío, necesitarás modificar la clase Coche que ya has creado. Si no la tienes a mano, aquí tienes un recordatorio de sus atributos y métodos básicos.

Clase Coche:

Atributos: marca, modelo, y velocidad.

Constructor: Para inicializar los 3 atributos.

Métodos get: Para acceder a cada uno de los atributos.

Pasos para completar el simulador
Modifica tu clase Coche:

Añade un método llamado acelerar() a tu clase Coche.

Dentro de este método, incrementa la velocidad del coche en un valor aleatorio (puedes usar un número aleatorio entre 10 y 50, por ejemplo).

En tu método main:

Crea un array de 3 objetos Coche.

Inicializa cada objeto con datos de prueba, pero asegúrate de que su velocidad inicial sea 0.

Utiliza un bucle for o while para simular 5 "turnos" de la carrera.

Dentro del bucle, recorre el array de coches y llama al método acelerar() para cada uno.

Después de que la simulación termine (es decir, una vez que el bucle haya terminado sus 5 iteraciones), usa un segundo bucle para encontrar el coche que terminó con la mayor velocidad.

Imprime la marca, el modelo y la velocidad final del coche ganador.


 */
public class SimuladorCarrera {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche[] coche = new Coche[3];
		
		coche[0] = new Coche("Peugeot", "Kangoo", 0);
		coche[1] = new Coche("Fiat", "Cronos", 0);
		coche[2] = new Coche("Chevrolet", "Toro", 0);
		
		for(int x = 0; x < 5; x++) {
			System.out.println("--- Turno " + (x + 1) + " ---");
			for(int y = 0; y <coche.length; y++) {
				coche[y].acelerarAleatorio();
				System.out.println("El " + coche[y].getMarca() + " acelera. Velocidad actual: " + coche[y].getVelocidad());
			}
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

	}
}
