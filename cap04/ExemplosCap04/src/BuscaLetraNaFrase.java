package src;

public class BuscaLetraNaFrase {
	public static void main(String[] args) {
		String frase = "Livro Java 7 - Ensino didatico";
		char caractere = 'a';
		System.out.println("Frase: " + frase + "\nÍndice: " + frase.indexOf(caractere) +
				", " + frase.indexOf(caractere, 10) + ", " + frase.indexOf("Ensino") +
				", " + frase.indexOf("Java", 15));
		System.exit(0);
	}
}
