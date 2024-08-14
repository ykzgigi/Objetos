package curso14_08;

public class Objeto {

	public static void main(String[] args) {
		Aviao aviao = new Aviao();

		System.out.println("Aqui estão as suas informações!!");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		aviao.setCompanhia("LATAM Airlines Group SA.");
		aviao.setCor("A cor do Avião é verde-amarela");
		aviao.setModelo("O modelo desta aeronave é Boeing 777-300ER");
		aviao.setTamanho("O tamanho do Avião é 74 m");
		aviao.setAssentos("o Avião contém 550 assentos");
	

		System.out.println(aviao.getCompanhia());
		System.out.println(aviao.getCor());
		System.out.println(aviao.getModelo());
		System.out.println(aviao.getTamanho());
		System.out.println(aviao.getAssentos());
		System.out.println(aviao.voar());
		System.out.println(aviao.planar());
		System.out.println(aviao.pousar());

	}

}
