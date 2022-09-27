package pucrs.myflight.modelo;
import java.time.Duration;
import java.time.LocalDateTime;
/** *
 * 
 * Maior parte do código 
 * 
 * @author Carol e Kristen
 * @version 22 e 27 setembro
 * 
*/
public abstract class Voo {
    public enum Status { CONFIRMADO, ATRASADO, CANCELADO };

    private LocalDateTime datahora;
    private Status status;

    public Voo(LocalDateTime datahora) {
        this.datahora = datahora;
        this.status = Status.CONFIRMADO;
    } 
    public LocalDateTime getDataHora() {return datahora;}
    public abstract Rota getRota();
    public abstract Duration getDuracao();

    public String toString () {
        return status + " " + datahora; //duracao: rota
    }
    
}
