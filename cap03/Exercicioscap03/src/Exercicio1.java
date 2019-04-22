/*
 Exercício1: Elabore uma classe que receba um valor
 de um produto e um codigo de desconto. O desconto
 deve ser calculado de acordo com o codigo fornecido
 conforme a tabela 3.1
 */
import java.util.*;
import javax.swing.*;
public class Exercicio1 {
	public static void main(String[] args) {
		double valor = 0f, valorDesc = 0f;
		int codDesconto = 0;
		String info = "";
		Scanner dado;
		try {
			System.out.println("Informe o valor do produto");
			dado = new Scanner(System.in);
			valor = dado.nextDouble();
			if(valor <= 0) {
				System.out.println("Valor do produto informado e invalido!!");
				System.exit(0);
			}
			else {
				System.out.println("Informe o codigo de desconto do produto(codigo de 1 a 4)");
				dado = new Scanner(System.in);
				codDesconto = dado.nextInt();
				
				switch(codDesconto) {
				case 1: valorDesc = valor - (valor*0.05); break;
				case 2: valorDesc = valor - (valor*0.1); break;
				case 3: valorDesc = valor - (valor*0.2); break;
				case 4: valorDesc = valor - (valor*0.5); break;
				default: System.out.println("Codigo informado inexistente");
				System.exit(0);
				}
				System.out.println("Valor do produto:R$ " + valor + "\nCodigo do desconto: " + codDesconto + "\nValor do produto com desconto:R$ " + valorDesc);
			}
			
			
		}catch(NumberFormatException erro) {
			System.out.println("Numero fornecido nao e inteiro" + erro.toString());
		}
		catch(Exception erro) {
			System.out.println("Houve erro na entrada de dados"  +erro.toString());
		}
		System.exit(0);
	}
}
