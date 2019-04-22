package ExerciciosCap02.src;
/*
 4 - Elabore uma classe que receba dois valores num�ricos
 (v1 e v2) e apresente em tela o resultado das quatro 
 opera��es matem�ticas b�sicas entre eles, ou seja, 
 soma, subtra��o, multiplica��o e divis�o.
 */
import java.util.*;
public class Exercicio4 {
	public static void main(String[] args) {
		float num1 = 0.0f, num2 = 0.0f;
		Scanner dado;
		try {
			System.out.println("Forne�a um n�mero");
			dado = new Scanner(System.in);
			num1 = dado.nextFloat();
			System.out.println("Forne�a outro n�mero");
			dado = new Scanner(System.in);
			num2 = dado.nextFloat();
			System.out.println("A soma dos n�meros resultar� em: " + (num1+num2));
			System.out.println("A subtra��o dos n�meros resultar� em: " + (num1-num2));
			System.out.println("A multiplica��o dos n�meros resultar� em: " + (num1*num2));
			System.out.println("A divis�o dos n�meros resultar� em: " + (num1/num2));
		}catch(Exception erro) {
			System.out.println("Houve um erro na entrada de dados: " + erro.toString());
		}
	}
}
