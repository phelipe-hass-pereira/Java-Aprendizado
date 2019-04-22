package ExerciciosCap02.src;
/*
2 - Fa�a uma classe que simule a abertura de uma conta
banc�ria cujo saldo inicial seja zero. A seguir, simule
um dep�sito num valor qualquer e mostre o saldo atual.
depois disso, simule uma retirada (d�bito) qualquer e 
apresente o saldo final.
 */
import java.util.*;
public class Exercicio2{
	public static void main(String[] args){
		String nome = "", cpf = "";
		double saldo = 0.00, deposito = 0.00, debito = 0.00;
		Scanner dado;
		try{
			System.out.println("---Conta Corrente - Banco Farofa---");
			System.out.println("Nome : Juca da Peste");
			System.out.println("Saldo : " + saldo);

			System.out.println("----Deposito----");
			System.out.println("Valor a ser depositado");
			dado = new Scanner(System.in);
			deposito = dado.nextFloat();
			saldo = (saldo + deposito);

			System.out.println("----Debito----");
			System.out.println("Valor a ser debitado");
			dado = new Scanner(System.in);
			debito = dado.nextFloat();
			saldo = (saldo - debito);

			System.out.println("Saldo: " + saldo);
			
		}
		catch(Exception erro){
			System.out.println("Houve um erro na entrada de dados" + erro.toString());
		} 
		System.exit(0);
	}
}