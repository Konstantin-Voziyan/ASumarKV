package sumador;

/**
 * 
 * @author Konstantin Voziyan
 * @version 1
 * @since 26.2.2019
 *
 */
public class KVfunciona {

	/**
	 * @param args : Cadena de texto con números a sumar
	 */
	public static void main(String[] args) {
		
		ASumar as1 = new ASumar(args[0]);
		System.out.println("El resultado de sumar los digitos del número " + args[0] + " es igual a : " + as1.mostrar());
	
	}

}
