package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public class VooEscalas extends Voo {
    private Rota rotaFinal;

    public VooEscalas(Rota rota, Rota rotaFinal, LocalDateTime datahora, Duration duracao) {
        super(rota, datahora, duracao); //chama o construtor do Voo
        this.rotaFinal = rotaFinal;
    }

    public Rota getRotaFinal() {
        return rotaFinal;
    }

/*
    @Override
    public String toString() {
        //return status + " " + datahora + "("+duracao+"): "+rota+ "-->" + rotaFinal;
        return getStatus() + " " + getDataHora() + "("+getDuracao()+"): " + getRota() + " -> " +rotaFinal;
    }
 */ 

    @Override
    public String toString() {
        return super.toString() + " -> " + rotaFinal;
    }


}
