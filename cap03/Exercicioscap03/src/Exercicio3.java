/*
 3 - Elabore uma classe em que o usu�rio fornece dois n�meros e
 uma letra correspondente � opera��o desejada.
 */
import java.util.*;
public class Exercicio3 {
	public static void main(String[] args) {
		float num1 = 0.0f, num2 = 0.0f;
		Scanner dado;
		String letra = "";
		try {
			System.out.println("Forne�a um n�mero");
			dado = new Scanner(System.in);
			num1 = dado.nextFloat();
			System.out.println("Forne�a outro n�mero");
			dado = new Scanner(System.in);
			num2 = dado.nextFloat();
			System.out.println("Forne�a uma letra correspondente a opera��o matem�tica:"
					+ "\nA - soma; B - subtra��o; C - multiplica��o; D - Divis�o");
			dado = new Scanner(System.in);
			letra = dado.next();
			switch(letra.toUpperCase()) {
			case "A":{
				System.out.println("N�meros fornecidos: " + num1 + " e " + num2);
				System.out.println("Opera�ao escolhida: soma");
				System.out.println("Resultado da opera��o: " + (num1+num2));
				break;
			}
			case "B":{
				System.out.println("N�meros fornecidos: " + num1 + " e " + num2);
				System.out.println("Opera�ao escolhida: subtra��o");
				System.out.println("Resultado da opera��o: " + (num1-num2));
				break;
			}
			case "C":{
				System.out.println("N�meros fornecidos: " + num1 + " e " + num2);
				System.out.println("Opera�ao escolhida: multiplica��o");
				System.out.println("Resultado da opera��o: " + (num1*num2));
				break;
			}
			case "D":{
				System.out.println("N�meros fornecidos: " + num1 + " e " + num2);
				System.out.println("Opera�ao escolhida: divis�o");
				System.out.println("Resultado da opera��o: " + (num1/num2));
			}
			}
			System.exit(0);
		}catch(Exception erro) {
			System.out.println("Houve um erro na entrada de dados: " + erro.toString());
		}
	}
}
