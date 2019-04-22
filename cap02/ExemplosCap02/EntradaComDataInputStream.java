package ExemplosCap02;
import java.io.*; //esse método de leitura está obsoleto, e é recomendado usar métodos de leitura mais otimizados
public class EntradaComDataInputStream{
	public static void main(String[] args){
		String s = "";
		float nota1 = 0, nota2 = 0, trabalho = 0, media = 0;
		DataInputStream dado;
		try {
			System.out.println("Entre com a nota 1");
			dado = new DataInputStream(System.in);
			s = dado.readLine();
			nota1 = Float.parseFloat(s);

			System.out.println("Entre com a nota 2");
			dado = new DataInputStream(System.in);
			s = dado.readLine();
			nota2 = Float.parseFloat(s);

			System.out.println("Entre com a nota do trabalho");
			dado = new DataInputStream(System.in);
			s = dado.readLine();
			trabalho = Float.parseFloat(s);

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