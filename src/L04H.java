import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
/**h) Elaborar um programa que possibilite calcular a área total de uma residência (sala, cozinha,
 banheiro, quartos, área de serviço, quintal, garagem, etc.). O programa deve solicitar a entrada do
 nome, a largura e o comprimento de um determinado cômodo. Em seguida, deve apresentar a área
 do cômodo lido e também uma mensagem solicitando do usuário a confirmação de continuar
 calculando novos cômodos. Caso o usuário responda “NAO”, o programa deve apresentar o valor
 total acumulado da área residencial. */
public class L04H {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int contadora=0;
		double largura,comprimento,areaTotal=0f;
		String decisao;
		ArrayList<String>comodo=new ArrayList<>();
		ArrayList<Double>area=new ArrayList<>();
		do{
			System.out.print("\nDigite o nome do cômodo:");
				comodo.add(sc.nextLine());
			System.out.print("Digite a largura do cômodo:");
				largura=sc.nextDouble();
			System.out.print("Digite o comprimento do cômodo:");
				comprimento=sc.nextDouble();
				area.add(calcularArea(largura,comprimento));
			System.out.printf("Área de %s é: %.2fm²",comodo.get(contadora),area.get(contadora));
				//acumula a area total
				areaTotal+=area.get(contadora);
			System.out.println("\n\tContinuar? [SIM] [NAO]");
			decisao=sc.next().toUpperCase();
			//limpou o buffer na memória para evitar que o próximo sc.nextLine() seja pulado
			sc.nextLine();
			contadora++;
			if(decisao.equals("NAO")){
					break;
				}
		}while(true);
		System.out.printf("\nÁrea Residencial Total: %.2fm²",areaTotal);
		System.out.println("\nLista:");

		for(byte indice=0;indice<contadora;indice++){
			System.out.printf("""
					Cômodo: %s
					Área: %.2fm²
					""",comodo.get(indice),area.get(indice));
		}

		sc.close();
	}
	public static Double calcularArea(double larg, double compr){
		return larg*compr;
	}
}
