/*
 2- Crie uma classe que receba dez n�meros, armazene esses
 n�meros em um array de dez elementos e apresente em tela
 as somas dos n�meros, o maior e o menor.
 */
import java.util.*;
public class Exercicio2 {
	public static void main(String[] args) {
		float num[] = new float[10];
		float soma = 0.0f, maior = 0.f, menor = 0.0f;
		Scanner dado;
		System.out.println("Forne�a dez n�meros");
		for(int i = 0;i < 10; i ++) {
			System.out.println("Forne�a o n�mero " + (i+1));
			dado = new Scanner(System.in);
			num[i] = dado.nextFloat();
			soma += num[i];
		}
		maior = num[0];
		menor = num[0];
		for(int i=0;i<10;i++) {
			if(maior<num[i])
				maior = num[i];
			if(menor>num[i])
				menor = num[i];
		}
		System.out.println("A soma dos n�mero �: " + soma +
				"\nO maior n�mero �: " + maior + "\nO menor n�mero �: " + menor);
		
	}
}
