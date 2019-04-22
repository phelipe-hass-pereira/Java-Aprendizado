import java.util.*;
import javax.swing.*;
public class Exercicio2 {
	public static void main(String[] args) {
		int idade1 = 0, idade2 = 0, idade3 = 0, idade4 = 0, idadeMaior = 0, idadeMenor = 0;
		Scanner dado;
		try {
			System.out.println("Informe a idade 1");
			dado = new Scanner(System.in);
			idade1 = dado.nextInt(); 
			
			idadeMaior = idade1;
			idadeMenor = idade1;
			
			System.out.println("Informe a idade 2");
			dado = new Scanner(System.in);
			idade2 = dado.nextInt();
			
			if(idade2>idadeMaior)
				idadeMaior = idade2;
			if(idade2<idadeMenor)
				idadeMenor = idade2;
			
			System.out.println("Informe a idade 3");
			dado = new Scanner(System.in);
			idade3 = dado.nextInt();
			
			if(idade3>idadeMaior)
				idadeMaior = idade3;
			if(idade3<idadeMenor)
				idadeMenor = idade3;
			
			System.out.println("Informe a idade 4");
			dado = new Scanner(System.in);
			idade4 = dado.nextInt();
			
			if(idade4>idadeMaior)
				idadeMaior = idade4;
			if(idade4<idadeMenor)
				idadeMenor = idade4;
			
			System.out.println("Idade 1: " + idade1 + "; Idade 2: " + idade2 + "; Idade 3: " + idade3 + "; Idade 4: " + idade4);
			System.out.println("Idade Maior: " + idadeMaior + "; Idade Menor: " + idadeMenor);
			
		
		}catch(NumberFormatException erro) {
			System.out.println("Número digitado não é inteiro " + erro.toString());
		}
		System.exit(0);
		
	}
}
