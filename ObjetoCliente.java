package curso14_08;

public class ObjetoCliente {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		Cliente cliente2 = new Cliente();
		
		System.out.println("~///////////////////////////////////////~");
		System.out.println("-----Cliente-----");
		
		
		cliente.setNome("Luisa");
		cliente.setTelefone("996542783");
		cliente.setCpf("387.537.835.85");
		cliente.setId(25307);
		cliente.setRg("8647469058");
		
		
		System.out.println(cliente.getNome());
		System.out.println(cliente.getTelefone());
		System.out.println(cliente.getCpf());
		System.out.println(cliente.getId());
		System.out.println(cliente.getRg());
		System.out.println(cliente.compra());
		System.out.println(cliente.escolhe());
		System.out.println(cliente.experimenta());
		System.out.println(cliente.devolve());
		
		
		//////////////////////////////////////////////////////
		
		
		
		System.out.println("~///////////////////////////////////////~");
		System.out.println("-----Cliente 02-----");
		
		
		cliente2.setNome("Rafaella");
		cliente2.setTelefone("996578853");
		cliente2.setCpf("276.465.857.87");
		cliente2.setId(87354);
		cliente2.setRg("837656829");
		
		
		System.out.println(cliente2.getNome());
		System.out.println(cliente2.getTelefone());
		System.out.println(cliente2.getCpf());
		System.out.println(cliente2.getId());
		System.out.println(cliente2.getRg());
		System.out.println(cliente2.compra());
		System.out.println(cliente2.escolhe());
		System.out.println(cliente2.experimenta());
		System.out.println(cliente2.devolve());
	}



}


