package entities;

public class Televisor {
	
	/* atributos criados: canal, volume, ligar 
	 * m�todos criados ; s�o os public void, ou seja, ex: aumentar volume � um dos m�todos
	 */

	
	public int canal;
	public int volume;
	public boolean ligar;

	public void aumentarVolume() {

		if (volume >= 0 || volume < 10) {
			volume = volume + 1;
		}
	}

	public void reduzirVolume() {
		if (volume > 0 || volume < 10) {
			volume = volume - 1;
		}
	}

	public void subirCanal() {
		if (canal >= 1 || canal <= 16) {
			canal = canal + 1;
		}
	}

	public void descerCanal() {
		if (canal >= 1 || canal <= 16) {
			canal = canal - 1;

		}
	}
	
	public void ligarTelevisor() {
		ligar = true;
		canal = 1;
	}

	public void desligarTelevisor () {
		ligar = false;
		
}
	public void mostrarStatus(){
		if (ligar == true) {
			System.out.println("A TV est� ligada!");
			System.out.println("canal : " + canal);
			System.out.println("volume: " + volume);
			System.out.println("status: TV ligada");
		}
		else { 
			System.out.println("Tv desligada!");
		}
	}
}