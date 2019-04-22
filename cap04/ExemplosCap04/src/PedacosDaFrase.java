package src;

public class PedacosDaFrase {
	public static void main(String[] args) {
		String frase = "Linguagem Java";
		System.out.println("Frase: " + frase +
				"\n(0,2): " + frase.substring(0,2) +
				"\n(3,8): " + frase.substring(3,8) +
				"\n(9,11): " + frase.substring(9,11) +
				"\n(12,14): "  +frase.substring(12,14));
	}
}
