/*
 4 - Faça uma classe que solicite uma senha, simulando um caixa eletrônico.
 Considere que a senha é Java. Caso o usuário forneça a senha correta, apresentar
 a mensagem "Senha Válida"; caso contrário, "Senha Inválida". Se o usuário fornecer
 a senha incorreta três vezes seguidas, o programa deve apresentar a mensagem
 "Cartão Cancelado".
 */
import java.util.*;
public class Exercicio4 {
	public static void main(String[] args) {
		String senha = "Java", senhaInserida = "";
		Scanner dado;
		int cont = 0;
		try {
			for(cont = 0;cont<3; cont++) {
				System.out.println("Forneça a senha:");
				dado = new Scanner(System.in);
				senhaInserida = dado.next();
				if(senhaInserida.equals(senha)) {
					System.out.println("Senha Válida");
					System.exit(0);
				}
				else {
					System.out.println("Senha Inválida");
					if(cont ==2) {
						System.out.println("Cartão Cancelado");
						System.exit(0);
					}
				}
			}
			
		}catch(Exception erro) {
			System.out.println("Houve um erro na entrada de dados: " + erro.toString());
		}
	}
}
