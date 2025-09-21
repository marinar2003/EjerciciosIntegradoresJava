import java.util.Scanner;

/***
 * Contador de vocales: Pídele al usuario que ingrese una frase.
 *  Usando un bucle, cuenta cuántas vocales (a, e, i, o, u) tiene la frase, sin importar si son mayúsculas o minúsculas.
 *  Muestra la cantidad total de vocales.
 */
public class Ejercicio_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String frase;				
		int contVocales=0; 
		
		System.out.println("Ingrese una frase: ");
		//nextLine para capturar toda la frase
		frase = teclado.nextLine();
		// convertimos toda la frase a minuscula
		frase = frase.toLowerCase();
		
		for(int x = 0; x < frase.length(); x++) {
			// Accedemos a cada carácter de la frase usando charAt(x)
            char caracter = frase.charAt(x);
            // Usamos || para verificar si el carácter es una vocal
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contVocales++;
			}
		}
		System.out.println("La cantidad de vocales que tiene la frase - " + frase + " - es: " + contVocales);
		
	}

}
