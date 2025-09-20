// Archivo: Main.java

// Aquí no es necesario importar java.util.Scanner porque ya está en la clase Estudiante

public class Main {

    public static void main(String[] args) {

        // Creamos un array que va a guardar 5 objetos de la clase Estudiante.
        Estudiante[] estudiantes = new Estudiante[5];

        // Ahora, en cada posición del array, creamos un nuevo objeto Estudiante
        // y se lo asignamos.
        // Aquí se llamaría al constructor que pide los datos al usuario, uno por uno.
        estudiantes[0] = new Estudiante();
        estudiantes[1] = new Estudiante();
        estudiantes[2] = new Estudiante();
        estudiantes[3] = new Estudiante();
        estudiantes[4] = new Estudiante();

        // Recorremos el array y llamamos al método imprimir() de cada objeto
        System.out.println("--- Datos de todos los estudiantes ---");
        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i].imprimir();
        }

        // Recorremos el array de nuevo y llamamos al método estaAprobado() de cada objeto
        System.out.println("\n--- Resumen de aprobación ---");
        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i].estaAprobado();
        }
    }
}