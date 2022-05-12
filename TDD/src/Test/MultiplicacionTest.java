package Test;

import org.junit.jupiter.api.Test;

import Operaciones.Operaciones;

class MultiplicacionTest {

	@Test
	void test() {
		
		Operaciones operaciones = new Operaciones();
		operaciones.multiplicacion(5,10);
	}

}
