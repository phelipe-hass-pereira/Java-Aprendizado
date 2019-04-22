/*
 1 - Crie uma classe que simule a jogada de um dado
 de seis lados(números 1 a 6). Mostrar o resultado 
 do lançamento.
 */
public class Exercicio1 {
	public static void main(String[] args) {
		int num = (int) (Math.random()*6);
		System.out.println("Número sorteado: " + num);
		System.exit(0);
	}
}