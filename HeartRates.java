// Classe para Cálculo da Frequência Cardíaca Alvo
public class HeartRates
{
	// Atributos
	
	private String nome;
	private String sobrenome;
	private int diaNasc;
	private int mesNasc;
	private int anoNasc;
	private int diaAtual;
	private int mesAtual;
	private int anoAtual;
	private int idade;
	
	private int freqMax;
	private double faixaMax;
	private double faixaMin;
	
	
	// Métodos Get
	
	public String getNome() {
		return nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public int getDiaNasc() {
		return diaNasc;
	}
	public int getMesNasc() {
		return mesNasc;
	}
	public int getAnoNasc() {
		return anoNasc;
	}
	public int getDiaAtual() {
		return diaAtual;
	}
	public int getMesAtual() {
		return mesAtual;
	}
	public int getAnoAtual() {
		return anoAtual;
	}
	public int getIdade() {
		return idade;
	}
	public int getFreqMax() {
		return freqMax;
	}
	public double getFaixaMax() {
		return faixaMax;
	}
	public double getFaixaMin() {
		return faixaMin;
	}
	
	
	// Métodos Setters
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public void setDiaNasc(int diaNasc) {
		this.diaNasc = diaNasc;
	}
	public void setMesNasc(int mesNasc) {
		this.mesNasc = mesNasc;
	}
	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}
	public void setDiaAtual(int diaAtual) {
		this.diaAtual = diaAtual;
	}
	public void setMesAtual(int mesAtual) {
		this.mesAtual = mesAtual;
	}
	public void setAnoAtual(int anoAtual) {
		this.anoAtual = anoAtual;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setFreqMax(int freqMax) {
		this.freqMax = freqMax;
	}
	public void setFaixaMax(double faixaMax) {
		this.faixaMax = faixaMax;
	}
	public void setFaixaMin(double faixaMin) {
		this.faixaMin = faixaMin;
	}
	
	// Construtor
	
	public HeartRates(String nomePaciente, String sobrenomePaciente, int diaNascPaciente, int mesNascPaciente, int anoNascPaciente, int diaHoje, int mesHoje, int anoHoje) {
		this.nome = nomePaciente;
		this.sobrenome = sobrenomePaciente;
		this.diaNasc = diaNascPaciente;
		this.mesNasc = mesNascPaciente;
		this.anoNasc = anoNascPaciente;
		this.diaAtual = diaHoje;
		this.mesAtual = mesHoje;
		this.anoAtual = anoHoje;
	}
	
		
	// método Calcular Idade
	
	public int calculaIdade(){
		if (this.anoAtual > this.anoNasc) {
			if (this.mesAtual > this.mesNasc) {
				this.idade = this.anoAtual - this.anoNasc;
			}else if (this.mesAtual == this.mesNasc) {
				if(this.diaAtual >= this.diaNasc) {
					this.idade = this.anoAtual - this.anoNasc;
				}
			}else if (this.mesAtual < this.mesNasc) {
				this.idade = this.anoAtual - this.anoNasc -1;
			}
		}return this.idade;
	}
	
	
	// método para calcular a FCM
	
	public int calculaFCM() {
		this.freqMax = 220 - this.idade;
		return this.freqMax;
	}
	
	// método para calcular a faixa de frequêcia
	
	public void calculaFaixafreq() {
		this.faixaMax = this.freqMax * 0.85;
		this.faixaMin = this.freqMax * 0.50;
	}

}//fechamento da classe
		
		
	
