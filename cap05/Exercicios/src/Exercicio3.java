/*
 3- Fa�a uma classe que gere aleatoriamente mil n�meros
 inteiros quaisquer e os armazene num array bidimensional
 (considere 50 linhas e 20 colunas). A seguir, pe�a ao 
 usu�rio digitar um n�mero para ser pesquisado no array.
 Informe ao usu�rio se o n�mero existe ou n�o no array.
 */
import java.util.*;
public class Exercicio3 {
	public static void main(String[] args) {
		int num[][] = new int[50][20];
		Scanner dado;
		String mensagem = "N�o foi encontrado o n�mero";
		int numero;
		for(int linha = 0; linha < 50; linha++)
			for(int coluna = 0; coluna < 20; coluna++) {
				num[linha][coluna] = (int) (Math.random() * 1000);
			}
		System.out.println("Digite um n�mero inteiro");
		dado = new Scanner(System.in);
		numero = dado.nextInt();
		for(int linha = 0; linha<50;linha++)
			for(int coluna = 0;coluna<20;coluna++)
			{
				if(numero == num[linha][coluna]) {
					mensagem = "Foi encontrado o n�mero";
					break;
				}
			}
		System.out.println(mensagem);
		System.exit(0);
	}
}
