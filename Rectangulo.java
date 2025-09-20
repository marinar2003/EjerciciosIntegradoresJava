/***
 * MI RESOLUCON!!
 * 
 * 
 * import java.util.Scanner;

public class Rectangulo {
	
	private int base, altura;
	private Scanner teclado;
	
	public Rectangulo() {
		// TODO Auto-generated constructor stub
		teclado = new Scanner(System.in);
		System.out.println("---Ingrese los datos del rectangulo---");
		System.out.print("Ingrese el valor de la base: ");
		base = teclado.nextInt();
		System.out.print("Ingrese la altura: ");
		altura = teclado.nextInt();
	}
	
	public void calcularArea() {
		int area = base * altura;
		System.out.println("El area del rectangulo es: " + area + ".");
	}
	
	public void esCuadrado() {
		boolean cuadrado = true;
		if ( base == altura) {
			System.out.println(cuadrado);
		} else {
			System.out.println(!cuadrado);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r = new Rectangulo();
		r.calcularArea();
		r.esCuadrado();
	}

}
 */

//RESOLUCION RECOMENDADA POR GEMINI

import java.util.Scanner;

public class Rectangulo {

    private int base, altura;

    // Método para inicializar los atributos
    public void inicializar() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("---Ingrese los datos del rectangulo---");
        System.out.print("Ingrese el valor de la base: ");
        base = teclado.nextInt();
        System.out.print("Ingrese la altura: ");
        altura = teclado.nextInt();
    }

    // Método que devuelve el área
    public int calcularArea() {
        return base * altura;
    }

    // Método que devuelve un boolean
    public boolean esCuadrado() {
        return base == altura;
    }

    public static void main(String[] args) {
        Rectangulo r = new Rectangulo();
        r.inicializar();
        System.out.println("El área del rectángulo es: " + r.calcularArea() + ".");
        System.out.println("¿El rectángulo es un cuadrado? " + r.esCuadrado());
    }
}
