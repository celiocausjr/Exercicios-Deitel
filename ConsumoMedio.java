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
	
		System.out.print("Informe a quilometragem percorrida na viagem ou -1 para sair: ");
		km = input.nextInt();
		
		System.out.print("Informe a quantidade de litros consumidos na viagem: ");
		litros = input.nextInt();
		
		contViagem ++;
		
		 double mediaViagem = (double) km / litros;  
		
		System.out.printf("Nessa viagem foram gastos &d, e percorridos %d quilometros.", km, litros);
		System.out.printf("A m�dia de consumo desta viagem foi de: %.2f ", mediaViagem);
		
		// la�o while com flag
		
			while (km != -1) {
						
			totalKm =+ km;
			totalLitros =+ litros;
			mediaViagem = 0;
			
			System.out.print("Informe a quilometragem percorrida na viagem ou -1 para sair: ");
			km = input.nextInt();
			
			System.out.print("Informe a quantidade de litros consumidos na viagem: ");
			litros = input.nextInt();
			
			mediaViagem =+ ((double) km / litros);  
			
			System.out.printf("Nessa viagem foram gastos %d, e percorridos %d quilometros.", km, litros);
			System.out.printf("A m�dia de consumo desta viagem foi de: %.2f ", mediaViagem);
			
			
			
			}
			
			// condicional para c�lculo da m�dia
			
			if (contViagem != 0) {
			
				System.out.printf("A m�dia de consumo de todas as viagens foi de: %.2f. ", mediaViagem);

			}else
				
			{
				System.out.println("N�o houve nenhuma viagem para apurar!");
			}
	}

}
