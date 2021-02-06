package empleado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class EmpleadoTestHamcrest {

	Empleado e1;
	Empleado e2;

	@BeforeEach
	void setUp() throws Exception {
		e1 = new Empleado();
		e2 = new Empleado();
	}

	@Test
	void testEqualsEmpleado() {
		e1 = new Empleado("Alma", "García");
		e2 = new Empleado("Alma", "García");
		assertThat(true, is(e1.equals(e2)));

	}

	@Test
	void testCompareTo() {
		e1 = new Empleado("Alma", "García", 31);
		e2 = new Empleado("Alma", "García", 31);
		assertThat(0, is(e1.compareTo(e2)));

		e1 = new Empleado("Alma", "García", 20);
		e2 = new Empleado("Alma", "García", 30);
		assertThat(-1, is(e1.compareTo(e2)));

		e1 = new Empleado("Alma", "García", 30);
		e2 = new Empleado("Alma", "García", 20);
		assertThat(1, is(e1.compareTo(e2)));
	}

	@Test
	void testPlus() {

		e1 = new Empleado("Alma", "García", 20, 1000);
		assertThat(false, equalTo(e1.plus(100)));
		assertThat(1000.0, is(e1.getSalario()));

		e1 = new Empleado("Alma", "García", 50, 1000);
		assertThat(true, equalTo(e1.plus(100)));
		assertThat(1100.0, is(e1.getSalario()));
	}

}
