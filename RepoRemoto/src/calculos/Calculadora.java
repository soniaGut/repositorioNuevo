package calculos;

public class Calculadora {
	
	public Calculadora(int num1, int num2) {
		numero1 = num1;
		numero2 = num2;
	}
	
	public int suma () {
		int resultado = numero1 + numero2;
		return 	resultado;
	}
	
	public int resta () {
		int resultado = numero1 - numero2;
		return 	resultado;
	}
	
	public int multiplica () {
		int resultado = numero1 * numero2;
		return 	resultado;
	}
	
	public float divide () {
		float resultado = 0;
		resultado = numero1 / numero2;
		return 	resultado;
	}

}
