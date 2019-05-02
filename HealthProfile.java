
public class HealthProfile {
	
	// Atributos da Classe
	
	private String nome;
	private String sobrenome;
	private String sexo;
	private int diaNasc;
	private int mesNasc;
	private int anoNasc;
	private int diaHoje;
	private int mesHoje;
	private int anoHoje;
	private double altura;
	private double peso;
	
	private int idade;
	private int fcm;
	private double fMin;
	private double fMax;
	private double imc;
	
	
	// Metodos Setters
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
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
	public void setDiaHoje(int diaHoje) {
		this.diaHoje = diaHoje;
	}
	public void setMesHoje(int mesHoje) {
		this.mesHoje = mesHoje;
	}
	public void setAnoHoje(int anoHoje) {
		this.anoHoje = anoHoje;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setFcm(int fcm) {
		this.fcm = fcm;
	}
	public void setfMin(double fMin) {
		this.fMin = fMin;
	}
	public void setfMax(double fMax) {
		this.fMax = fMax;
	}
	public void setImc(double imc) {
		this.imc = imc;
	}
	
	
	//Metodos Getters
	
	public String getNome() {
		return nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public String getSexo() {
		return sexo;
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
	public int getDiaHoje() {
		return diaHoje;
	}
	public int getMesHoje() {
		return mesHoje;
	}
	public int getAnoHoje() {
		return anoHoje;
	}
	public double getAltura() {
		return altura;
	}
	public double getPeso() {
		return peso;
	}
	public int getIdade() {
		return idade;
	}
	public int getFcm() {
		return fcm;
	}
	public double getfMin() {
		return fMin;
	}
	public double getfMax() {
		return fMax;
	}
	public double getImc() {
		return imc;
	}
	
	// Construtor
	
	public HealthProfile (String nomePaciente, String sobrenomePaciente, String sexo, int diaNascimento, int mesNascimento, int anoNascimento, double altura, double peso, int diaHoje, int mesHoje, int anoHoje) {
	
		this.nome = nomePaciente;
		this.sobrenome = sobrenomePaciente;
		this.sexo = sexo;
		this.diaNasc = diaNascimento;
		this.mesNasc = mesNascimento;
		this.anoNasc = anoNascimento;
		this.altura = altura;
		this.peso = peso;
		this.diaHoje = diaHoje;
		this.mesHoje = mesHoje;
		this.anoHoje = anoHoje;
	}
	
	// Metodo para calcular a idade
	
	public int idade() {
		
		if (this.anoHoje > this.anoNasc) {
			if(this.mesHoje > this.mesNasc) {
				this.idade = this.anoHoje - this.anoNasc;
				}
			if(this.mesHoje == this.mesNasc) {
				if(this.diaHoje >= this.diaNasc) {
					this.idade = this.anoHoje - this.anoNasc;
				}
			}else if(this.mesHoje < this.mesNasc) {
				this.idade = this.anoHoje - this.anoNasc - 1;
			}
		}
		return this.idade;
	}
	
	
	// Metodo para calcular frequencia maxima, faixa recomendada e IMC
	
	public void calculo() {
		
		this.fcm = 220 - this.idade;
		this.fMin = this.fcm * 0.50;
		this.fMax = this.fcm * 0.85;
		this.imc = this.peso/(this.altura * this.altura);
	}

	
}// fim da classe

