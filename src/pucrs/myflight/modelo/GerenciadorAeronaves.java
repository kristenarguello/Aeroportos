package pucrs.myflight.modelo;

import java.util.ArrayList;
import java.util.Collections;
public class GerenciadorAeronaves {
   private ArrayList<Aeronave> aeronaves;

   public GerenciadorAeronaves() {
      aeronaves = new ArrayList<>();
   }

   public void adicionar(Aeronave aeronave) {
      aeronaves.add(aeronave);
   }

   public void listarTodas() {
      System.out.println("Aeronaves:");
      int i = 1;
      for (Aeronave a : aeronaves) {
         System.out.println(i + ") " + a);
         i++;
      }
   }

   public Aeronave buscaPorCodigo(String codigo) {
      for (Aeronave a : aeronaves) {
         if (a.getCodigo().equals(codigo)) 
            return a;
      } return null;
   }
   
   public void ordenaDescricao() {
    Collections.sort(aeronaves);
   }
}
