
import java.util.Scanner;

public class TesteCalCredito {

	public static void main(String[] args) {
		
				
		// instancia do Scanner
		Scanner input = new Scanner(System.in);
		
		// instancia das variaveis locais
		
		int conCliente;
		double saldoInicial = 0;
		double limiteConta;
		
		double credito = 0;
		double debito =0;
		
		// inicializacao das variaveis locais

		
		System.out.print("Informe o numero da  conta do Cliente: ");
		conCliente = input.nextInt();
						
		System.out.print("Informe o limite da conta do Cliente ");
		limiteConta = input.nextDouble();
			
		
		// chamamento do construtor
		
		CalCredito cliente1 = new CalCredito(conCliente, saldoInicial, limiteConta);
	
				
				
		System.out.printf("O saldo em conta é de: R$ %.2f. \nDigite 1 para fazer lançamentos ou qualquer outro número para sair: ", cliente1.getSaldo());
		int opcao = input.nextInt();

		while(opcao ==1) {
			System.out.print("Informe o valor a creditar: ");
			credito = input.nextDouble();
			cliente1.setCredito(credito); // chama metodo set credito
			
			System.out.printf("O valor de R$ %.2f foi creditado na conta %d . O saldo atual é de R$ %.2f \n", credito, cliente1.getConta(), cliente1.getSaldo());
			
			
			System.out.print("Informe o valor a debitar: ");
			debito = input.nextDouble();
			cliente1.setDebito(debito);// chama metodo set debito
			
			System.out.printf("O saldo atual na conta %d é de R$ %.2f \n", cliente1.getConta(), cliente1.getSaldo());
			
			System.out.printf("Digite 1 para fazer novos lançamentos ou qualquer outro número para sair: ", cliente1.getSaldo());
			opcao = input.nextInt();
		}
		
	}
	
}
		
	
