/***
 * Clase Coche: Crea una clase Coche con los atributos marca, modelo y velocidad.

Crea un constructor para inicializar los atributos.

Crea un método acelerar() que aumente la velocidad en 10.

Crea un método frenar() que disminuya la velocidad en 10, asegurándote de que la velocidad no sea negativa.

En el main, crea un objeto Coche y prueba los métodos acelerar() y frenar(), imprimiendo la velocidad actual después de cada acción.

 */
public class Coche {
	private String marca, modelo;
	private int velocidad;

	public Coche(String marca, String modelo, int velocidad) {
		this.marca = marca;
		this.modelo = modelo;
		this.velocidad = velocidad;
	}
	
	public int getVelocidad() {
		return velocidad;
	}
	
	 // Método para obtener la marca
    public String getMarca() {
        return marca;
    }

    // Método para obtener el modelo
    public String getModelo() {
        return modelo;
    }
    
	public void acelerar() {
			velocidad+=10;
			
		}
	
	
	public void frenar() {
		if (velocidad >=10) {
			velocidad-=10;
			
		} else {
			velocidad = 0;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche coche = new Coche("Peugeot", "208", 0);
		
		
		System.out.println("Velocidad inicial: " + coche.getVelocidad()); 
		
		coche.acelerar();
		coche.acelerar();
		System.out.println("La velocidad del auto es " + coche.getVelocidad());
		coche.frenar();
		System.out.println("La velocidad del auto dspues de frenar es: " + coche.getVelocidad());
	}

}
