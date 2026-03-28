package solucion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException{
		
		File arch = new File("Usuarios.txt");
		Scanner lector = new Scanner(arch);
		Scanner s = new Scanner(System.in);
		
		System.out.println("1) Menu de usuarios");
		System.out.println("2) Menu de analisis");
		System.out.println("3) Salir");
		System.out.print("> ");
		
		int opcion = s.nextInt();
		
		switch (opcion) {
		case 1:
			System.out.print("Usuario: ");
			String usuario = s.next();
			System.out.print("Contraseña: ");
			String contraseña = s.next();
			

		}
		
				
		
		while (lector.hasNextLine()) {
			String linea = lector.nextLine();
			String[] partes = linea.split(";");
			
			String usuario = partes [0];
			String contraseña = partes[1];
			System.out.printf("Tu usuario es %s, y tu contraseña es %s \n", usuario, contraseña);
			//
		}
		
		lector.close();

	}

}