package src;
import java.util.*;
public class MaiorMenor {
	public static void main(String[] args) {
		Scanner dado;
		float num1, num2;
		System.out.println("Forneca o primeiro n�mero");
		dado = new Scanner(System.in);
		num1 = dado.nextFloat();
		System.out.println("Forneca o segundo n�mero");
		dado = new Scanner(System.in);
		num2 = dado.nextFloat();
		System.out.println("N�mero fornecidos: " + num1 +" e -20" + num2 + "\nO maior � : " + Math.max(num1, num2) + "\nO menor �: " +
		Math.min(num1, num2));
		System.exit(0);
	}
}
