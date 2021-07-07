package br.com.generations.exercicioclasseobj;

public class EletronicoTeste {

	public static void main(String[] args) {
		
		Eletronico eletronic = new Eletronico();
		
		eletronic.peça = "Placa de Vídeo (VGA)";
		eletronic.marca = "PC Yes!";
		eletronic.chip = "NVidia";
		eletronic.nome = "Placa de Vídeo PC Yes! RTX 3060 8GB 256 bits";
		eletronic.preço = 5699.99;	
		
		System.out.println("====== PetaByte SHOP =====");
		System.out.println("CHECKOUT:\n\n");
		System.out.println("Produto: " + eletronic.nome);
		System.out.println("Marca: " + eletronic.marca + " / Chip Gráfico: " + eletronic.chip + ".");
		System.out.println("Tipo: " + eletronic.peça + "\n\n");
		System.out.println("PREÇO TOTAL:" + eletronic.preço);

	}

}
