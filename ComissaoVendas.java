
public class ComissaoVendas {
	
	// variaveis de instancia
	
	private String nomeVendedor;
	private int codigoVendedor;
	double valorComissao;
	double valorTotal;
	int quantidadeTotal;
	private double valorFixo = 200.00;
	private int qtde1;
	private int qtde2;
	private int qtde3;
	private int qtde4;
	private double totalItem1; 
	private double totalItem2;
	private double totalItem3;
	private double totalItem4;
	
	
	// Construtor
	
	public ComissaoVendas(String nomeVendedor, int codigoVendedor) {
		this.codigoVendedor = codigoVendedor;
		this.nomeVendedor = nomeVendedor;
	}
	
	
	// Setters e Getters
	
	public String getNomeVendedor() {
		return nomeVendedor;
	}
	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}
	public int getCodigoVendedor() {
		return codigoVendedor;
	}
	public void setCodigoVendedor(int codigoVendedor) {
		this.codigoVendedor = codigoVendedor;
	}
	public double getValorComissao() {
		this.valorComissao = this.totalItem1 + this.totalItem2 + this.totalItem3 + this.totalItem4;
		return valorComissao;
	}
		
	public double getValorTotal() {
		this.valorTotal = this.valorComissao + this.valorFixo;
		return valorTotal;
	}
	
	public int getQuantidadeTotal() {
		this.quantidadeTotal = this.qtde1 + this.qtde2 + this.qtde3 + this.qtde4;
		return quantidadeTotal;
	}
		
	public void setQtde1(int quantidade1) {
		this.qtde1 = quantidade1;
		this.totalItem1 = this.qtde1 * 239.99;
	}
	
	public void setQtde2(int quantidade2) {
		this.qtde2 = quantidade2;
		this.totalItem2 = this.qtde2 * 129.75;
	}

	public void setQtde3(int quantidade3) {
		this.qtde3 = quantidade3;
		this.totalItem3 = this.qtde3 * 99.95;
	}
	
	
	public void setQtde4(int quantidade4) {
		this.qtde4 = quantidade4;
		this.totalItem4 = this.qtde4 * 350.89;
	}
	
	public void setValorFixo(double valorFixo) {
		this.valorFixo = valorFixo;
	}
	
	
} // fim da classe
