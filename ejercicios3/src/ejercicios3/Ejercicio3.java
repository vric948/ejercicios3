package ejercicios3;

import java.util.Scanner;

public class Ejercicio3 {
	
	public float primerValor;
	public float segundoValor;
	public float resultado;
	
	public void obtenerValores() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero entre 3 y 17");
		primerValor = input.nextFloat();
		System.out.println("Ingrese otro numero entero entre 3 y 17");
		segundoValor = input.nextFloat();
	}
	public void calculo(float valor1, float valor2) {
	    resultado = valor1 / valor2;
	    convertirDecimal();
	}
	public void convertirDecimal() {
	    resultado = Math.round(resultado * 100) / 100f;
	}
	public static void main(String[] args) {
		Ejercicio3 cociente1 = new Ejercicio3();
		cociente1.obtenerValores();
		cociente1.calculo(cociente1.primerValor, cociente1.segundoValor);
		
		System.out.println("El cociente es: " + cociente1.resultado);
	}
}
