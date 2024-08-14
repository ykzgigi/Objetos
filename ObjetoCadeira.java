package curso14_08;

public class ObjetoCadeira {

	public static void main(String[] args) {
		
		Cadeira cadeira01 = new Cadeira();
		Cadeira cadeira02 = new Cadeira();	
		
		
		System.out.println("~///////////////////////////////////////~");
		System.out.println("-----CADEIRA 01-----");
		
		
		cadeira01.setMarca("Lorell");
		cadeira01.setTamanho("‎63,5 x 63,5 x 119 cm");
		cadeira01.setCor("PRETA");
		cadeira01.setModelo("Max Racer. Storm Master.");
		cadeira01.setEstilo("GAMER");
		
		
		System.out.println(cadeira01.getMarca());
		System.out.println(cadeira01.getTamanho());
		System.out.println(cadeira01.getCor());
		System.out.println(cadeira01.getModelo());
		System.out.println(cadeira01.getEstilo());
		System.out.println(cadeira01.girar());
		System.out.println(cadeira01.movimento());
		
		
		System.out.println("~///////////////////////////////////////~");
		System.out.println("-----CADEIRA 02-----");
		
		
		
		cadeira01.setMarca("ANM");
		cadeira01.setTamanho("‎62 x 63 x 129 cm; 9,49 quilogramas");
		cadeira01.setCor("PRETA");
		cadeira01.setModelo("Eurynom Ergonômica");
		cadeira01.setEstilo("De Escritório");
		
		
		System.out.println(cadeira01.getMarca());
		System.out.println(cadeira01.getTamanho());
		System.out.println(cadeira01.getCor());
		System.out.println(cadeira01.getModelo());
		System.out.println(cadeira01.getEstilo());
		System.out.println(cadeira01.girar());
		System.out.println(cadeira01.movimento());
		

	}

}
