package pucrs.myflight.modelo;
import java.util.ArrayList;
import java.util.Collections;
/** *
 * Uma parte do código já existia na base para o exercício, fomos adicionando conforme os exercícios
 * e seguiamos as instruções de cada pdf. Aqui temos a classe gerenciador de aeroporto, com uma lista de aeroportos.
 * Possui os métodos de adicionar, listar todas, buscar por código e ordenar aeroporto.
 * 
 * @author Carol e Kristen
 * @version 1, 12 e 27 setembro
 * 
*/
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
