package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooVariasEscalas extends VooEscalas{

    private ArrayList<Rota> rotasfinais;

    public VooVariasEscalas(Rota rota, Rota rotaFinal, LocalDateTime datahora, Duration duracao) {
        super(rota, rotaFinal, datahora, duracao);
        rotasfinais = new ArrayList<>();
    }

    public void addEscalas(Rota escala) {
        rotasfinais.add(escala);
    }

    public String toString() {
        String tostring="";
        tostring += super.toString();
        for (Rota r : rotasfinais) {
            tostring += "\n->\n " + getStatus() + " " + getDatahora() + "("+getDuracao()+"): " + r;
        }
        return tostring;
    }
}
