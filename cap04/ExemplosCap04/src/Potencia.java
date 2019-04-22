package src;
import java.util.*;
public class Potencia {
	public static void main(String[] args) {
		float base, potencia;
		Scanner dado;
		System.out.println("Forneça o valor da base:");
		dado = new Scanner(System.in);
		base = dado.nextFloat();
		System.out.println("Forneça o  valor da potência:");
		dado = new Scanner(System.in);
		potencia = dado.nextFloat();
		System.out.println(base + "^" + potencia + " = " + Math.pow(base, potencia));
		System.exit(0);
	}
}
