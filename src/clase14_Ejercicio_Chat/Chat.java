package clase14_Ejercicio_Chat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chat {

	public static void main(String[] args) {
		
		List<String> mensajesGuardados = new ArrayList<String>();
		Scanner obj = new Scanner(System.in);
		String opcion = "S";
		
		System.out.println("Ingrese su nombre");
		String nombre = obj.nextLine();
		
		while (opcion.equalsIgnoreCase("S")) {
			
			System.out.println("Ingrese la opción que quiera: \n"
							+ "1 para escribir un mensaje \n"
							+ "2 para leer todos los mensajes");
			
			opcion = obj.nextLine();
			
			switch (opcion) {
			case "1":
				escribirMensajes(mensajesGuardados);
				break;
			case "2":
				leerMensajes(mensajesGuardados);
				break;
				default:
					break;		
			}
			
			System.out.println("Desea continuar con las opciones? S o N");
			opcion = obj.nextLine();

		}
	}
	
	public static void escribirMensajes(List<String> listaDeMensajes) {
		
		Scanner texto = new Scanner(System.in);
		listaDeMensajes.add(texto.nextLine());
		
	}
	
	public static void leerMensajes(List<String> listaDeMensajes) {
		
		for (String mensaje : listaDeMensajes) {
			System.out.println(mensaje);
		}
		
	}

}
