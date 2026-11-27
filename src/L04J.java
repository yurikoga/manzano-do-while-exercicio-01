import java.util.Scanner;
/**j)Elaborar um programa que apresente o resultado inteiro da divisão de dois números quaisquer.
 Para a elaboração do programa, não utilizar em hipótese alguma o conceito do operador aritmético
 DIV. A solução deve ser alcançada com a utilização de looping. Ou seja, o programa deve
 apresentar como resultado (quociente) quantas vezes o divisor cabe no dividendo. */
public class L04J {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int contadora=0;
		double dividendo,divisor;

		System.out.print("Digite o número a ser dividido(dividendo):");
		dividendo=sc.nextDouble();
		do{
			System.out.print("Digite o número que sera o divisor:");
			divisor=sc.nextDouble();
			if(divisor==0){
				System.out.println("\tO divisor não pode ser zero, digite novamente!");
			}
		}while(divisor==0);

		do{
			System.out.printf("%.2f - %.2f = %.2f%n",dividendo,divisor,dividendo-=divisor);
//			dividendo-=divisor;
			contadora++;
			if(dividendo<divisor){
				break;
			}
		}while(true);

		System.out.printf("Quociente da conta: %d%n",contadora);
	}
}
