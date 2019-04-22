import javax.swing.*;
import java.util.*;
public class ContadorWhile {
	public static void main(String[] args) {
		Scanner dado;
		int limite, cont;
		try {
			System.out.println("Digite a quantidade");
			dado = new Scanner(System.in);
			limite = dado.nextInt();
			cont = limite;
			while(cont >= 0) {
				System.out.println(cont);
				cont--;
			}
			System.out.println("Fim do contador regressivo\n");
			cont = 0;
			do {
				System.out.println(cont);
				cont++;
			} while(cont <= limite);
			System.out.println("Fim do contador progressivo");
		}catch(NumberFormatException erro) {
			System.out.println("Nao foi fornecido um numero inteiro valido!!\n" + erro.toString()); // se o argumento for invalido
		}
		System.exit(0);
	}
}
