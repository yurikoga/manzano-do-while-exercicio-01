import java.math.BigInteger;
/**g) Elaborar um programa que apresente como resultado o valor do fatorial dos valores ímpares
 situados na faixa numérica de 1 a 10.<br><br>
 Uso de BigInteger: O fatorial cresce exponencialmente (ex: 21! ultrapassa o limite de um 'long').
 * O BigInteger permite trabalhar com números inteiros de precisão arbitrária sem estouro de memória.*/
public class L04G {
	public static void main(String[] args) {
		byte contadora=0;
		do{
			if((contadora%2)==1){
				System.out.printf("Fatorial de %d é: %,d%n",contadora,calculadoraFatorial(contadora));
			}
			contadora++;
		}while(contadora<=10);
	}

	public static BigInteger calculadoraFatorial(int valor){
		// Inicializa o acumulador com 1 (BigInteger.ONE), o elemento neutro da multiplicação.
		BigInteger resultado = BigInteger.ONE;
		// Laço de repetição de 2 até o valor informado (multiplicar por 1 é desnecessário).
		for(int i = 2; i <= valor; i++) {
			// Converte o índice 'i' (int) para BigInteger e multiplica pelo resultado acumulado.
			resultado = resultado.multiply(BigInteger.valueOf(i));
		}
		// Retorna o valor final acumulado (ex: para valor = 4, retorna 24).
		return resultado;
	}
}
