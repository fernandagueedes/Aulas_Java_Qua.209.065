package principal;

import entities.Televisor;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Crie uma classe Televisor. Essa classe deve possuir tr�s atributos: 
			canal // inicia em 1 e vai at� 16 
			volume // inicia em 0 e vai at� 10 
			ligado // inicia em desligado ou false
			e a seguinte lista de m�todos:
			aumentarVolume()    // Aumenta em 1 o volume 
			reduzirVolume()        // Diminui em 1 o volume 
			subirCanal()        // Aumenta em 1 o canal 
			descerCanal()        // Diminui em 1 o canal 
			ligarTelevisor()    // Liga a televis�o 
			desligarTelevisor()    // Desliga a televis�o 
			mostrarStatus()        // Dizer qual o canal, o volume e se o televisor est� ligado
			*/
		
		Televisor televisor = new Televisor();
		
		televisor.ligarTelevisor();
		televisor.aumentarVolume();
		televisor.aumentarVolume();
		televisor.aumentarVolume();
		televisor.aumentarVolume();
		televisor.aumentarVolume();
		
		televisor.reduzirVolume();
		
		televisor.subirCanal();
		televisor.subirCanal();
		televisor.subirCanal();
		televisor.subirCanal();
		televisor.subirCanal();
		
		televisor.descerCanal();
		
		televisor.mostrarStatus();
		
		televisor.desligarTelevisor();
		
		televisor.mostrarStatus();
		
	}

}
