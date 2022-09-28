package pucrs.myflight.consoleApp;
import java.time.*;

import pucrs.myflight.modelo.*;
public class App {
	public static void main(String[] args) {
		System.out.println("\nMyFlight project...");
		
		//teste - ex1
		Geo local_poa = new Geo(-29.9942,-51.1714);
		Geo local_sp = new Geo(-23.4322,-46.4692);
		CiaAerea cia1 = new CiaAerea("123","Gol");
		CiaAerea cia2 = new CiaAerea("456", "Latam");
		Aeroporto aeroporto_ori1 = new Aeroporto("456", "Salgado Filho", local_poa);
		Aeroporto aeroporto_che1 = new Aeroporto("789","Guarulhos",local_sp);
		Aeronave aeronave1 = new Aeronave("7979", "internacional",200);
		Aeronave aeronave2 = new Aeronave("7979", "nacional",100);
		Rota rota1 = new Rota(cia1, aeroporto_ori1, aeroporto_che1, aeronave1);
		Rota rota2 = new Rota(cia2,aeroporto_ori1, aeroporto_che1, aeronave1);
		
		//Voo voo_teste1 = new Voo(rota1, Duration.ofHours(4));
		//Voo voo_teste2 = new Voo(rota1, LocalDateTime.of(2018, Month.SEPTEMBER, 01, 12,00), Duration.ofHours(4));
		//funcionou - teste no debuger, nao ficou null
		
		//teste - ex2
		System.out.println("Distancia entre Salgado Filho e Guarulhos com método de classe: " + Geo.distancia(local_poa,local_sp));
		System.out.println("Distancia entre Salgado Filho e Guarulhos com método non-static: " + local_poa.distancia(local_sp));

		//teste - ex3
		System.out.println("Total de empresas áreas: " + CiaAerea.getTotalCias());
		aeronave1.contou();
		//Aeronave aeronave3 = new Aeronave("7979", "nacional");
		//aeronave1.contou(); independente do objeto usado para o metodo, é contado

		//teste - ex4
		System.out.println("ORDENACAO DE ROTA POR NOME DA CIA");
		rota1.compareTo(rota2);
		System.out.println("ORDENACAO DE AEROPORTO POR NOME");
		aeroporto_ori1.compareTo(aeroporto_che1);

		System.out.println("\n\n\n\n");
		GerenciadorAeroportos gerenciador = new GerenciadorAeroportos();
		gerenciador.adicionar(aeroporto_ori1);
		gerenciador.adicionar(aeroporto_che1);
		
		gerenciador.listarTodos();
		System.out.println("ORDENACAO DO GERENCIADOR DE AEROPORTOS");
		gerenciador.ordenaAeroporto();
		gerenciador.listarTodos();

		GerenciadorRotas gerenciadorRotas = new GerenciadorRotas();
		gerenciadorRotas.adicionar(rota2);
		gerenciadorRotas.adicionar(rota1);
		gerenciadorRotas.listarTodas();
		System.out.println("ORDENACAO DO GERENCIADOR DE ROTAS");
		gerenciadorRotas.ordenaRotas();
		gerenciadorRotas.listarTodas();

		//teste - ex5
		//VooEscalas vooUmaEscala = new VooEscalas(rota1, rota2, LocalDateTime.of(2018, Month.SEPTEMBER, 01, 12,00), Duration.ofHours(4));
		//VooVariasEscalas vooVarias = new VooVariasEscalas(rota1, rota2, LocalDateTime.of(2018, Month.SEPTEMBER, 01, 12,00), Duration.ofHours(4));

		Rota rota3 = new Rota(cia1, aeroporto_ori1, aeroporto_che1, aeronave1);
		Rota rota4 = new Rota(cia2, aeroporto_che1, aeroporto_ori1, aeronave2);
		
		//vooVarias.addEscalas(rota3);
		//vooVarias.addEscalas(rota4);
		//vooVarias.addEscalas(rota3);
        /* 
		System.out.println("UMA ESCALA");
		System.out.println(vooUmaEscala);
		System.out.println("\nVARIAS ESCALAS");
		System.out.println(vooVarias);
         */

		//polimorfismo
		//Voo vooteste = new Voo(rota1, Duration.ofHours(4));
		//vooteste = new VooEscalas(rota1, rota2, LocalDateTime.of(2018, Month.SEPTEMBER, 01, 12,00), Duration.ofHours(4));
		//vooteste = new VooVariasEscalas(rota1, rota1, LocalDateTime.of(2018, Month.SEPTEMBER, 01, 12,00), Duration.ofHours(4));


		//Voo voo1 = new VooEscalas(rota1, rota2, LocalDateTime.of(2018, Month.SEPTEMBER, 01, 12,00), Duration.ofHours(4));
		//if (voo1 instanceof VooEscalas) {
			//faz algo que seja um voo com duas escalas
		//} else {
			//tratamento normal
		//}

		Voo voodireto = new VooDireto(rota3, LocalDateTime.of(2018, Month.SEPTEMBER, 01, 12,00));
		//VooDireto direto = new VooDireto(rota4, LocalDateTime.of(2018, Month.SEPTEMBER, 01, 12,00)); testamos se funcionava
		VooEscalas escalas = new VooEscalas(LocalDateTime.of(2018, Month.SEPTEMBER, 01, 12,00));
		//Voo vooescalas = new VooEscalas(LocalDateTime.of(2018, Month.SEPTEMBER, 01, 12,00)); testamos se funcionava

		System.out.println("DURAÇÃO ROTA 3: ");
		System.out.println(voodireto.getDuracao());
		System.out.println("VOO DIRETO COM ROTA 3");
		System.out.println(voodireto);
		
		//nao é metodo abstrato, entao precisa ser o criado direto da classe que tem o metodo desejado
		escalas.adicionaRota(rota1);
		escalas.adicionaRota(rota4);

		System.out.println("\nDURACAO TOTAL ESCALAS ROTA 1 e 4: ");
		System.out.println(escalas.getDuracao());
		System.out.println("VOO COM ESCALAS PRINTADO");
		System.out.println(escalas);
	}
} 
