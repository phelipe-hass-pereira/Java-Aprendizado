/*
 *1 - Elabore uma classe que receba dez nomes de pessoas por meio
 *de showInputDialog, armazene esses nomes em um array de dez 
 *elementos, sorteie um ganhadore imprima o seu nome em tela.
 */
import java.util.*;
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner dado;
		String[] nomes = new String[10];
		System.out.println("Forneça nomes de dez pessoas");
		for(int i=0;i<10;i++) {
			System.out.println("Forneça o nome da pessoa: " + (i+1));
			dado = new Scanner(System.in);
			nomes[i] = dado.next();
		}
		int sorteado = (int) (Math.random() * 10);
		System.out.println("sorteado é: " + nomes[sorteado] );
	}
}
