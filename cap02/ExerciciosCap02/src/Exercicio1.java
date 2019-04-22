package ExerciciosCap02.src;

/*
 1 - Usando a classe BufferedReader para entrada de dados, crie uma classe 
 que receba o valor da base e da altura de um triângulo retângulo e mostre
 a sua área. Observação: A área de um triângulo retângulo é calculada por meio
 da fórmula: área = (base*altura)/2.
 */
import java.io.*;
public class Exercicio1{
	public static void main(String[] args){
		float base = 0, altura = 0;
		final float  dividir = 2;
		BufferedReader dado;
		try{
			System.out.println("Informe o valor da base");
			dado = new BufferedReader(new InputStreamReader(System.in));
			base = Float.parseFloat(dado.readLine());

			System.out.println("Informe o valor da altura");
			dado = new BufferedReader(new InputStreamReader(System.in));
			altura = Float.parseFloat(dado.readLine());

			System.out.println("Valor da area: " + ((base*altura)/dividir));
		}
		catch(Exception erro){
			System.out.println("Houve um erro na entrada de dados" + erro.toString());
		}
		System.exit(0);
	}
}
