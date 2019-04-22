package src;
import java.text.DecimalFormat;
import java.util.*;
public class ConfiguracoesRegionais {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat();
		Locale local = Locale.getDefault();
		double valor = 1370.25;
		if(local.getCountry().equals("BR")) {
			df.applyPattern("R$ #,##0.00");
		}
		System.out.println("Configura��es do sistema operacional:" +
				"\nSigla: " + local.getCountry() +
				"\nPa�s: " + local.getDisplayCountry() +
				"\nIdioma: " + local.getDisplayLanguage() +
				"\nTeclado: " + local.getDisplayName() +
				"\nValor: " + df.format(valor));
		System.exit(0);
		
	}
}
