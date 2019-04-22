import java.util.*;
public class EntradaDeDadosComMetodos {
	static String aux = "";
	public static float leNumeroFloat(float minimo, float maximo) {
		float n = 0;
		Scanner dado;
		while(true) {
			try {
				System.out.println("Forneça um valor entre " + minimo + " e " + maximo);
				dado = new Scanner(System.in);
				n = dado.nextFloat();
				if(n < minimo || n > maximo) {
					System.out.println("Entrada fora da faixa permitida !!");
				}
				else {
					break;
				}
			}catch(NumberFormatException erro) {
				System.out.println("Digite apenas valores numéricos\n" + erro.toString());
			}
		}
		return n;
	}
	
	public static int leNumeroInt(int minimo, int maximo) {
		int n = 0;
		Scanner dado;
		while(true) {
			try {
				System.out.println("Forneça um valor inteiro entre " + minimo + " e " + maximo);
				dado = new Scanner(System.in);
				n = dado.nextInt();
				if(n < minimo || n > maximo) {
					System.out.println("Entrada fora da faixa permitida !!");
				}
				else {
					break;
				}
			}catch(NumberFormatException erro) {
				System.out.println("Digite apenas valores numéricos !!\n"  +erro.toString());
			}
		}
		return n;
	}
	
	public static String leString() {
		Scanner dado;
		System.out.println("Forneça um nome:");
		dado = new Scanner(System.in);
		aux = dado.next();
		return aux;
	}
}
