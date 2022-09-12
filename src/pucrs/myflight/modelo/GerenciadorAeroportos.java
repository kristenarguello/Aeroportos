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
        for (Aeroporto a : aeroportos) {
            System.out.print(a.getCodigo() + " - ");
            System.out.print(a.getNome() + " - ");
            System.out.print(a.getLocal().getLatitude() + "/");
            System.out.println(a.getLocal().getLongitude());
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
