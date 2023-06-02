package entities;

public class Televisor {

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
	}

	public void desligarTelevisor () {
		ligar = false;
		
}
	public void mostrarStatus(){
		if (ligar == true) {
			System.out.println("A TV está ligada!");
			System.out.println(canal);
			System.out.println(volume);
			System.out.println(ligar);
		}
		else { 
			System.out.println("Tv desligada!");
		}
	}
}