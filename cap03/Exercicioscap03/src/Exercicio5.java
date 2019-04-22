/*
 5 - Faça uma classe que apresente em tela a soma de todos
 os números ímpares compreendidos entre 1 e 1000(1+3+5+7+...+999).
 */
public class Exercicio5 {
	public static void main(String[] args) {
		int soma = 1, proxNum = 1;
		while(proxNum<999) {
			proxNum = proxNum+2;
			soma += proxNum;
		}
		System.out.println("Resutlado da soma: " + soma);
		System.exit(0);		
	}
}
