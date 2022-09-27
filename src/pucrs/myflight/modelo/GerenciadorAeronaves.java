package pucrs.myflight.modelo;
/** *
 * Uma parte do código já existia na base para o exercício, fomos adicionando conforme os exercícios
 * e seguiamos as instruções de cada pdf. Aqui temos a classe gerenciador de aeronave, com uma lista de aeronaves.
 * Possui os métodos de adicionar, listar todas, buscar por código e ordenar por descrição da aeronave.
 * 
 * @author Carol e Kristen
 * @version 1, 12 e 27 setembro
 * 
*/
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
