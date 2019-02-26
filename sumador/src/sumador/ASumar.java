package sumador;

/**
 * @author Konstantin Voziyan
 * @version 1
 * @since 26.2.2019
 */
public class ASumar {

	private String valor_inicial;

	/**
	 * @param string : Cadena que contiene numeros.
	 */
	public ASumar(String string) {
		this.valor_inicial = string;
	}

	/**
	 * @return : devuelve el número en formato de una cadena de texto
	 */
	public String mostrar() {
		String numero = valor_inicial;
		if (numero.length() == 1 && Integer.parseInt(numero) > 0) {
			return (numero + " = " + numero);
		} else if (Integer.parseInt(numero) < 0) {
			return ("");
		} else {
			int suma = 0;
			for (int i = 0; i < valor_inicial.length(); i++) {
				String digito = Character.toString(valor_inicial.charAt(i));
				suma = suma + Integer.parseInt(digito);
			}
			numero = Integer.toString(suma);
		}
		return numero;
	}

}
