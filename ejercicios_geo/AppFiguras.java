package ejercicios_geo;

import java.util.Scanner;

public class AppFiguras {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int opcion = 0;

		while (opcion != 5 && opcion >= 1 && opcion <= 5) {
			System.out.print("MENU DE OPCIONES OPRIMA EL NUMERO DESEADO");
			System.out.print("\n1.- Cubo");
			System.out.print("\n2.- Cilindro");
			System.out.print("\n3.- Cono");
			System.out.print("\n4.- Esfera");
			System.out.print("\n5.- Salir \n");
			opcion = entrada.nextInt();

			switch (opcion) {
			case 1:
				System.out.print("Ingresa el tamano de la artista");
				double arista = entrada.nextDouble();
				Cubo myNewCube = new Cubo(arista);
				myNewCube.calcularVolumen();
				System.out.println(myNewCube.getVolumen());
				break;
			default:
				System.out.print("Opcion no valida");
				opcion = 6;
			}
		}

		entrada.close();

	}

}
