package src;

public class ConversaoParaString {
	public static void main(String[] args) {
		int a = 1000;
		long b = 5000;
		float c = 20.45f;
		double d  = 15.432;
		String x = String.valueOf(a) + " " + String.valueOf(b) + " " +
		String.valueOf(c) + " " + String.valueOf(d);
		System.out.println(x);
		System.exit(0);
	}
}
