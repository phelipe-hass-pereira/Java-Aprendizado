/*
 4 - Fa�a uma classe que solicite uma senha, simulando um caixa eletr�nico.
 Considere que a senha � Java. Caso o usu�rio forne�a a senha correta, apresentar
 a mensagem "Senha V�lida"; caso contr�rio, "Senha Inv�lida". Se o usu�rio fornecer
 a senha incorreta tr�s vezes seguidas, o programa deve apresentar a mensagem
 "Cart�o Cancelado".
 */
import java.util.*;
public class Exercicio4 {
	public static void main(String[] args) {
		String senha = "Java", senhaInserida = "";
		Scanner dado;
		int cont = 0;
		try {
			for(cont = 0;cont<3; cont++) {
				System.out.println("Forne�a a senha:");
				dado = new Scanner(System.in);
				senhaInserida = dado.next();
				if(senhaInserida.equals(senha)) {
					System.out.println("Senha V�lida");
					System.exit(0);
				}
				else {
					System.out.println("Senha Inv�lida");
					if(cont ==2) {
						System.out.println("Cart�o Cancelado");
						System.exit(0);
					}
				}
			}
			
		}catch(Exception erro) {
			System.out.println("Houve um erro na entrada de dados: " + erro.toString());
		}
	}
}
