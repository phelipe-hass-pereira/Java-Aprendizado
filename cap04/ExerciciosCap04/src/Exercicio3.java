/*
 Crie uma classe que gera um número aleatoriamente(entre 0 e 9) por Math.random.
 Em seguida, solicite ao usuário a digitação de um valor entre  0 e 9 e verifique
 se o número sorteado é igual ao número fornecido pelo usuário. Apresente o resultado
 em tela.
 */
import java.util.*;
public class Exercicio3 {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 9), numDigit = 0;
		Scanner dado;
		try {
			System.out.println("Digite um número de  0 a 9");
			dado = new Scanner(System.in);
			numDigit = dado.nextInt();
			if(numDigit>=0 && numDigit<=9) {
				if(num == numDigit) {
					System.out.println("Você acertou!!\nNúmero sorteado: " + num +
							"\nNúmero digitado: " + numDigit);
				}
				else if(num != numDigit) {
					System.out.println("Errouu!!\nNúmero sorteado: " + num + "\nNúmero digitado: " + numDigit);
				}
			}
			else
				System.out.println("Digite um número válido de 1 a 9");
		
		}catch(Exception erro){
			System.out.println("Houve um erro na entrada de dados " + erro.toString());
		}
		System.exit(0);
	}
}