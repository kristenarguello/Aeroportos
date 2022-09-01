package pucrs.myflight.consoleApp;
import java.time.*;

import pucrs.myflight.modelo.*;

public class App {

	public static void main(String[] args) {
		System.out.println("\nMyFlight project...");
		
		//teste - ex1
		Geo locala = new Geo(-29.9942,-51.1714);
		Geo localb = new Geo(-23.4322,-46.4692);
		CiaAerea cia1 = new CiaAerea("123","Gol");
		Aeroporto aeroporto_ori1 = new Aeroporto("456", "Salgado Filho", locala);
		Aeroporto aeroporto_che1 = new Aeroporto("789","Guarulhos",localb);
		Aeronave aeronave1 = new Aeronave("7979", "internacional");
		Rota rota1 = new Rota(cia1, aeroporto_ori1, aeroporto_che1, aeronave1);
		
		Voo voo_teste1 = new Voo(rota1, Duration.ofHours(4));
		Voo voo_teste2 = new Voo(rota1, LocalDateTime.of(2018, Month.SEPTEMBER, 01, 12,00), Duration.ofHours(4));

		
	}
}
