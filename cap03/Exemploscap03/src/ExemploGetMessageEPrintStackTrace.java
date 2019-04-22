public class ExemploGetMessageEPrintStackTrace {
	public static void main(String[] args) {
		int x = 10;
		try {
			int y = x / 0;
		}catch(Exception erro) {
			System.out.println(erro.getMessage());
			erro.printStackTrace();
		}
	}
}
