/*
 Um vendedor camarada oferece pequenos descontos na venda de seus produtos. Faça
 uma classe que receba o valor da venda e um percentual de desconto. Além de calcular
 o desconto, o valor final deve ser arredondado para baixo, isto é, para o valor inteiro
 anterior.
 */
import java.util.*;
public class Exercicio2 {
	public static void main(String[] args) {
		Scanner dado;
		double valorProduto = 0.00, desconto = 0.00, valorFinal = 0.00;
		try {
			System.out.println("Informe o valor do produto");
			dado = new Scanner(System.in);
			valorProduto = dado.nextDouble();
			desconto = (int) (Math.random() * 15);
			valorFinal = valorProduto - (valorProduto*(desconto/100));
			System.out.println("Valor original: " + valorProduto +
					"\nPercentual de desconto: " + desconto +
					"\nValor final com desconto: " + Math.floor(valorFinal));
		}catch(Exception erro) {
			System.out.println("Erro na entrada de dados " + erro.toString());
		}
		System.exit(0);
		
	}
}
