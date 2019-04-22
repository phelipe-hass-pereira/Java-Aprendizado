import java.util.*;
public class ArrayPesquisaCor {
	public static void main(String[] args) {
		String[] cores = {"verde", "amarelo", "azul", "vermelho", "preto"};
		Scanner dado;
		String cor = "", mensagem = "Cor não encontrada";
		System.out.println("Forneça uma cor");
		dado = new Scanner(System.in);
		cor = dado.next();
		for(String elemento:cores) {
			if(elemento.equals(cor)) {
				mensagem = "Cor encontrada";
				break;
			}
		}
		System.out.println(mensagem);
		System.exit(0);
	}
}
