package src;
import java.util.*;
public class Potencia {
	public static void main(String[] args) {
		float base, potencia;
		Scanner dado;
		System.out.println("Forne�a o valor da base:");
		dado = new Scanner(System.in);
		base = dado.nextFloat();
		System.out.println("Forne�a o  valor da pot�ncia:");
		dado = new Scanner(System.in);
		potencia = dado.nextFloat();
		System.out.println(base + "^" + potencia + " = " + Math.pow(base, potencia));
		System.exit(0);
	}
}
