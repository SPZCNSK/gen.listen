package br.com.generation.exerciciosheranca;

public class Animal {
	
	//Atributos
	String nome, som;
	int idade;
	
	//Ações
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSom() {
		System.out.print("Que som emite? : ");
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}
	

}
