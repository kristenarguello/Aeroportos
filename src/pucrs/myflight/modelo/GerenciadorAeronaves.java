package pucrs.myflight.modelo;

import java.util.ArrayList;
import java.util.Collections;
public class GerenciadorAeronaves {
   private ArrayList<Aeronave> aeronaves;

   public void ordenaDescricao() {
    Collections.sort(aeronaves);
   }
}
