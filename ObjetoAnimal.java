package curso14_08;

public class ObjetoAnimal {

	public static void main(String[] args) {

		Animal animal = new Animal();
		Animal cabra = new Animal();
		Animal galinha = new Animal();
		Animal coelho = new Animal();
		Animal pintinho = new Animal();
		Animal cachorro = new Animal();


		System.out.println("AQUI ESTARÃO AS SUAS INFORMAÇÕES!!");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		/////////////////////////////////////

		//Vaca(Animal)

		System.out.println("////////////////////////////////");
		System.out.println("~~~~~~~~~~VACA~~~~~~~~~~");

		animal.setPrdDGestacao(283);
		animal.setPeso("510 kg");
		animal.setIdade(45);
		animal.setPorte("porte médio a grande");
		animal.setFamilia("Bovidae");
		animal.setEspecie("B. taurus");
		animal.setNome("Bos taurus");


		System.out.println(animal.getPrdDGestacao());
		System.out.println(animal.getPeso());
		System.out.println(animal.getIdade());
		System.out.println(animal.getFamilia());
		System.out.println(animal.getEspecie());
		System.out.println(animal.andando());
		System.out.println(animal.comendo());
		System.out.println(animal.getPorte());
		//////////////////////////////////////////


		System.out.println("////////////////////////////////");
		System.out.println("~~~~~~~~~~CABRA~~~~~~~~~~~");

		cabra.setPrdDGestacao(150);
		cabra.setPeso("145 kg");
		cabra.setIdade(18);
		cabra.setPorte("41 – 58 cm");
		cabra.setFamilia("Bovidae");
		cabra.setEspecie("C. aegagrus");
		cabra.setNome("Capra aegagrus hircus");


		System.out.println(cabra.getPrdDGestacao());
		System.out.println(cabra.getPeso());
		System.out.println(cabra.getIdade());
		System.out.println(cabra.getFamilia());
		System.out.println(cabra.getEspecie());
		System.out.println(cabra.andando());
		System.out.println(cabra.comendo());
		System.out.println(cabra.getPorte());
		///////////////////////////////////////////

		System.out.println("////////////////////////////////");
		System.out.println("~~~~~~~~~~GALINHA~~~~~~~~~~");

		galinha.setPrdDGestacao(21);
		galinha.setPeso("2,043 kg");
		galinha.setIdade(6);
		galinha.setPorte("0,95 m");
		galinha.setFamilia("Phasianidae");
		galinha.setEspecie("G. gallus");
		galinha.setNome("Gallus gallus domesticus");

		System.out.println(galinha.getPrdDGestacao());
		System.out.println(galinha.getPeso());
		System.out.println(galinha.getIdade());
		System.out.println(galinha.getFamilia());
		System.out.println(galinha.getEspecie());
		System.out.println(galinha.andando());
		System.out.println(galinha.comendo());
		System.out.println(galinha.getPorte());
		/////////////////////////////////////////////////////////////

		System.out.println("////////////////////////////////");
		System.out.println("~~~~~~~~~~COELHO~~~~~~~~~~");

		coelho.setPrdDGestacao(35);
		coelho.setPeso("2,5 kg");
		coelho.setIdade(9);
		coelho.setPorte("40 cm");
		coelho.setFamilia("Leporidae");
		coelho.setEspecie("Holland Lop");
		coelho.setNome("pompom");

		System.out.println(coelho.getPrdDGestacao());
		System.out.println(coelho.getPeso());
		System.out.println(coelho.getIdade());
		System.out.println(coelho.getFamilia());
		System.out.println(coelho.getEspecie());
		System.out.println(coelho.andando());
		System.out.println(coelho.comendo());
		System.out.println(coelho.getPorte());

		////////////////////////////////////////////////////

		System.out.println("////////////////////////////////");
		System.out.println("~~~~~~~~~~PINTINHO~~~~~~~~~~");

		pintinho.setPrdDGestacao(0);
		pintinho.setPeso("220 gramas");
		pintinho.setIdade(5);
		pintinho.setPorte("pequeno");
		pintinho.setFamilia("Phasianidae");
		pintinho.setEspecie("Gallus gallus domesticus");
		pintinho.setNome("pintinho amarelinho");

		System.out.println(pintinho.getPrdDGestacao());
		System.out.println(pintinho.getPeso());
		System.out.println(pintinho.getIdade());
		System.out.println(pintinho.getFamilia());
		System.out.println(pintinho.getEspecie());
		System.out.println(pintinho.andando());
		System.out.println(pintinho.comendo());
		System.out.println(pintinho.getPorte());

		///////////////////////////////////////////////////////
		
		System.out.println("////////////////////////////////");
		System.out.println("~~~~~~~~~~CACHORRO~~~~~~~~~~");
		
		cachorro.setPrdDGestacao(68);
		cachorro.setPeso("1,4 – 110 kg ");
		cachorro.setIdade(13);
		cachorro.setPorte("15 – 110 cm");
		cachorro.setFamilia("Canídeos");
		cachorro.setEspecie("Canis lupus familiaris");
		cachorro.setNome("Bolt");

		System.out.println(cachorro.getPrdDGestacao());
		System.out.println(cachorro.getPeso());
		System.out.println(cachorro.getIdade());
		System.out.println(cachorro.getFamilia());
		System.out.println(cachorro.getEspecie());
		System.out.println(cachorro.andando());
		System.out.println(cachorro.comendo());
		System.out.println(cachorro.getPorte());
		
	}

}



