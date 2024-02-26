
public class Persona {

	private int edadActual;

	public Persona(int edadActual) {
		this.edadActual = edadActual;
		
	}

	public void calcularAñosHastaJubilacion() {
		int añosParaJubilacion = 67 - edadActual;
		
		if (añosParaJubilacion < 10) {
			System.out.println("Sóla te quedan " + añosParaJubilacion + " años. !Vamos que ya queda poco");
		} else if (añosParaJubilacion > 20) {
			System.out.println("Te quedan " + añosParaJubilacion + " años. !A seguir trabajando gandul!");
		} else {
			System.out.println("Te quedan " + añosParaJubilacion + "años para jubilarte.");
			

		}

	}

}
