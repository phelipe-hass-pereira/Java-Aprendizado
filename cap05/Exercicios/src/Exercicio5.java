/*
 5 - Faça uma classe que simule a ocupação de quartos de hotel.
 Considere que existem cinco andares e dez quartos por andar. O
 objetivo é saber se um quarto está ou não ocupado. A classe deve
 possuir um menu com as opções: 1-Imprimir lista de quartos,
 2 - Definir ocupação e 3 - Sair. A opção 1 lista todos os quartos,
 informando se estão ou não ocupados, a opção 2 permite definir o status
 "ocupado" ou "livre" para qualquer um dos quartos. A opção 3 encerra o programa.
 */
import java.util.*;
public class Exercicio5 {
	public static String[][] hotel = new String[5][10];
	public static void main(String[] args) {		
		String resp = "";
		Scanner dado;
		hotel();
		while(true) {
			System.out.println("---Hotel Neblon---\nOpções:");
			System.out.println("1 - Imprimir lista de quartos;\n2 - Definir ocupação;\n3 - Sair");
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
		System.out.println("--Definir ocupação de quartos(0 para voltar)--");
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
