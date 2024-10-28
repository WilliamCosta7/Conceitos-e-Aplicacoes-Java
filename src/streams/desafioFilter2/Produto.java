package streams.desafioFilter2;

public class Produto {

	String nome;
	double preco;
	double desconto;
	double frete;
	boolean freteGratis = true;
	
	public Produto(String nome, double preco, double desconto, double frete, boolean freteGratis) {
		super();
		
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
		this.frete = frete;
		this.freteGratis = freteGratis;
		
		if(this.freteGratis) {
			this.frete = 0;
		}
		
	}
	
	
	
}
