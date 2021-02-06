package cuentas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MovimientoTest {

	Movimiento m;

	@BeforeEach
	void setUp() throws Exception {
		m = new Movimiento();
	}

	@Test
	void testGetImporte() {
		m.setImporte(50.0);
		assertEquals(50.0, m.getImporte());
	}

	@Test
	void testGetConcepto() {
		m.setConcepto("Ingreso");
		assertEquals("Ingreso", m.getConcepto());
	}

	@Test
	void testSetConcepto() {
		m.setConcepto("Retiro");
		assertEquals("Retiro", m.getConcepto());
	}

	@Test
	void testSetImporte() {
		m.setImporte(100.0);
		assertEquals(100.0, m.getImporte());
	}

}
