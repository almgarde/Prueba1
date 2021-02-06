package empleado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class EmpleadoTest {

	Empleado e1;
	Empleado e2;

	@BeforeEach
	void setUp() throws Exception {
		e1 = new Empleado();
		e2 = new Empleado();
	}

	
	@ParameterizedTest(name = "Test PlusSalario SueldoPlus")
	@CsvSource({
			"20,    1000.0,   200.0,   1000.0",
			"45,    1000.0,   200.0,   1200.0"
			
	})
	
	void testPlusSalario(int edad, double salario, double sueldoPlus, double ResultadoEsperado) throws Exception {
		e1 = new Empleado("nombre", "apellido", edad, salario);
		e1.plus(sueldoPlus);
		assertEquals(ResultadoEsperado, e1.getSalario());
	}
	
	
	@ParameterizedTest(name = "Test PlusSalario Boolean")
	@CsvSource({
			"20,   200.0,   false",
			"45,   200.0,   true"
			
	})
	
	void testPlusReturnBoolean(int edad, double sueldoPlus, boolean ResultadoEsperado) throws Exception {
		e1 = new Empleado("nombre", "apellido", edad);

		assertEquals(ResultadoEsperado, e1.plus(sueldoPlus));
	}
	
	
	@ParameterizedTest(name = "Test EqualsEmpleado")
	@CsvSource({
			"Pedro,    Morales,   Antonio,   Cortegoso,   false",
			"Pablo,    Oria,      Pablo,     Lopez,       false",
			"Desiré,   Lucas,     Desiré,    Lucas,       true",
			"Manuel,   Torres,    Rafael,    Torres,      false"
	})
	
	
	void testEqualsEmpleado(String nombre1, String apellido1, String nombre2, String apellido2,
			boolean ResultadoEsperado) throws Exception {
		e1 = new Empleado(nombre1, apellido1);
		e2 = new Empleado(nombre2, apellido2);
		assertEquals(ResultadoEsperado, e1.equals(e2));
	}
	
	
	
	
	@ParameterizedTest(name = "Test CompareTo")
	@CsvSource({
			"15,   25,   -1",
			"20,   20,    0",
			"25,   15,    1"
				
	})
	void testCompareToEmpleado(int edad1, int edad2, int expectedResult) throws Exception {
		e1 = new Empleado("nombre", "apellido", edad1);
		e2 = new Empleado("nombre", "apellido", edad2);
		assertEquals(expectedResult, e1.compareTo(e2));
	}

}
