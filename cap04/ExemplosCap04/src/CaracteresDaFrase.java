package src;
import java.util.*;
public class CaracteresDaFrase {
	public static void main(String[] args) {
		String frase = "Aprendendo Java", trecho = "";
		for(int i = 11; i <= 14; i++) {
			trecho += frase.charAt(i);
		}
		System.out.println("Frase: " + frase +
				"\nCaractere 2: " + frase.charAt(1) +
				"\nTrecho: " + trecho);
		System.exit(0);
	}
}
