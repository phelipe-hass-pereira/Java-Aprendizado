package ExerciciosCap02.src;
/*
 5 - Um usuário possui Internet banda larga com velocidade
 fixa de 2Mb(2 Megabit) por segundo. Elabore uma classe que
 receba o tamanho do arquivo em bytes  e apresente a quantidade
 de segundos necessária para fazer o download. Considere que 8 bits
 equivalem a 1 byte.
 */
import java.util.*;
public class Exercicio5 {
	public static void main(String[] args) {
		int velocidadeMbits = 2000000;
		float tamanhoArquivo = 0.0f, tempo = 0.0f;
		Scanner dado;
		try {
			System.out.println("Forneça o tamanho do arquivo para download(em bytes)");
			dado = new Scanner(System.in);
			tamanhoArquivo = dado.nextFloat();
			//tempo = tamanhoArquivo
			System.out.println("O tempo necessário de download é de: " + ((tamanhoArquivo*8)/velocidadeMbits));
		}catch(Exception erro) {
			System.out.println("Houve um erro na entrada de dados: " + erro.toString());
		}
	}
}
