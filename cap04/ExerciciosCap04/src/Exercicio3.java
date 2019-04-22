/*
 Crie uma classe que gera um n�mero aleatoriamente(entre 0 e 9) por Math.random.
 Em seguida, solicite ao usu�rio a digita��o de um valor entre  0 e 9 e verifique
 se o n�mero sorteado � igual ao n�mero fornecido pelo usu�rio. Apresente o resultado
 em tela.
 */
import java.util.*;
public class Exercicio3 {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 9), numDigit = 0;
		Scanner dado;
		try {
			System.out.println("Digite um n�mero de  0 a 9");
			dado = new Scanner(System.in);
			numDigit = dado.nextInt();
			if(numDigit>=0 && numDigit<=9) {
				if(num == numDigit) {
					System.out.println("Voc� acertou!!\nN�mero sorteado: " + num +
							"\nN�mero digitado: " + numDigit);
				}
				else if(num != numDigit) {
					System.out.println("Errouu!!\nN�mero sorteado: " + num + "\nN�mero digitado: " + numDigit);
				}
			}
			else
				System.out.println("Digite um n�mero v�lido de 1 a 9");
		
		}catch(Exception erro){
			System.out.println("Houve um erro na entrada de dados " + erro.toString());
		}
		System.exit(0);
	}
}