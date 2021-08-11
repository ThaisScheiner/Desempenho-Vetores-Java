package view;

import controller.VetorController;

public class Principal {
	
	public static void main(String[] args){
		VetorController vc = new VetorController();
		
		int[] vet1000 = vc.gerarVetor(1000);
		int[] vet10000 = vc.gerarVetor(10000);
		int[] vet100000 = vc.gerarVetor(100000);
		
		vc.tempoPercursoVetor(vet1000);
		vc.tempoPercursoVetor(vet10000);
		vc.tempoPercursoVetor(vet100000);
		
		
	}

}
