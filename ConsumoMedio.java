import java.util.Scanner;

public class ConsumoMedio {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// inicializa��o das vari�veis locais
		
		int km = 0;
		int litros = 0;
		int totalKm = 0;
		int totalLitros =0;
		int contViagem = 0;
		double mediaGeral =0;
		double mediaViagem = 0;
		
		System.out.print("Informe a quilometragem percorrida na viagem ou -1 para sair: ");
		km = input.nextInt();
		
		while(km != -1) {
			
		contViagem ++;
		
		System.out.print("Informe a quantidade de litros consumidos na viagem: ");
		litros = input.nextInt();
		
		mediaViagem = (double) km / litros;
		
		System.out.printf("Nesta viagem foram gastos %d litros e percorridos %d quilometros.", km, litros);
		System.out.printf("A m�dia de consumo desta viagem foi de: %.2f km por litro. \n", mediaViagem);
			
		totalKm = km + totalKm;
		totalLitros = litros + totalLitros;
		mediaGeral += (double) totalKm / totalLitros;
		
		System.out.print("Informe a quilometragem percorrida na viagem ou -1 para sair: ");
		km = input.nextInt();
		
		
		
		}
	  
		// condicional para c�lculo da m�dia
			
		if (contViagem != 0) {
			
		System.out.printf("\nNo total foi(ram) realizada(s) %d viagens. A m�dia de consumo de todas as viagens foi de: %.2f km/l. \n", contViagem, mediaGeral);
		System.out.printf("O total de quil�metros percorridos foi de %d. Foram gastos %d litros.", totalKm, totalLitros);
		
		}else
				
			{
				System.out.println("N�o houve nenhuma viagem para apurar!");
			}
	}
}

