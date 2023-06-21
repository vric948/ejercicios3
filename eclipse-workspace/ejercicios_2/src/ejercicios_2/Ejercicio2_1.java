package ejercicios_2;

	import java.util.Scanner;

	public class Ejercicio2_1 {
		public static void main(String[] args) {
			 Scanner input = new Scanner (System.in);
			 
			 System.out.println("Ingrese el primer valor numérico");
			 float primerValor = input.nextFloat();
			 
			 System.out.println("Ingrese el segundo valor numérico");
			 float segundoValor = input.nextFloat();
			 
			 System.out.println("Ingrese el tercer valor numérico");
			 float tercerValor = input.nextFloat();

			 float mayor = obtenerMayor(primerValor, segundoValor, tercerValor);
			 float menor = obtenerMenor(primerValor, segundoValor, tercerValor);
			 
			 System.out.println("El valor mayor es: " + mayor);
			 System.out.println("El valor menor es: " + menor);
			 
			 input.close();
			 
		}
		public static float obtenerMayor(float a, float b, float c) {
			float mayor = Math.max(a, Math.max(b, c));
			return mayor;
		}
		
		public static float obtenerMenor(float a, float b, float c) {
			float menor = Math.min(a, Math.min(b, c));
			return menor;
			
		}
	}