package ejercicios3;

import java.util.Scanner;

public class Ejercicio2 {

    public int calculo1() {
        int resultado = -16 + (32 / 4);
        return resultado;
    }
    
    public int calculo2() {
        int resultado = ((48 - 7) % 11);
        return resultado;
    }
    
    public int calculo3() {
        int resultado = (18 + 2) / (17 - 12);
        return resultado;
    }
    
    public int calculo4() {
        int resultado = 17 - 18 / (6 * 3) + (11 % 4);
        return resultado;
    }

    public static void main(String[] args) {
        Ejercicio2 resultados = new Ejercicio2();
        
        int resultado1 = resultados.calculo1();
        System.out.println("El primer resultado es: " + resultado1);
        
        int resultado2 = resultados.calculo2();
        System.out.println("El segundo resultado es: " + resultado2);
        
        int resultado3 = resultados.calculo3();
        System.out.println("El tercer resultado es: " + resultado3);
        
        int resultado4 = resultados.calculo4();
        System.out.println("El cuarto resultado es: " + resultado4);
    }
}
