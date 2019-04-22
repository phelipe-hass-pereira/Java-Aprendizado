package ExemplosCap02;
import java.util.*; //com scanner, código fica mais simples
public class EntradaComScanner{
	public static void main(String[] args){
		float nota1 = 0, nota2 = 0, trabalho = 0, media = 0;
		Scanner dado;
		try {
			System.out.println("Entre com a nota 1");
			dado = new Scanner(System.in);
			nota1 = dado.nextFloat();

			System.out.println("Entre com a nota 2");
			dado = new Scanner(System.in);
			nota2 = dado.nextFloat();

			System.out.println("Entre com a nota do trabalho");
			dado = new Scanner(System.in);
			trabalho = dado.nextFloat();

			media = (nota1+nota2+trabalho)/3;
			System.out.println("Media : "+media);
		}
		catch(Exception erro) {
			System.out.println("Houve um erro na entrada de dados" + erro.toString());
		}
		/*catch(NumberFormatException e) {
			System.out.println("Houve um erro na conversao, digite apenas caracteres numericos");
		}*/
	}
}