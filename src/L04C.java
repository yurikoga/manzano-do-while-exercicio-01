/**c) Apresentar todos os números divisíveis por 4 que sejam menores que 200. Para verificar se o
 número é divisível por 4, efetuar dentro da malha a verificação lógica desta condição com a
 instrução 'se', perguntando se o número é divisível; sendo, mostre-o; não sendo, passe para o
 próximo passo. A variável que controlará o contador deve ser iniciada com o valor 1. */
public class L04C {
	public static void main(String[] args) {
		short contadora=1;
		double quadrado;
		do {
			if(contadora%4==0){
				System.out.printf("""
					Número %d considerado
					""",contadora);
			}
			contadora++;
		}while (contadora<200);
	}
}
