import java.util.*;
public class ExemploSwitchString {
	public static void main(String[] args) {
		String sistema = "";
		Scanner dado;
		System.out.println("Forneca o nome do sistema operacional");
		dado = new Scanner(System.in);
		try {
			if(dado !=null) {
				sistema = dado.next();
				switch(sistema) {
				case "Windows": System.out.println("Windows foi criado por Bill Gates"); break;
				case "Linux": System.out.println("Linux foi criado por Linus Torvalds"); break;
				default: System.out.println("SO desconhecido!!");
				}
			}
			else System.out.println("Nao foi fornecido o nome do sistema");
		}catch(Exception erro) {
			System.out.println("Houve um erro na entrada de dados" + erro);
		}
		
	}

}
