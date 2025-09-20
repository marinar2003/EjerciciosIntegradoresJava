import java.util.Scanner;

/***
* Clase Estudiante: Crea una clase Estudiante con los atributos nombre, edad y nota.

Implementa un constructor para inicializar los atributos al crear un objeto.

Crea un método mostrarDatos que imprima el nombre, la edad y la nota del estudiante.

Crea un método estaAprobado que, basándose en la nota, devuelva un mensaje indicando si el estudiante aprobó (nota >= 7) o no.


 */
public class Estudiante {
	
	private String nombre;
	private int edad, nota;
	private Scanner teclado;
	
	public Estudiante() {
		// TODO Auto-generated constructor stub
		teclado = new Scanner(System.in);
		System.out.println("Ingrese en nombre del alumno: ");
		nombre = teclado.next();
		System.out.println("Infique la edad de " + nombre + ": ");
		edad = teclado.nextInt();
		System.out.println("Cual fue la nota obtenida por " + nombre + "?: ");
		nota = teclado.nextInt();
		
	}
	
	// Constructor que recibe parámetros para inicializar los atributos
    //public Estudiante(String nombre, int edad, int nota) {
    //    this.nombre = nombre;
    //    this.edad = edad;
    //    this.nota = nota;
	
	public void imprimir() {
		System.out.println("Datos del alumno:");
		System.out.println(" - Nombre:" + nombre);
		System.out.println(" - Edad:" + edad);
		System.out.println(" - Nota:" + nota);
	}
	
	public void estaAprobado() {
		if (nota >= 7) {
			System.out.println(nombre + " esta Aprobado!.");
		}else {
			System.out.println(nombre + " no logro aprobar.");
		}
	}
	
	//Sugerencia Gemini 1
	//public boolean estaAprobado() {
    //    return nota >= 7;
    //}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante estudiante = new Estudiante();
		
		
		
		estudiante.imprimir();
		estudiante.estaAprobado();
		
		//Scanner teclado = new Scanner(System.in);

        // Pedimos los datos en la clase principal (main)
		
        //System.out.println("Ingrese el nombre del alumno:");
        //String nombreAlumno = teclado.next();
        //System.out.println("Indique la edad de " + nombreAlumno + ":");
        //int edadAlumno = teclado.nextInt();
        //System.out.println("¿Cuál fue la nota obtenida por " + nombreAlumno + "?:");
        //int notaAlumno = teclado.nextInt();

        // Creamos un objeto Estudiante pasándole los valores al constructor
		
        //Estudiante estudiante = new Estudiante(nombreAlumno, edadAlumno, notaAlumno);

        // Llamamos a los métodos del objeto para mostrar la información
		
        //estudiante.imprimir();
		
		//Sugerencia Gemenini 1
		
		//if (estudiante.estaAprobado()) {
        //    System.out.println(estudiante.nombre + " está Aprobado!");
        //} else {
        //    System.out.println(estudiante.nombre + " no logró aprobar.");
        //}
	}

}
