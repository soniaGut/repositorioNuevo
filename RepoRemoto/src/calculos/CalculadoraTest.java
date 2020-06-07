package calculos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	static Calculadora calc;
	
	@BeforeAll
	static void inicializar() {
		calc = new Calculadora(23, 12);
	}
	
	@Test
	void testSuma() {
		
		int resultado = calc.suma();
		assertEquals(35, resultado);
		assertNotNull(resultado);
	}

	@Test
	void testResta() {
	}

	@Test
	void testMultiplica() {
		float resultado = calc.multiplica();
		assertEquals(resultado, 50);
		assertNull(resultado);
	}

	@Test
	void testDivide() {
		float resultado = calc.divide();
		assertEquals(resultado, 5);
	}
}
