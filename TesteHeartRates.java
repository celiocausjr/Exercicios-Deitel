// Classe Main

import java.util.Scanner; // Importa o Scanner

public class TesteHeartRates { // abertura da classe principal

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // instancia do Scanner;
		
		// Variaveis locais que serao usadas como argumentos ao chamar o Construtor
		
		String nome;
		String sobrenome;
		int diaNasc;
		int mesNasc;
		int anoNasc;
		int diaAtual;
		int mesAtual;
		int anoAtual;
		
		// Inicializacao das variaveis locais
		
		System.out.println("\t \t Exercicio 3.16 - Frequencia Cardiaca\n");
		
		System.out.print("Informe o dia da data atual: ");
		diaAtual = input.nextInt();
		
		System.out.print("Informe o mes da data atual: ");
		mesAtual = input.nextInt();
		
		System.out.print("Informe o ano da data atual: ");
		anoAtual = input.nextInt();
		
		System.out.print("Informe o nome do paciente: ");
		nome = input.next();
		
		System.out.print("Informe o sobrenome do paciente: ");
		sobrenome = input.next();
		
		System.out.print("Informe o dia de nascimento do paciente: " );
		diaNasc = input.nextInt();
		
		System.out.print("Informe o mes de nascimento do paciente: ");
		mesNasc = input.nextInt();
		
		System.out.print("Informe o ano de nascimento do paciente: ");
		anoNasc = input.nextInt();
		
		// Chamamento do Construtor
		
		HeartRates rates = new HeartRates(nome, sobrenome, diaNasc, mesNasc, anoNasc, diaAtual, mesAtual, anoAtual);
		
		// Chama metodo para calcular a idade, FCM e Faixa de Frequencia Recomendada
		
		rates.calculaIdade();
		rates.calculaFCM();
		rates.calculaFaixafreq();
		
		// Saida dos resultados
		
		System.out.println("O resultado dos exames foi o seguinte: \n");
		System.out.printf("Nome do paciente:  %s %s \n ", rates.getNome(), rates.getSobrenome() );
		System.out.printf("Nascido em %d/%d/%d, com a idade de %d anos \n", rates.getDiaNasc(), rates.getMesNasc(), rates.getAnoNasc(), rates.getIdade());
		System.out.printf("A frequencia cardiaca maxima do paciente e de %d . A faixa recomendada esta entre %.2f a %.2f .", rates.getFreqMax(), rates.getFaixaMin(), rates.getFaixaMax());
	}

}//fim da classe main

// CODIGO BASEADO NA EXPLICACAO DE AID JAVA https://www.youtube.com/watch?v=YgZ683YQcCs&t=1297s