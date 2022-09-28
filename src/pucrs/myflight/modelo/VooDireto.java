/** *
 * 
 * A classe voo direto corresponde a classe proposta no exercício de polimorfismo e classes abstratas.
 * A classe é derivada de voo, com a duração e rota.
 *
 * @author Carol e Kristen
 * @version 22 e 27 setembro
 * 
*/

package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;


public class VooDireto extends Voo{
	
	public enum Status { CONFIRMADO, ATRASADO, CANCELADO };
	
	private Duration duracao;
	private Rota rota;
	
	public VooDireto(Rota rota, LocalDateTime datahora) {
		super(datahora);
		this.rota = rota;
	}
	/* SEGUNDO CONSTRUTOR - PRIMEIRO EXERCICIO
	public VooDireto(Rota rota) {

		this.rota = rota;
		this.datahora = LocalDateTime.of(2016, Month.AUGUST, 12, 12,00); //default
		//this.status = Status.CONFIRMADO; //default
	}*/
	
	@Override
	public Rota getRota() {
		return rota;
	}
	
	@Override
	public Duration getDuracao() {
		//t = v/d
		double min =(805/Geo.distancia(rota.getDestino().getLocal(), rota.getOrigem().getLocal()))*60 + 30;
		return Duration.ofMinutes((long)min);
	}
	
	public String toString() {
		return super.toString() + "("+duracao+"): " + rota;
	}
}
