package src;
import java.util.*;
public class RaizQuadrada {
	public static void main(String[] args) {
		float num1;
		Scanner dado;
		System.out.println("Forneca um número:");
		dado = new Scanner(System.in);
		num1 = dado.nextFloat();
		System.out.println("Raiz quadrada de " + num1 + " é: " + Math.sqrt(num1));
		System.exit(0);
	}
}
