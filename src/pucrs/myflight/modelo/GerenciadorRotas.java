package pucrs.myflight.modelo;
import java.util.ArrayList;
import java.util.Collections;

public class GerenciadorRotas {
 private ArrayList<Rota> rotas;

public void adicionar(Rota rota) {
        rotas.add(rota);
}

public void listarTodas() {
   System.out.println("Rotas:");
      for (Rota r : rotas) {
          System.out.println(r.getCia()+" - ");
          System.out.print(r.getOrigem()+" - ");
          System.out.print(r.getDestino()+" - ");
          System.out.println(r.getAeronave());
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
