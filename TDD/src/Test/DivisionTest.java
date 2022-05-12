package Test;

import org.junit.jupiter.api.Test;

import Operaciones.Operaciones;

class DivisionTest {

	@Test
	void test() {
		Operaciones operaciones = new Operaciones();
		operaciones.division(100,10);
	}

}
