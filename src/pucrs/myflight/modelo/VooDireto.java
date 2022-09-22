package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

public class VooDireto {
	
	public enum Status { CONFIRMADO, ATRASADO, CANCELADO };
	
	private LocalDateTime datahora;
	private Duration duracao;
	private Rota rota;
	private Status status;
	
	public VooDireto(Rota rota, LocalDateTime datahora, Duration duracao) {
		this.rota = rota;
		this.datahora = datahora;
		this.duracao = duracao;
		this.status = Status.CONFIRMADO; // default é confirmado
	}
	public VooDireto(Rota rota,Duration duracao) {
		this.rota = rota;
		this.duracao = duracao;
		this.datahora = LocalDateTime.of(2016, Month.AUGUST, 12, 12,00); //default
		this.status = Status.CONFIRMADO; //default
	}
	
	public Rota getRota() {
		return rota;
	}
	
	public LocalDateTime getDatahora() {
		return datahora;
	}
	
	public Duration getDuracao() {
		return duracao;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status novo) {
		this.status = novo;
	}

	public String toString() {
		return status + " " + datahora + "("+duracao+"): " + rota;
	}

	
}
