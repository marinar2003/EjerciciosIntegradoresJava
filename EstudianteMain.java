import java.util.Scanner;
/***
 * Registro de notas: Crea un array de 10 elementos de la clase Estudiante (la que ya has creado).

En el main, crea un bucle que pida los datos (nombre, edad, nota) para los 10 estudiantes y los guarde en el array.

Una vez que el array esté lleno, utiliza un bucle para recorrerlo y calcular el promedio de todas las notas.

Imprime el nombre del estudiante con la nota más alta

 */
public class EstudianteMain {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Estudiante[] estudiante = new Estudiante[10];
		
		// Variables para los cálculos
        int sumaNotas = 0;
        double promedio;
        int notaMasAlta = -1; // Inicializamos con un valor bajo para que el primer estudiante lo reemplace
        String nombreNotaMasAlta = "";
		
		// Bucle para pedir y guardar los datos de los 10 estudiantes
        for (int i = 0; i < estudiante.length; i++) {
            System.out.println("--- Ingrese los datos del estudiante " + (i + 1) + " ---");
            System.out.println("Nombre: ");
            String nombre = teclado.next();
            System.out.println("Edad: ");
            int edad = teclado.nextInt();
            System.out.println("Nota: ");
            int nota = teclado.nextInt();
            
         // Creamos el objeto Estudiante y lo guardamos en el array
            estudiante[i] = new Estudiante(nombre, edad, nota);
            
            // Sumamos la nota para calcular el promedio
            sumaNotas += nota;
            
            // Verificamos si es la nota más alta
            if (nota > notaMasAlta) {
                notaMasAlta = nota;
                nombreNotaMasAlta = nombre;
            }
        }
        
        // Calculamos el promedio
        promedio = (double) sumaNotas / estudiante.length;
        
        // Imprimimos los resultados
        System.out.println("\n--- Resultados del registro ---");
        System.out.println("El promedio de notas es: " + promedio);
        System.out.println("La nota más alta la tiene " + nombreNotaMasAlta + " con una nota de " + notaMasAlta);

        teclado.close();
    }
}
