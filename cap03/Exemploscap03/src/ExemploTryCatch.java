import javax.swing.*;
public class ExemploTryCatch {
	public static void main(String[] args) {
		String aux = JOptionPane.showInputDialog("Forne�a o valor do primeiro n�mero:");
		if(aux == null) System.exit(0);
		String aux2 = JOptionPane.showInputDialog("Forne�a o valor do segundo n�mero:");
		if(aux2 == null) System.exit(0);
		
		try {
			int num1 = Integer.parseInt(aux);
			int num2 = Integer.parseInt(aux2);
			JOptionPane.showMessageDialog(null, "Soma = " + (num1+num2));
			JOptionPane.showMessageDialog(null, "Subtra��o = " + (num1-num2));
			JOptionPane.showMessageDialog(null, "Multiplica��o = " + (num1*num2));
			JOptionPane.showMessageDialog(null, "Divis�o = " + (num1/num2));
		}catch(ArithmeticException erro) {
			JOptionPane.showMessageDialog(null, "Erro de divis�o por zero\n" + erro.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
		}
		catch(NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, "Digite apenas n�mero inteiros\n" + erro.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
		}
		finally{
			JOptionPane.showMessageDialog(null, "Final da execu��o!!");
		}
		System.exit(0);
	}
}
