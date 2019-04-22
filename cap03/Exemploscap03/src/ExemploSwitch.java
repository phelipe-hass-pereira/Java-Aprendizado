import java.util.Scanner;

public class ExemploSwitch {
	public static void main(String[] args) {
		Scanner dado;
		String diaDaSemana = "";
		try {
			System.out.println("Forneca um valor inteiro entre 1 e 7");
			dado = new Scanner(System.in);
			if(dado !=null){
				int dia = dado.nextInt();
				switch(dia) {
				case 1: diaDaSemana = "Domingo"; break;
				case 2: diaDaSemana = "Segunda"; break;
				case 3: diaDaSemana = "Terca"; break;
				case 4: diaDaSemana = "Quarta"; break;
				case 5: diaDaSemana = "Quinta"; break;
				case 6: diaDaSemana = "Sexta"; break;
				case 7: diaDaSemana = "Sabado"; break;
				default: diaDaSemana = "Desconhecido";
				}
			}
			System.out.println("O Dia da semana é: " + diaDaSemana);
			
		}catch(Exception erro) {
			System.out.println("Houve um erro na entrada de dados " + erro);
		}
		
		
		
		
	}

}
