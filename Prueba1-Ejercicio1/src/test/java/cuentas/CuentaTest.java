package cuentas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {

	Cuenta cuenta;

	@BeforeEach
	void setUp() throws Exception {
		cuenta = new Cuenta("1111.2222.12.1234567890", "Fulanito");
	}

	@Test
	void testIngresar() {
		try {
			cuenta.ingresar("Ingreso", 1000);

		} catch (Exception e) {
			fail("No debería fallar");
		}
		assertTrue(cuenta.getSaldo() == 1000.0);
	}

	
	@Test
	void testIngresarNegativoExcepcion() {
		try {
			cuenta.ingresar("Ingreso", -1000);

		} catch (Exception e) {
			fail("No se pueden hacer ingresos negativos");
		}
		assertTrue(cuenta.getSaldo() == -1000.0);
	}
	@Test
	void testRetirar() {
		try {
			cuenta.ingresar("Ingreso", 1000);
			cuenta.retirar("Retirada", 400);
		} catch (Exception e) {
		}
		assertTrue(cuenta.getSaldo() == 600.0);
	}
	
	@Test
	void testRetirarImporteNegativoExcepcion() {
		try {
			cuenta.ingresar("Ingreso", 1000);
			cuenta.retirar("Retiro", -100);

		} catch (Exception e) {
			fail("No se pueden hacer retiros negativos");
		}
		assertTrue(cuenta.getSaldo() == -100.0);
	}
	
	@Test
	void testRetirarImporteExcepcion() {
		try {
			cuenta.ingresar("Ingreso", 1000);
			cuenta.retirar("Retiro", 2000);

		} catch (Exception e) {
			fail("Saldo insuficiente");
		}
		assertTrue(cuenta.getSaldo() == -100.0);
	}

	@Test
	void testGetSaldo() {
		try {
			Movimiento m = new Movimiento();
			cuenta.ingresar("ingreso", 100);
			m.getImporte();
		} catch (Exception e) {
		}
		assertEquals(100.0, cuenta.getSaldo());
	}

}
