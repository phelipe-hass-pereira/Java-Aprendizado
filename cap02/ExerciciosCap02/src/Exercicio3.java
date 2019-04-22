package ExerciciosCap02.src;
/*
 3 - Elabore uma classe que realize o c�lculo do peso ideal.
 O peso ideal � dado pelo IMC(�ndice de massa corporal).
 Considere a tabela seguinte:
 IMC 				| Descri��o
 Menor que 18,5     | Peso abaixo do ideal
 Entre 18,5 e 24,4	| Peso ideal
 Entre 24,5 e 29,9	| Pr�-obesidade
 Entre 30,0 e 34,9	| Obesidade classe I
 Entre 35,0 e 39,9	| Obesidade classe II (severa)
 Acima de 39,9		| Obesidade classe III (m�rbida)
 Para calcular o IMC usa-se IMC = peso / altura^2.
 Soicite ao usu�rio o peso e a altura, fa�a o c�lculo, e apresente 
 a mensagem correspondente.
 */
import java.util.*;
public class Exercicio3 {
	public static void main(String[] args) {
		float peso = 0.0f, altura = 0.0f, imc = 0.0f;
		Scanner dado;
		try {
			System.out.println("Forne�a seu peso");
			dado = new Scanner(System.in);
			peso = dado.nextFloat();
			System.out.println("Forne�a sua altura");
			dado = new Scanner(System.in);
			altura = dado.nextFloat();
			imc = (peso/(altura*altura));
			System.out.println("Seu �ndice de massa corporal �: " + imc);
			if(imc<0)
				System.out.println("Valores informados n�o podem ser negativos");
			else if(imc<18.5)
				System.out.println("Peso abaixo do normal");
			else if(imc>=18.5 && imc<=24.4)
				System.out.println("Peso ideal");
			else if(imc>=24.5 && imc<=29.9)
				System.out.println("Pr�-obesidade");
			else if(imc>=30 && imc<=34.9)
				System.out.println("Obesidade classe I");
			else if(imc>=35 && imc<=39.9)
				System.out.println("Obesidade classe II (severa)");
			else if(imc>39.9)
				System.out.println("Obesidade classe III (m�rbida)");
		}catch(Exception erro) {
			System.out.println("Houve um erro na entrada de dados " + erro.toString());
		}
		System.exit(0);
	}
}
