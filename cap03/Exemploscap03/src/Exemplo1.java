
import java.util.*;
public class Exemplo1 {
	public static void main(String[] args) {
		String resposta;
		Scanner dado;
		try {
			System.out.println("Forneca sua resposta : S (SIM) ou N (NAO)");
			dado = new Scanner(System.in);
			resposta = dado.next();
			if(!resposta.equals("S") && !resposta.equals("N")) System.out.println(resposta + " invalida");
			else System.out.println(resposta + "valida");
		}
		catch(Exception erro) {
			System.out.println("Houve erro na entrada de dados" + erro.toString());
		}
		
	}

}
