import java.util.Scanner;

public class Main {

	public  static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese su edad actual en años: ");
		int edad = scanner.nextInt();
	
		Persona persona = new Persona(edad);
		persona.calcularAñosHastaJubilacion();

	}
}








