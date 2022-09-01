package pucrs.myflight.modelo;
import java.util.ArrayList;
import java.util.Collections;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto> aeroportos;

    public void ordenaAeroporto() {
        Collections.sort(aeroportos);
    }
}
