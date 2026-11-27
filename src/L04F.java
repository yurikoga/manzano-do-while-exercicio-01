import java.util.ArrayList;
import java.util.Scanner;
/**f)
 Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o
 total do somatório, a média aritmética e o total de valores lidos. O programa deve fazer as leituras
 dos valores enquanto o usuário estiver fornecendo valores positivos. Ou seja, o programa deve
 parar quando o usuário fornecer um valor negativo. Não se esqueça que o usuário pode entrar
 como primeiro número um número negativo, portanto, cuidado com a divisão por zero no cálculo da
 média. */
public class L04F {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//criação de array de tamanho dinâmico
		ArrayList<Integer>valores=new ArrayList<>();
		int somatorio=0,contadora=0, teste;
		double media=0f;
		do{
			System.out.printf("Digite o %d° valor:",contadora+1);
			teste=sc.nextInt();
			if(teste<0){
//				System.out.println("\tencerado");
				break;
			}
			valores.add(teste);
			somatorio+=teste;
			contadora++;
		}while(true);

		media=calculoDeMedia(somatorio,contadora);

		if(contadora > 0){
			for(int v : valores) {
				System.out.printf("número digitado: %d%n",v);
			}
		}

		System.out.printf("""
				\tSomátorio: %d
				\tMédia: %.2f
				\tTotal de valores lidos: %d
				""",somatorio,media,contadora);
	}
	public static double calculoDeMedia(int total, int qtd){
		if(qtd>0){
			return (double)total/qtd;
		}else{
			return 0f;
		}
	}
}
