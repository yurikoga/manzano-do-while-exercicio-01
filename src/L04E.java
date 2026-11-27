import java.math.BigInteger;
import java.util.Scanner;
/**e) Elaborar um programa que efetue a leitura de <strong>15 valores numéricos inteiros</strong> e no final apresente o
 <u>total do somatório da fatorial de cada valor lido</u>. */
public class L04E {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		byte tamanho=15;
		BigInteger[]numFatorial=new BigInteger[tamanho];
		BigInteger somaFatoriais=BigInteger.ZERO;
		int[]caixa=new int[tamanho];
		int contadora=0;

		do{
			System.out.printf("Digite o %d° valor:",contadora+1);
			caixa[contadora]=sc.nextInt();
			if(caixa[contadora]==0){
				System.out.println("O número não pode ser menor ou igual");
				continue;
			}
			numFatorial[contadora]=calculadoraFatorial(caixa[contadora]);
			// forma de soma, possivel, para o BigInterger.
			// somaFatoriais=somaFatoriais.add(...); == somaFatoriais+=váriavel
			somaFatoriais=somaFatoriais.add(numFatorial[contadora]);
			contadora++;
		}while(contadora < caixa.length);

		for(byte cont=0; cont< caixa.length;cont++){
			System.out.printf("""
					Número: %d == fatorial: %,d
					""",caixa[cont],numFatorial[cont]);
		}
		System.out.printf("\tSomátorio tootal dos resultados fatoriais dos números é: %,d%n",somaFatoriais);
	}

	public static BigInteger calculadoraFatorial(int valor){
		BigInteger resultado=BigInteger.ONE;
		for(int i=2;i<=valor;i++) {
			resultado=resultado.multiply(BigInteger.valueOf(i));
		}
		return resultado;
	}

}
