package oo.encapsulamento;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private int idade;
	
	public Pessoa(String nome, String sobrenome,int idade) {
		setNome(nome);
		setIdade(idade);
		setSobrenome(sobrenome);
	}
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getSobrenome() {
		return sobrenome;
	}



	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getnomeCompleto() {
		return getNome() + " " + getSobrenome();
	}



	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		idade = Math.abs(idade);
		if(idade>=0 && idade <=120) {
			this.idade = idade;
		}
	}
	
	@Override
	public String toString() {
		return "Meu Nome é " + getNome() + " e tenho " + getIdade() + " anos.";
	}
	
	
			
	
	
	
}
