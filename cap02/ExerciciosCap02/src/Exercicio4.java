package ExerciciosCap02.src;
/*
 4 - Elabore uma classe que receba dois valores numéricos
 (v1 e v2) e apresente em tela o resultado das quatro 
 operações matemáticas básicas entre eles, ou seja, 
 soma, subtração, multiplicação e divisão.
 */
import java.util.*;
public class Exercicio4 {
	public static void main(String[] args) {
		float num1 = 0.0f, num2 = 0.0f;
		Scanner dado;
		try {
			System.out.println("Forneça um número");
			dado = new Scanner(System.in);
			num1 = dado.nextFloat();
			System.out.println("Forneça outro número");
			dado = new Scanner(System.in);
			num2 = dado.nextFloat();
			System.out.println("A soma dos números resultará em: " + (num1+num2));
			System.out.println("A subtração dos números resultará em: " + (num1-num2));
			System.out.println("A multiplicação dos números resultará em: " + (num1*num2));
			System.out.println("A divisão dos números resultará em: " + (num1/num2));
		}catch(Exception erro) {
			System.out.println("Houve um erro na entrada de dados: " + erro.toString());
		}
	}
}
