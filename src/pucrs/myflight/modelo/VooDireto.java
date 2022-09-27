package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;


public class VooDireto extends Voo{
	
	public enum Status { CONFIRMADO, ATRASADO, CANCELADO };
	
	//private LocalDateTime datahora;
	private Duration duracao;
	private Rota rota;
	//private Status status;
	
	public VooDireto(Rota rota, LocalDateTime datahora) {
		super(datahora);
		this.rota = rota;
		
		//this.datahora = datahora;
		//this.status = Status.CONFIRMADO; // default é confirmado
	}
	/* SEGUNDO CONSTRUTOR - PRIMEIRO EXERCICIO
	public VooDireto(Rota rota) {

		this.rota = rota;
		this.datahora = LocalDateTime.of(2016, Month.AUGUST, 12, 12,00); //default
		//this.status = Status.CONFIRMADO; //default
	}
	*/
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
