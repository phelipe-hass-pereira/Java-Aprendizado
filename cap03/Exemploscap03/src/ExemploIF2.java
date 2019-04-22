
import java.util.*;
public class ExemploIF2 {
	public static void main(String[] args) throws NumberFormatException {
		Float x = 0.0f;
		Scanner dado;
		try {
			System.out.println("Forneca um valor numerico entre  0 e 10");
			dado = new Scanner(System.in);
			x = dado.nextFloat();
			if(x>=0 && x<=10)
				System.out.println("Nota: " + x + " válida");
			else
				System.out.println("Nota: " + x + " inválida");
			
		}
		catch(Exception erro) {
			System.out.println("Houve um erro na entrada de dados " + erro.toString());
		}
		
	}

}
