package Viedo.tutorial.Ejemplo_maven;

import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
	private static Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
		System.out.println("Hello World!");
		logger.error("Hello World with Log4j" + args[0]);

		Scanner scan = new Scanner(System.in);

		int opcion;
		String opcionStr;
		String numero;
		float numero1;
		float numero2;
		float resultado;
		do {
			System.out.println("Elije una opción:");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			opcionStr = scan.nextLine();
			opcion = Integer.parseInt(opcionStr);
		} while (opcion < 1 || opcion > 4);
		switch (opcion) {
		case 1:
			System.out.print("Escribe el 1º número: ");
			numero = scan.nextLine();
			numero1 = Integer.parseInt(numero);
			System.out.print("Escribe el 2º número: ");
			numero = scan.nextLine();
			numero2 = Integer.parseInt(numero);
			resultado = numero1 + numero2;
			System.out.print("El resultado de la operación es: " + numero1 + " + " + numero2 + " = " + resultado);
			break;
		case 2:
			System.out.print("Escribe el 1º número: ");
			numero = scan.nextLine();
			numero1 = Integer.parseInt(numero);
			System.out.print("Escribe el 2º número: ");
			numero = scan.nextLine();
			numero2 = Integer.parseInt(numero);
			resultado = numero1 - numero2;
			System.out.print("El resultado de la operación es: " + numero1 + " - " + numero2 + " = " + resultado);
			break;
		case 3:
			System.out.print("Escribe el 1º número: ");
			numero = scan.nextLine();
			numero1 = Integer.parseInt(numero);
			System.out.print("Escribe el 2º número: ");
			numero = scan.nextLine();
			numero2 = Integer.parseInt(numero);
			resultado = numero1 * numero2;
			System.out.print("El resultado de la operación es: " + numero1 + " * " + numero2 + " = " + resultado);
			break;
		case 4:
			System.out.print("Escribe el 1º número: ");
			numero = scan.nextLine();
			numero1 = Integer.parseInt(numero);
			System.out.print("Escribe el 2º número: ");
			numero = scan.nextLine();
			numero2 = Integer.parseInt(numero);
			resultado = numero1 / numero2;
			System.out.print("El resultado de la operación es: " + numero1 + " / " + numero2 + " = " + resultado);
			break;
		}
	}
}