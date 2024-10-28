package oo.heranca.desafio;

public class Carro {

	public final int VELOCIDADE_MAXIMA;
	protected int velocidade = 0;
	private int delta = 5;

	protected Carro(int velocidadeMaxima) {
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	public void acelerar() {
		if (this.velocidade + getDelta() > VELOCIDADE_MAXIMA) {
			this.velocidade = VELOCIDADE_MAXIMA;
		} else {
			this.velocidade += getDelta();
		}
	}

	public void frear() {
		if (this.velocidade > 5) {
			this.velocidade -= 5;
		} else {
			this.velocidade = 0;
		}
	}

	public String toString() {
		return "A velocidade atual é: " + this.velocidade;
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

}
