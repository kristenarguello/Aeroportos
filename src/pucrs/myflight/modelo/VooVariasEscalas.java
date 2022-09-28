/* 
package pucrs.myflight.modelo;
* *
 * 
 * A classe voo varias escalas corresponde ao exercício de herança e sobrescrita de métodos.
 * A classe deriva de voo escalas com uma lista de rotas (escalas) e o método para adicionar escalas.
 * Essa classe esta toda comentada pois ela foi implementada quando a classe voo direto era a antiga
 * classe voo, da qual a classe voo escalas derivava.
 * 
 * @author Carol e Kristen
 * @version 1, 15, 22 e 27 de setembro
 * 

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooVariasEscalas extends VooEscalas{

    private ArrayList<Rota> rotasfinais;

    public VooVariasEscalas(Rota rota, Rota rotaFinal, LocalDateTime datahora, Duration duracao) {
        super(rota, rotaFinal, datahora, duracao);
        rotasfinais = new ArrayList<>();
    }

    public void addEscalas(Rota escala) {
        rotasfinais.add(escala);
    }

    public String toString() {
        String tostring="";
        tostring += super.toString();
        for (Rota r : rotasfinais) {
            tostring += "\n->\n " + getStatus() + " " + getDatahora() + "("+getDuracao()+"): " + r;
        }
        return tostring;
    }
}
*/
