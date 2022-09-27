package pucrs.myflight.modelo;
import java.util.ArrayList;
import java.util.Collections;
/** *
 * 
 * Maior parte do código 
 * 
 * @author Carol e Kristen
 * @version 19 agosto, e primeiras semanas de setembro
 * 
*/
public class GerenciadorRotas {
    private ArrayList<Rota> rotas;

public GerenciadorRotas() {
    rotas = new ArrayList<>();
}

public void adicionar(Rota rota) {
    rotas.add(rota);
}

public void listarTodas() {
   System.out.println("Rotas:");
   int i =1;
      for (Rota r : rotas) {
        System.out.println(i +") " + r);
        i++;
      }     
}

public Rota buscarPorOrigem(Aeroporto origem) {
    for(Rota r : rotas) {
        if(r.getOrigem().equals(origem))
            return r;
    }
    return null;
}

 public Rota buscarPorDestino(Aeroporto destino) {
    for(Rota r : rotas) {
        if(r.getDestino().equals(destino))
            return r;
    }
    return null;
}
 
 public void ordenaRotas() {
    Collections.sort(rotas);
 }
}
