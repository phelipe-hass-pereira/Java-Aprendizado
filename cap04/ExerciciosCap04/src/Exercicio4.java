/*
4 - Construa uma classe que receba uma frase qualquer e mostre essa
 frase sem nenhuma vogal.
 */
import java.util.*;
public class Exercicio4 {
	public static void main(String[] args) {
		Scanner dado;
		String frase = "", fraseSemVogais = "";
		char vogal;
		System.out.println("Forneça uma frase qualquer");
		dado = new Scanner(System.in);
		frase = dado.nextLine();
		fraseSemVogais = frase.replace('a', ' ');
		fraseSemVogais = frase.replace('e', ' ');
		fraseSemVogais = frase.replace('i', ' ');
		fraseSemVogais = frase.replace('o', ' ');
		fraseSemVogais = frase.replace('u', ' ');
		/*for(vogal = 'a'; vogal <='u'; vogal++) {
			fraseSemVogais = frase.replace(vogal, ' ');
		}*/

		System.out.println("Frase fornecida: " + frase + "\nFrase sem vogais: " + fraseSemVogais);
		System.exit(0);
	}
}