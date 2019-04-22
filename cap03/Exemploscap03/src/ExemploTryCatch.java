import javax.swing.*;
public class ExemploTryCatch {
	public static void main(String[] args) {
		String aux = JOptionPane.showInputDialog("Forneça o valor do primeiro número:");
		if(aux == null) System.exit(0);
		String aux2 = JOptionPane.showInputDialog("Forneça o valor do segundo número:");
		if(aux2 == null) System.exit(0);
		
		try {
			int num1 = Integer.parseInt(aux);
			int num2 = Integer.parseInt(aux2);
			JOptionPane.showMessageDialog(null, "Soma = " + (num1+num2));
			JOptionPane.showMessageDialog(null, "Subtração = " + (num1-num2));
			JOptionPane.showMessageDialog(null, "Multiplicação = " + (num1*num2));
			JOptionPane.showMessageDialog(null, "Divisão = " + (num1/num2));
		}catch(ArithmeticException erro) {
			JOptionPane.showMessageDialog(null, "Erro de divisão por zero\n" + erro.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
		}
		catch(NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, "Digite apenas número inteiros\n" + erro.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
		}
		finally{
			JOptionPane.showMessageDialog(null, "Final da execução!!");
		}
		System.exit(0);
	}
}
