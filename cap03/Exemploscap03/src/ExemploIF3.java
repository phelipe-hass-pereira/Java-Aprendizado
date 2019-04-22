import java.util.*;
public class ExemploIF3 {
	public static void main(String[] args) {
		Scanner dado;
		String diaDaSemana = "";
		try {
			System.out.println("Forneca um valor inteiro entre 1 e 7");
			dado = new Scanner(System.in);
			if(dado !=null){
				int dia = dado.nextInt();
				if(dia == 1) diaDaSemana = "Domingo";
				else if(dia == 2) diaDaSemana = "Segunda";
				else if(dia == 3) diaDaSemana = "Terca";
				else if(dia == 4) diaDaSemana = "Quarta";
				else if(dia == 5) diaDaSemana = "Quinta";
				else if(dia == 6) diaDaSemana = "Sexta";
				else if(dia == 7) diaDaSemana = "Sabado";
				else diaDaSemana = "Desconhecido";
			}
			System.out.println("O Dia da semana é: " + diaDaSemana);
			
		}catch(Exception erro) {
			System.out.println("Houve um erro na entrada de dados " + erro);
		}
		
		
		
		
	}
}
