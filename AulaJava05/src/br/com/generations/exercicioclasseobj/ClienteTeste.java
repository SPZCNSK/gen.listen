package br.com.generations.exercicioclasseobj;

public class ClienteTeste {

	public static void main(String[] args) {
		
		//Instancia - Criação do objeto
		Cliente cliente = new Cliente();
		
		cliente.nome = "Adamastor Pitaco";
		cliente.idade = 34;
		cliente.endereco = "R. Tales de Mileto, 01";
		cliente.telefone = "93451-4569";
		cliente.estadoCivil = "Solteiro";
		
		System.out.println("Nome do Cliente: " + cliente.nome);
		System.out.println("Idade: " + cliente.idade);
		System.out.println("Estado Civil: " + cliente.estadoCivil);
		System.out.println("Telefone: " + cliente.telefone);
		System.out.println("Endereço: " + cliente.endereco);
		

	}

}
