package cl.tsoft.calculadora.interfaz.PruebaViernes;

import cl.tsoft.calculadora.logica.Decimal;

public class DecimalTest {


	public void testSuma() {
		int numeroA = 5;
		int numeroB = 5;
		int resultado = 10;
		Decimal sistema = new Decimal();
		sistema.setNumeroA(numeroA);
		sistema.setNumeroB(numeroB);
		sistema.setResultado(resultado);
		sistema.suma();
		resultado = sistema.getResultado();
		assertEquals(10, resultado);
		}
	
	private void assertEquals(int i, int resultado) {
		// TODO Auto-generated method stub
		
	}


	public void testResta() {
		int numeroA = 5;
		int numeroB = 5;
		int resultado = 0;
		Decimal sistema = new Decimal();
		sistema.setNumeroA(numeroA);
		sistema.setNumeroB(numeroB);
		sistema.setResultado(resultado);
		sistema.resta();
		resultado = sistema.getResultado();
		assertEquals(0, resultado);
	}

	public void testMultiplicacion() {
		int numeroA = 5;
		int numeroB = 5;
		int resultado = 25;
		Decimal sistema = new Decimal();
		sistema.setNumeroA(numeroA);
		sistema.setNumeroB(numeroB);
		sistema.setResultado(resultado);
		sistema.multiplicacion();
		resultado = sistema.getResultado();
		assertEquals(25, resultado);
	}

	public void testDivision() {
		int numeroA = 5;
		int numeroB = 5;
		int resultado = 1;
		Decimal sistema = new Decimal();
		sistema.setNumeroA(numeroA);
		sistema.setNumeroB(numeroB);
		sistema.setResultado(resultado);
		sistema.division();
		resultado = sistema.getResultado();
		assertEquals(1, resultado);
	}
}
