/*
 4- Fa�a uma classe contendo um array bidimensional
 que recebe o nome e o sexo de cinco pessoas; a seguir
 o usu�rio fornece o sexo das pessoas que devem ser
 apresentadas em tela.
 */
import java.util.*;
public class Exercicio4 {
	public static void main(String[] args) {
		String[][] infoPessoas = new String[5][2];
		Scanner dado;
		String sexo = "";
		int linha = 0, coluna = 0;
		try {
			for(linha = 0;linha<5;linha++) {
				System.out.println("Forne�a o nome da pessoa " + (linha+1));
				dado = new Scanner(System.in);
				infoPessoas[linha][0] = dado.next();
				System.out.println("Forne�a o sexo da pessoa " + (linha+1));
				dado = new Scanner(System.in);
				infoPessoas[linha][1] = dado.next();
			}
			System.out.println("Forne�a o sexo das pessoas que queres buscar:");
			dado = new Scanner(System.in);
			sexo = dado.next();
			for(linha = 0;linha < 5;linha++) {
				if(infoPessoas[linha][1].equals(sexo)) {
					System.out.println(infoPessoas[linha][0]);
				}
			}
		}catch(Exception erro) {
			System.out.println("Houve um erro na entrada de dados: " + erro.toString());
		}
		System.exit(0);
	}
}
