/**a) Apresentar os quadrados dos números inteiros de 15 a 200. */
public class L04A {
	public static void main(String[] args) {
		short contadora=15;
		double quadrado;
		do {
			quadrado=Math.pow(contadora,2);
			System.out.printf("""
					O quadrado de %d é: %.0f
					""",contadora,quadrado);
			contadora++;
		}while (contadora<=200);
	}
}
