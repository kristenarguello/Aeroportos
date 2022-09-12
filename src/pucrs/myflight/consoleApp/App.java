package pucrs.myflight.consoleApp;
import java.time.*;

import pucrs.myflight.modelo.*;

interface Contavel {
	void contou();
}
public class App {

	public static void main(String[] args) {
		System.out.println("\nMyFlight project...");
		
		//teste - ex1
		Geo local_poa = new Geo(-29.9942,-51.1714);
		Geo local_sp = new Geo(-23.4322,-46.4692);
		CiaAerea cia1 = new CiaAerea("123","Gol");
		Aeroporto aeroporto_ori1 = new Aeroporto("456", "Salgado Filho", local_poa);
		Aeroporto aeroporto_che1 = new Aeroporto("789","Guarulhos",local_sp);
		Aeronave aeronave1 = new Aeronave("7979", "internacional",200);
		Aeronave aeronave2 = new Aeronave("7979", "nacional",100);
		Rota rota1 = new Rota(cia1, aeroporto_ori1, aeroporto_che1, aeronave1);
		
		Voo voo_teste1 = new Voo(rota1, Duration.ofHours(4));
		Voo voo_teste2 = new Voo(rota1, LocalDateTime.of(2018, Month.SEPTEMBER, 01, 12,00), Duration.ofHours(4));
		//funcionou - teste no debuger, nao ficou null

		
		//teste - ex2
		System.out.println("Distancia entre Salgado Filho e Guarulhos com método de classe: " + Geo.distancia(local_poa,local_sp));
		System.out.println("Distancia entre Salgado Filho e Guarulhos com método non-static: " + local_poa.distancia(local_sp));


		//teste - ex3
		System.out.println("Total de empresas áreas: " + CiaAerea.getTotalCias());
		aeronave1.contou();
		//Aeronave aeronave3 = new Aeronave("7979", "nacional");
		//aeronave1.contou(); independente do objeto usado para o metodo, é contado


	}
} 
 