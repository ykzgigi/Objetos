package curso14_08;

public class Animal {
	String especie;
	int idade;
	String porte;
	int prdDGestacao;
	String nome;
	String peso;
	String familia;

	public int getPrdDGestacao() {
		return prdDGestacao;
	}
	public void setPrdDGestacao(int prdDGestacao) {
		this.prdDGestacao = prdDGestacao;
	}
	
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte (String porte) {
		this.porte = porte;
	}
	public String getNome() { //get mostra
		return nome;
	}
	public void setNome(String nome) { //set modifica
		this.nome = nome;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public String getFamilia() {
		return familia;
	}
	public void setFamilia(String familia) {
		this.familia = familia;
	}
	public String comendo () {
		return ("comendo");
	}
	public String andando () {
		return ("andando");
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int  getIdade() {
		return idade;
	}
	
}


