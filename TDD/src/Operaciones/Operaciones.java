package Operaciones;

public class Operaciones {

	private int resultado;
	
	public void suma(int numero1, int numero2) {
		resultado = numero1+numero2;
		System.out.println("El resultado de la suma es: "+ resultado);
	}


	public void resta(int numero1, int numero2) {
		resultado = numero1-numero2;
		System.out.println("El resultado de la resta es: "+ resultado);

	}
	
	public void multiplicacion(int numero1, int numero2) {

		resultado = numero1*numero2;

		System.out.println("El resultado de la multiplicacion es: "+ resultado);

	}
	
	public void division(int numero1, int numero2) {

		resultado=numero1/numero2;

		System.out.println("El resultado de la division es: "+ resultado);

	}

}
