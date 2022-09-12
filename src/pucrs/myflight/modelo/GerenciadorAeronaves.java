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
      for (Aeronave a : aeronaves) {
         System.out.print(a.getCodigo() + " - ");
         System.out.print(a.getDescricao() + " - ");
         System.out.println(a.getCapacidade());
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
