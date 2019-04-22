package ExemplosCap02;

import javax.swing.*; //classe que gera caixas de texto para entrada de dados
public class EntradaComJOptionPane{
	public static void main(String[] args){
		String aux = "";
		float nota1 = 0, nota2 = 0, trabalho = 0, media = 0;
		try{
			aux = JOptionPane.showInputDialog("Entre com a nota 1"); // cria caixa de diálogo para entrada de dados
			nota1 = Float.parseFloat(aux);

			aux = JOptionPane.showInputDialog("Entre com a nota 2");
			nota2 = Float.parseFloat(aux);

			aux = JOptionPane.showInputDialog("Entre com a nota do trabalho");
			trabalho = Float.parseFloat(aux);

			media = (nota1+nota2+trabalho)/3;
			JOptionPane.showMessageDialog(null,"Media : " + media); // cria caixa de diálogo para saida de dados
		}
		catch(Exception erro){
			JOptionPane.showMessageDialog(null, "Houve erro na conversao, digite apenas caracteres numericos" + erro.toString());
		}
		System.exit(0);
	}
}