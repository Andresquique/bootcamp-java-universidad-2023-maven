package ar.com.educacionit;

import java.util.Scanner;

public class Menu {

	
	
	public static void mostrarMenu() {
		System.out.println("(1) Search by name\r\n"
				+ "(2) Search by email\\r\\n"
				+ "(3) Search by ID\\r\\n"
				+ "(4) List All"
				);
	}
	
	public static Integer getOp(Scanner teclado) {
		Integer op = null;
		do {
			try {
			System.out.println("Ingrese opcion deseada");
			op = teclado.nextInt();}
			catch (Exception e) {
				System.err.println("opcion erronea");		}
			}while (op == null);
		return op;	
	}
	
}
