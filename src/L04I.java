import java.util.Scanner;
/**i) Elaborar um programa que efetue a leitura de valores positivos inteiros até que um valor negativo
 seja informado. Ao final devem ser apresentados o maior e o menor valores informados pelo
 usuário. */
public class L04I {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int indice=0;
		int valor;
		int maior=Integer.MIN_VALUE;
		int menor=Integer.MAX_VALUE;

		do{
			System.out.printf("Digite o %d° valor:",indice+1);
			valor=sc.nextInt();
			if(valor<0){
				break;
			}
			if(valor>maior){
				maior=valor;
			}
			if(valor<menor){
				menor=valor;
			}
			indice++;
		}while(true);

		System.out.printf("""
				%nDos valores digitados:
				%,d foi o Maior
				%,d foi o Menor
				""",maior,menor);
	}
}
