package curso14_08;

public class Cadeira {
	
	String tamanho;
	String marca;
	String modelo;
	String estilo;
	String cor;
	String girar;
	String movimento;
	
	
	
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getEstilo() { //get mostra
		return estilo;
	}
	public void setEstilo(String estilo) { //set modifica
		this.estilo = estilo;
	}
	public String getCor() { //get mostra
		return cor;
	}
	public void setCor(String cor) { //set modifica
		this.cor = cor;
	}
	public String girar() {
		return "A cadeira está girando";
	}
	public String movimento() {
		return "A cadeira está se movimentando";
	}
	public String experimenta() {
		return "Experimenta os produtos";
	}
	
}


