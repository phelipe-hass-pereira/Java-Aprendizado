/*
 1 - Crie uma classe que simule a jogada de um dado
 de seis lados(n�meros 1 a 6). Mostrar o resultado 
 do lan�amento.
 */
public class Exercicio1 {
	public static void main(String[] args) {
		int num = (int) (Math.random()*6);
		System.out.println("N�mero sorteado: " + num);
		System.exit(0);
	}
}