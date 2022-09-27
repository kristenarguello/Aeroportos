package pucrs.myflight.modelo;
import java.util.ArrayList;
import java.util.Collections;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto> aeroportos;

    public GerenciadorAeroportos() {
        aeroportos = new ArrayList<>();
    }

    public void adicionar(Aeroporto aeroporto) {
        aeroportos.add(aeroporto);
    }

    public void listarTodos() {
        System.out.println("Aeroportos:");
        int i =1;
        for (Aeroporto a : aeroportos) {
            System.out.println(i + ") "+ a);
          i++;
        }
    }

     public Aeroporto buscaPorCodigo(String codigo) {
        for (Aeroporto a : aeroportos) {
			if (a.getCodigo().equals(codigo))
				return a;
		}
		return null;
    }

    public void ordenaAeroporto() {
        Collections.sort(aeroportos);
    }
}
