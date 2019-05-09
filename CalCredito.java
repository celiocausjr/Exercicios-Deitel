
public class CalCredito {

	
	// Variaveis de instancia
	
	private int conta;
	private double saldo;
	private double limite;
	
	private double debito;
	private double credito;
	
	
	// construtor
	
	public CalCredito(int contaTitular, double saldoConta, double limiteConta) {
		
		this.conta = contaTitular;
		this.saldo = saldoConta;
		this.limite = limiteConta;
	}
	

// metodos setters 
	
	public void setConta(int conta) {
		this.conta = conta;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public void setDebito(double debito) {
		double calculo;
		calculo = this.saldo - debito + this.limite;
		if(calculo >=0) {
		this.debito = debito;
		this.saldo = this.saldo - this.debito;
		System.out.printf("O valor de R$ %.2f foi debitado da conta.\n", debito);
	}else {
		System.out.print("Limite de credito excedido \n");
	}
	}

	public void setCredito(double credito) {
		this.credito = credito;
		this.saldo = this.saldo + this.credito;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}

	
	// metodos getters

	public int getConta() {
		return conta;
	}


	public double getSaldo() {
		return saldo;
	}


	public double getDebito() {
		return debito;
	}


	public double getCredito() {
		return credito;
	}


	public double getLimite() {
		return limite;
	}





}// fim da classe