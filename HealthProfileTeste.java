import java.util.Scanner;

public class HealthProfileTeste {

	public static void main(String[] args) {

		
		// Variaveis locais
		
		int diaAtual;
		int mesAtual;
		int anoAtual;
		String nome;
		String sobrenome;
		String sexo;
		int diaNasc;
		int mesNasc;
		int anoNasc;
		double altura;
		double peso;
		
		// Criacao do objeto Scanner
		
		Scanner input = new Scanner(System.in);
		
		
		// Inicializacao das variaveis locais
		
		System.out.println("\t\t Health Profile");

		System.out.print("Informe o dia de hoje: ");
		diaAtual = input.nextInt();
		System.out.print("Informe o mes atual: ");
		mesAtual = input.nextInt();
		System.out.print("Informe o ano atual: ");
		anoAtual = input.nextInt();
		
		System.out.print("Informe o nome do paciente: ");
		nome = input.next();
		System.out.print("Informe o sobrenome do paciente: ");
		sobrenome = input.next();
		System.out.print("Informe o sexo do paciente: ");
		sexo = input.next();
		System.out.print("Informe o dia de nascimento do paciente: ");
		diaNasc = input.nextInt();
		System.out.print("Informe o mes de nascimento do paciente: ");
		mesNasc = input.nextInt();
		System.out.print("Informe o ano de nascimento do paciente: ");
		anoNasc = input.nextInt();
		System.out.print("Informe a altura do paciente: ");
		altura = input.nextDouble();
		System.out.print("Informe o peso do paciente: ");
		peso = input.nextDouble();
		
		
		// Chamamento do construtor
		
		HealthProfile paciente = new HealthProfile(nome, sobrenome, sexo, diaNasc, mesNasc, anoNasc, altura, peso, diaAtual, mesAtual, anoAtual);
		
		
		// Chamar metodo calcular idade
		
		paciente.idade();
		
		
		// Chamar metodo calcular FCM, faixa de frequencia e IMC
		
		paciente.calculo();
		
		
		// Saida dos valores
		
		System.out.println("\t O cálculo retornou com os seguintes resultados:");
		System.out.printf("Nome do paciente: %s %s, idade: %d, sexo: %s \n", paciente.getNome(), paciente.getSobrenome(), paciente.getIdade(), paciente.getSexo());
		System.out.printf("A frequencia cardiaca maxima do paciente e de: %d batimentos por minuto. A faixa recomendada para exercicio aerobico esta situada entre %.2f e %.2f bpm.\nO indice de massa corporal do paciente e de: %.2f", paciente.getFcm(), paciente.getfMin(), paciente.getfMax(), paciente.getImc());
					
	}

}//fim da classe principal

