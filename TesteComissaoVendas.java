import java.util.Scanner; // importa biblioteca

public class TesteComissaoVendas {  // inicio da classe

	public static void main(String[] args) { 
	
		Scanner input = new Scanner(System.in); // instancia do objeto Scanner

		// Variaveis locais
		
		int codigo;
		String nome;
		int quantidade;
		
		
		// Inicializacao de variaveis
		
		System.out.print("Informe o codigo do vendedor: ");
		codigo = input.nextInt();
		
		
		System.out.print("Informe o nome do vendedor: ");
		nome = input.next();
		
		// Construtor
		
		ComissaoVendas vendedor1 = new ComissaoVendas(nome, codigo);
		
			
		System.out.print("Informe a quantidade de vendas do item 1: ");
		quantidade = input.nextInt();
		vendedor1.setQtde1(quantidade);
		
		System.out.print("Informe a quantidade de vendas do item 2: ");
		quantidade = input.nextInt();
		vendedor1.setQtde2(quantidade);
		
		System.out.print("Informe a quantidade de vendas do item 3: ");
		quantidade = input.nextInt();
		vendedor1.setQtde3(quantidade);
		
		System.out.print("Informe a quantidade de vendas do item 4: ");
		quantidade = input.nextInt();
		vendedor1.setQtde4(quantidade);
		
				
		System.out.printf("O vendedor %s, codigo %d, vendeu a quantidade total de %d itens.\n O valor da comissao gerada e de: %.2f. O valor total a receber e de %.2f", vendedor1.getNomeVendedor(), vendedor1.getCodigoVendedor(), vendedor1.getQuantidadeTotal(), vendedor1.getValorComissao(), vendedor1.getValorTotal());
		
		
	}  // fim do main

}  //fim da classe
