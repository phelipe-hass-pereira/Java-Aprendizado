
public class UsaMetodos {
	public static void main(String[] args) {
		MetodosSemRetorno.imprimirTexto("Usando m�todos de outra classe");
		MetodosSemRetorno.somar(20, 30);
		System.out.println(MetodosComRetorno.diaPorExtenso(5));
		System.out.println(MetodosComRetorno.contaLetraA("Macacada"));
	}
}
