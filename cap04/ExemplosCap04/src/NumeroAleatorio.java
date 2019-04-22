package src;
public class NumeroAleatorio {
	public static void main(String[] args) {
		for(int cartao = 1; cartao <= 4; cartao++) {
			String numerosCartao = "";
			for(int numCartao = 1; numCartao <= 6; numCartao++) {
				int num = (int) (Math.random() * 100);
				numerosCartao += num + " ";
			}
			System.out.println("Números do cartão: " + cartao + "\n" + numerosCartao);
		}
		System.exit(0);  
	}
}
