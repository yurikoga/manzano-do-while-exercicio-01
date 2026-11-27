/**b) Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de
 1 até 500. */
public class L04B {
	public static void main(String[] args) {
		short contadora=1;
		int somatorio=0;
		do {
			if(contadora%2==0){
				System.out.printf("""
					O número %d foi considerado\n
					""",contadora);
				somatorio+=contadora;
			}
			contadora++;
		}while (contadora<=500);

		System.out.printf("\tSomátoio total dos números pares de 1 até 500 é: %d\n",somatorio);
	}
}
