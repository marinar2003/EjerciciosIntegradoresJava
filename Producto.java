import java.util.Scanner;
/***
 * Gestión de Inventario:

Crea una clase Producto con los atributos nombre, precio y stock.

En el main, crea un array de 4 objetos Producto.

Pide al usuario que ingrese los datos de cada producto y los guarde en el array.

Recorre el array y pide al usuario que ingrese el nombre de un producto que desea buscar. 
Si lo encuentra, muestra su precio y stock actual.
Si no, muestra un mensaje de que no se encontró el producto.
 */

public class Producto {
	
	private String nombre, nombre2;
	private int precio, stock;

	public Producto(String nombre, int precio, int stock) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public int getStock() {
		return stock;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		Producto[] producto = new Producto[4];
		
		System.out.println("-- Ingrese los datos de cada producto --");
		for( int x = 0; x < producto.length; x++) {
			System.out.println("Nombre del producto: ");
			String nombre = teclado.next();
			System.out.println("Precio: ");
			int precio = teclado.nextInt();
			System.out.println("Stock: ");
			int stock = teclado.nextInt();
			teclado.nextLine(); // Limpiamos el buffer del Scanner
			
			// CORRECCIÓN: Ahora creamos y guardamos el objeto en el array
			producto[x] = new Producto(nombre, precio, stock);
			System.out.println("------------------------------------");
			}
		
		System.out.println("Ingrese el nombre del prducto que desea obtener informacion: ");
		String nombre2 = teclado.next();
		boolean encontrado = false;
		for(int x = 0; x < producto.length; x++) {
			if(producto[x].getNombre().equals(nombre2)) { 	//Usamos .equals() para comparar strings
				System.out.println(" - stock: " + producto[x].getStock() + ". - Precio: " + producto[x].getPrecio());
				encontrado = true; // El producto ha sido encontrado
				break; // Salimos del bucle una vez que lo encontramos
			} 
			}
		if(!encontrado) {
			System.out.println("No se encontró ningún producto con ese nombre.");
		}

		teclado.close();
		}
	}


