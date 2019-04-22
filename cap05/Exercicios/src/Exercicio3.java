/*
 3- Faça uma classe que gere aleatoriamente mil números
 inteiros quaisquer e os armazene num array bidimensional
 (considere 50 linhas e 20 colunas). A seguir, peça ao 
 usuário digitar um número para ser pesquisado no array.
 Informe ao usuário se o número existe ou não no array.
 */
import java.util.*;
public class Exercicio3 {
	public static void main(String[] args) {
		int num[][] = new int[50][20];
		Scanner dado;
		String mensagem = "Não foi encontrado o número";
		int numero;
		for(int linha = 0; linha < 50; linha++)
			for(int coluna = 0; coluna < 20; coluna++) {
				num[linha][coluna] = (int) (Math.random() * 1000);
			}
		System.out.println("Digite um número inteiro");
		dado = new Scanner(System.in);
		numero = dado.nextInt();
		for(int linha = 0; linha<50;linha++)
			for(int coluna = 0;coluna<20;coluna++)
			{
				if(numero == num[linha][coluna]) {
					mensagem = "Foi encontrado o número";
					break;
				}
			}
		System.out.println(mensagem);
		System.exit(0);
	}
}
