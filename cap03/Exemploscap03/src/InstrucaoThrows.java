import javax.swing.*;
import java.util.*;
public class InstrucaoThrows {
	public static void main(String[] args) {
		float nota = 0f;
		Scanner dado;
		System.out.println("Forneca uma nota entre 0 e 10");
		dado = new Scanner(System.in);
		try {
			nota = dado.nextFloat();
			if(nota < 0  || nota > 10) throw new Exception("Fora da faixa permitida (0 a 10)");
		}catch(Exception erro) {
			System.out.println("Houve um erro na entrada de dados " + erro.toString());
		}
	}

}
