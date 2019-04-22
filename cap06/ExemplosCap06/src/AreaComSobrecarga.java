
public class AreaComSobrecarga {
	public static void main(String[] args) {
		System.out.println("Área de um quadrado..." + area(3));
		System.out.println("Área de um retangulo.." + area(3, 2));
		System.out.println("Área de um cubo......." + area(3, 2, 5));
	}
	
	public static double area(int x) {
		return (x*x);
	}
	
	public static double area(int x, int y) {
		return (x*y);
	}
	
	public static double area(int x, int y, int z) {
		return (x*y*z);
	}
}
