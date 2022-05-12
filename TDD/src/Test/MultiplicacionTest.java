package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Operaciones.Operaciones;

class MultiplicacionTest {

	@Test
	void test() {
		
		Operaciones operaciones = new Operaciones();
		operaciones.multiplicacion();
	}

}
