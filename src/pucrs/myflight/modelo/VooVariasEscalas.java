package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooVariasEscalas extends VooEscalas{

    private int n_escalas;
    private ArrayList<Rota> rotasfinais;

    public VooVariasEscalas(Rota rota, Rota rotaFinal, LocalDateTime datahora, Duration duracao, int n_escalas) {
        super(rota, rotaFinal, datahora, duracao);
        this.n_escalas = n_escalas;
        for (int i=0;i<n_escalas;i++) {
            
        }
    }

    public String toString() {
        super.toString();
        for (int i=0;i<n_escalas;i++) {
            System.out.print("-> " + "");
        }
        return "";
    }
    
}
