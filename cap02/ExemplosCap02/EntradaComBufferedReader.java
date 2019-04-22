package ExemplosCap02;
import java.io.*; // este método de bufferedReader funciona normalmente, porém existe o scanner, que é mais otimizado
public class EntradaComBufferedReader{
	public static void main(String[] args){
		float nota1 = 0, nota2 = 0, trabalho = 0, media = 0;
		BufferedReader dado;
		try {
			System.out.println("Entre com a nota 1");
			dado = new BufferedReader(new InputStreamReader(System.in));
			nota1 = Float.parseFloat(dado.readLine());

			System.out.println("Entre com a nota 2");
			dado = new BufferedReader(new InputStreamReader(System.in));
			nota2 = Float.parseFloat(dado.readLine());

			System.out.println("Entre com a nota do trabalho");
			dado = new BufferedReader(new InputStreamReader(System.in));
			trabalho = Float.parseFloat(dado.readLine());

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