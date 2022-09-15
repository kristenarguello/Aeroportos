package pucrs.myflight.modelo;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class GerenciadorVoos {
    private ArrayList<Voo> voos;

    public GerenciadorVoos() {
        voos = new ArrayList<>();
    }

    public void adicionar(Voo voo) {
        voos.add(voo);
    }

    public void listarTodos() {
        System.out.println("Voos:");
        for (Voo v : voos) {
            System.out.print(v.getDatahora().toString() + " - ");
            System.out.print(v.getDuracao().toString() + " - ");
            System.out.print(v.getRota().toString() + " - ");
            System.out.println(v.getStatus().toString());
        }
    }

    public Voo buscaPorData(LocalDateTime data) {
        for (Voo v : voos) {
            if (v.getDatahora().equals(data)) {
                return v;
            }
        } return null;
    }
    
}
