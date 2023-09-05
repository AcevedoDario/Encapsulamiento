package monedero.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import monedero.main.Monedero;

class MonederoTest {

	@Test
	public void verificarDinero() {
		Monedero mon = new Monedero(15);
		assertEquals(15.0, mon.verDinero());
	}
	
	@Test
	public void verificarMeterDinero() {
		Monedero mon = new Monedero(20);
		mon.meter(1.0);
		assertEquals(21.0, mon.verDinero());
	}
	
	@Test
	public void verificarSacarDinero() {
		Monedero mon = new Monedero(20);
		mon.sacar(1.0);
		assertEquals(19.0, mon.verDinero());
	}
	

}
