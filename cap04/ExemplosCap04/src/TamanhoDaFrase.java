package src;
import javax.swing.JOptionPane;
public class TamanhoDaFrase {
	public static void main(String[] args){
		String frase = JOptionPane.showInputDialog("Forneça uma frase");
		int tamanho = frase.length();
		JOptionPane.showMessageDialog(null, "Frase: " + frase +
				"\nTamanho da frase: " + tamanho);
		System.exit(0);
	}
}
