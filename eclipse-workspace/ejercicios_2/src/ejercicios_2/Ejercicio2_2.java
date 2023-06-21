package ejercicios_2;

import java.util.Scanner;

public class Ejercicio2_2 {
	
	public String nombre;
	public byte edad;
	
	public void ingresarDatos() {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Ingrese nombre");
			nombre = input.nextLine();
			
			System.out.println("Ingrese edad");
			edad = input.nextByte();
		}
	}
	
	public void imprimirDatos() {
		System.out.println("Sus datos son los siguientes" + System.lineSeparator() + "Nombre: " + nombre + System.lineSeparator() + "Edad: " + edad);
		
	}
	
	public void saludo() {
		System.out.println("Bienvenido/a " + nombre);
	}
	public static void main(String[] args) {
		Ejercicio2_2 persona = new Ejercicio2_2();
				
		persona.ingresarDatos();
        persona.imprimirDatos();
        persona.saludo();

	}

}