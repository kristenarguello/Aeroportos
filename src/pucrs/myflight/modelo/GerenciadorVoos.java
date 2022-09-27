package pucrs.myflight.modelo;
import java.time.LocalDateTime;
import java.util.ArrayList;
/** *
 * 
 * Maior parte do código 
 * 
 * @author Carol e Kristen
 * @version 1, 12 e 27 setembro
 * 
*/
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
        int i = 1;
        for (Voo v : voos) {
            System.out.println(i +") " + v);
            i++;
        }
    }

    public Voo buscaPorData(LocalDateTime data) {
        for (Voo v : voos) {
            if (v.getDataHora().equals(data)) {
                return v;
            }
        } return null;
    }
    
}
