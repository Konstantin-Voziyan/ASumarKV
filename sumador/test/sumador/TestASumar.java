package sumador;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * 
 * @author Konstantin Voziyan
 * @version 1
 * @since 26.2.2019
 *
 */
public class TestASumar {

	/**
	 * 
	 */
	@Test
	public void testUnaCifra() {
		ASumar sumi = new ASumar("5");
		String resultado = sumi.mostrar();
		assertEquals("5 = 5", resultado);
	}

	/**
	 * 
	 */
	@Test
	public void testUnaCifraNegativa() {
		ASumar sumi = new ASumar("-5");
		String resultado = sumi.mostrar();
		assertEquals("", resultado);
	}

	/**
	 * 
	 */
	@Test
	public void testUnaCifraMayorDeDiez() {
		ASumar sumi = new ASumar("14");
		String resultado = sumi.mostrar();
		assertEquals("5", resultado);
	}

}
