package pucrs.myflight.modelo;
/** *
 * Uma parte do código já existia na base para o exercício, fomos adicionando conforme os exercícios e seguiamos 
 * as instruções de cada pdf. Aqui temos a classe da rota, com cia aerea, origem, destino e aeronave. 
 * Possui a interface de comparar a partir rota.
 * 
 * @author Carol e Kristen
 * @version 19 agosto, 1 e 15 setembro
 * 
*/
public class Rota implements Comparable<Rota> {
	private CiaAerea cia;
	private Aeroporto origem;
	private Aeroporto destino;
	private Aeronave aeronave;
	
	public Rota(CiaAerea cia, Aeroporto origem, Aeroporto destino, Aeronave aeronave) {
		this.cia = cia;
		this.origem = origem;
		this.destino = destino;
		this.aeronave = aeronave;		
	}	
	
	public CiaAerea getCia() {
		return cia;
	}
	
	public Aeroporto getDestino() {
		return destino;
	}
	
	public Aeroporto getOrigem() {
		return origem;
	}
	
	public Aeronave getAeronave() {
		return aeronave;
	}

	public int compareTo(Rota outra) {
		return cia.compareTo(outra.cia);
	}

	public String toString() {
		return cia + ":" + origem + "-" + destino;
	}
}
