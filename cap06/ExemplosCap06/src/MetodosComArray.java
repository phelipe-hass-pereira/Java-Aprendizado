import java.util.Arrays;

public class MetodosComArray {
	/**
	 * Recebe um array de números e retorna o maior deles,
	 * deve conter pelo menos um elemento no array senão gera erro.
	 * @param numeros = numeros a serem comparados
	 * @return = o maior numero
	 */
	public static double buscaMaior(double[] numeros) {
		double maior = numeros[0];
		for(int i=1;i<numeros.length;i++) {
			maior = Math.max(maior, numeros[i]);
		}
		return maior;
	}
	
	/**
	 * recebe um array de palavras e retorna ordenados em ordem crescente
	 * @param palavras = as palavras a serem ordenadas
	 * @return = o array ordenado
	 */
	public static String[] ordenaPalavras(String[] palavras) {
		Arrays.sort(palavras);
		return palavras;
	}
}
