package ExemplosCap04;

public class TrocandoCaractere {
	public static void main(String[] args) {
		String frase = "O macaco come banana";
		System.out.println("Frase: " + frase + 
				"\nRetirando os espaços: " + frase.replace(" ", "") +
				"\nSubstituindo a por u: "  + frase.replace("a","u"));
		System.exit(0);
	}
}
