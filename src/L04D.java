/**d) Elaborar um programa que efetue o cálculo e no final apresente o somatório do número de grãos de
 trigo que se pode obter num tabuleiro de xadrez, obedecendo à seguinte regra: colocar um grão de
 trigo no primeiro quadro e nos quadros seguintes o dobro do quadro anterior. Ou seja, no primeiro
 quadro coloca-se 1 grão, no segundo quadro colocam-se 2 grãos (neste momento têm-se 3 grãos),
 no terceiro quadro colocam-se 4 grãos (tendo neste momento 7 grãos), no quarto colocam-se 8
 grãos (tendo-se então 15 grãos) até atingir o sexagésimo quarto (64o) quadro. Utilize variáveis do
 tipo real como acumuladores.*/
public class L04D {
	public static void main(String[] args) {
		double contadora=0,acumuladora=0;
		double[]quadro=new double[64];
//		long[]soma=new long[64];
		long somatorio=0;
		do {
			if (contadora==0){
				acumuladora=1;
				quadro[(int)contadora]=acumuladora;
				somatorio+=(int)quadro[(int)contadora];
//				soma[(int)contadora]=somatorio;
				contadora++;
				continue;
			}
			quadro[(int)contadora]=acumuladora*=2;
			somatorio+=(int)quadro[(int)contadora];
//			soma[(int)contadora]=somatorio;
			contadora++;
		}while (contadora< quadro.length);
		contadora=0;
		do {
//			System.out.printf("%.0f° quadro = %.0f grãos | total:(%)\n",(contadora+1),quadro[(int)contadora],(long)soma[(int)contadora]);
			System.out.printf("%.0f° quadro = %.0f grãos\n",(contadora+1),quadro[(int)contadora]);
			contadora++;
		}while(contadora< quadro.length);
		System.out.printf("Total de grãos: %d",somatorio);
	}
}
