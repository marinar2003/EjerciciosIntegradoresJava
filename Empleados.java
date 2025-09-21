
/***
 * Registro de Empleados:

Crea una clase Empleado con los atributos nombre, salario y puesto.

En el main, crea un array de 3 objetos Empleado.

Inicializa cada objeto directamente en el código con datos de prueba.

Recorre el array y muestra el salario de cada empleado.

Luego, encuentra y muestra el salario promedio de todos los empleados.
 */
public class Empleados {
	
	private String nombre, puesto;
	private int salario;
	
	public Empleados(String nombre, String puesto, int salario) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.puesto = puesto;
		this.salario = salario;
	}
	
	// Método para obtener el nombre (getter)
		public String getNombre() {
			return nombre;
		}

		// Método para obtener el salario (getter)
		public int getSalario() {
			return salario;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleados[] empleado = new Empleados[3];
		
		empleado[0] = new Empleados("Marina", "IQ", 1000);
		empleado[1] = new Empleados("Paula", "Administrativa", 900);
		empleado[2] = new Empleados("Sabrina", "Estudiante", 500);
		
		for(int x = 0; x <empleado.length; x++) {
			System.out.println("El salario de " + empleado[x].getNombre() + " es: " + empleado[x].getSalario());
		}
		
		int suma = 0;
		int promedio=0;
		for(int y = 0; y <empleado.length; y++) {
			suma+=empleado[y].salario;
		}
		promedio = suma / empleado.length;
		System.out.println("El salario promedio es: " + promedio);
	}

}
