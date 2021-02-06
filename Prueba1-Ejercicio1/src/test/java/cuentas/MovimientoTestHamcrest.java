package cuentas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class MovimientoTestHamcrest {

	Movimiento m;

	@BeforeEach
	void setUp() throws Exception {
		m = new Movimiento();
	}

	@Test
	void testGetImporte() {
		m.setImporte(50.0);
		assertThat(50.0, is(m.getImporte()));
	}

	@Test
	void testGetConcepto() {
		m.setConcepto("Ingreso");
		assertThat("Ingreso", is(m.getConcepto()));
	}

	@Test
	void testSetConcepto() {
		m.setConcepto("Ingreso");
		assertThat("Ingreso", is(m.getConcepto()));
	}

	@Test
	void testSetImporte() {
		m.setImporte(50.0);
		assertThat(50.0, is(m.getImporte()));
	}

}
