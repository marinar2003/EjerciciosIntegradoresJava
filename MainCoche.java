

/***
 * Array de Coche: Usando la clase Coche que acabas de crear, crea un array de 3 objetos Coche.

En el main, inicializa los 3 objetos con datos diferentes.

Recorre el array y llama al método acelerar() en cada uno de los coches.

Después, recorre el array nuevamente e imprime el estado actual (marca, modelo y velocidad) de todos los coches.
 */
public class MainCoche {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche[] coche = new Coche[3];
		
		coche[0] = new Coche("Fiat", "Palio", 100);
		coche[1] = new Coche("Chevrolet", "Corsa", 80);
		coche[2] = new Coche("Peugeot", "206", 90);
		
	
		// primer recorrido para acelerar los autos
		for(int x = 0; x < coche.length; x++) {
			coche[x].acelerar();
		}
		
		// Segundo recorrido: Imprimir la información completa de cada coche
        System.out.println("\n--- Estado actual de los autos ---");
        for (int i = 0; i < coche.length; i++) {
            System.out.println("Coche " + (i + 1) + ":");
            System.out.println("  Marca: " + coche[i].getMarca());
            System.out.println("  Modelo: " + coche[i].getModelo());
            System.out.println("  Velocidad: " + coche[i].getVelocidad() + " km/h");
            System.out.println("-------------------------------------");
        }
    }
}


