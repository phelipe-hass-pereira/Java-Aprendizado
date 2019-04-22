import java.io.*;
public class ExemploThrows {
	public static void main(String[] args) throws IOException {
		BufferedReader dado;
		System.out.println("Entre com seu nome");
		dado  = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Seu nome e : " + dado.readLine());
	}

}
