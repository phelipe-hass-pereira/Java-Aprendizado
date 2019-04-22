/*
 5 - Fa�a uma classe que simule a ocupa��o de quartos de hotel.
 Considere que existem cinco andares e dez quartos por andar. O
 objetivo � saber se um quarto est� ou n�o ocupado. A classe deve
 possuir um menu com as op��es: 1-Imprimir lista de quartos,
 2 - Definir ocupa��o e 3 - Sair. A op��o 1 lista todos os quartos,
 informando se est�o ou n�o ocupados, a op��o 2 permite definir o status
 "ocupado" ou "livre" para qualquer um dos quartos. A op��o 3 encerra o programa.
 */
import java.util.*;
public class Exercicio5 {
	public static String[][] hotel = new String[5][10];
	public static void main(String[] args) {		
		String resp = "";
		Scanner dado;
		hotel();
		while(true) {
			System.out.println("---Hotel Neblon---\nOp��es:");
			System.out.println("1 - Imprimir lista de quartos;\n2 - Definir ocupa��o;\n3 - Sair");
			dado = new Scanner(System.in);
			resp = dado.next();
			switch(resp) {
			case "1":{
				imprimirQuartos();
				break;
			}
			case "2":{
				definirOcupacao();
				break;
			}
			case "3":{
				System.exit(0);
			}
			}
		}
	}
	
	public static void imprimirQuartos() {
		for(int linha = 0; linha < 5; linha++) {
			for(int coluna = 0; coluna < 10; coluna++) {
				System.out.println("Andar " + (linha+1) +" quarto " + (coluna+1) + ": " + hotel[linha][coluna]);
			}
		}
	}
	
	public static void definirOcupacao() {
		int andar = 0, quarto = 0;
		System.out.println("--Definir ocupa��o de quartos(0 para voltar)--");
		System.out.println("Qual andar");
		Scanner dado  = new Scanner(System.in);
		andar = dado.nextInt();
		System.out.println("");
	}
	
	public static void hotel() {
		for(int linha = 0; linha < 5; linha++) {
			for(int coluna = 0; coluna < 10; coluna++) {
				hotel[linha][coluna] = "Livre";
			}
		}
	}
}
