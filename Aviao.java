package curso14_08;

public class Aviao {

	String companhia;
	String cor;
	String assentos;
	String tamanho;
	String modelo;
	String voar;
	String pousar;
	String planar;

	public String getCompanhia() {
		return companhia;
	}
	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}
	public String getCor() {
		return cor;
	}
	public void setCor (String cor) {
		this.cor = cor;
	}
	public String getAssentos() { //get mostra
		return assentos;
	}
	public void setAssentos(String assentos) { //set modifica
		this.assentos = assentos;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String voar () {
		return ("A avião irá decolar em 20 minutoss");
	}
	public String pousar () {
		return ("O Avião irá pousar em 10 minutos");
	}
	public String planar () {
		return ("O avião está planando..");
	}
}
