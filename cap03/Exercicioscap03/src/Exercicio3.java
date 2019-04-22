/*
 3 - Elabore uma classe em que o usuário fornece dois números e
 uma letra correspondente à operação desejada.
 */
import java.util.*;
public class Exercicio3 {
	public static void main(String[] args) {
		float num1 = 0.0f, num2 = 0.0f;
		Scanner dado;
		String letra = "";
		try {
			System.out.println("Forneça um número");
			dado = new Scanner(System.in);
			num1 = dado.nextFloat();
			System.out.println("Forneça outro número");
			dado = new Scanner(System.in);
			num2 = dado.nextFloat();
			System.out.println("Forneça uma letra correspondente a operação matemática:"
					+ "\nA - soma; B - subtração; C - multiplicação; D - Divisão");
			dado = new Scanner(System.in);
			letra = dado.next();
			switch(letra.toUpperCase()) {
			case "A":{
				System.out.println("Números fornecidos: " + num1 + " e " + num2);
				System.out.println("Operaçao escolhida: soma");
				System.out.println("Resultado da operação: " + (num1+num2));
				break;
			}
			case "B":{
				System.out.println("Números fornecidos: " + num1 + " e " + num2);
				System.out.println("Operaçao escolhida: subtração");
				System.out.println("Resultado da operação: " + (num1-num2));
				break;
			}
			case "C":{
				System.out.println("Números fornecidos: " + num1 + " e " + num2);
				System.out.println("Operaçao escolhida: multiplicação");
				System.out.println("Resultado da operação: " + (num1*num2));
				break;
			}
			case "D":{
				System.out.println("Números fornecidos: " + num1 + " e " + num2);
				System.out.println("Operaçao escolhida: divisão");
				System.out.println("Resultado da operação: " + (num1/num2));
			}
			}
			System.exit(0);
		}catch(Exception erro) {
			System.out.println("Houve um erro na entrada de dados: " + erro.toString());
		}
	}
}
