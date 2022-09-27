package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
/** *
 * 
 * Maior parte do código 
 * 
 * @author Carol e Kristen
 * @version 1 e 27 setembro
 * 
*/
public class VooEscalas extends Voo {
    private ArrayList<Rota> escalas;

    public VooEscalas( LocalDateTime datahora) {
        super(datahora); //chama o construtor do Voo
        escalas = new ArrayList<>();
    }

    public void adicionaRota (Rota rota) {
        escalas.add(rota);
    }

    @Override
    public Duration getDuracao() {
        double total = 0;
        for (Rota r : escalas) {
            total += (805/Geo.distancia(r.getDestino().getLocal(), r.getOrigem().getLocal()))*60 + 30;
        }
        return Duration.ofMinutes((long)total);
        //retorna a duracao total de todas as escalas
    }

    @Override
    public Rota getRota() {
        return escalas.get(0);
    }

    public ArrayList<Rota> getRotas() {
        return escalas;
    }


    @Override
    public String toString() {
        String tostring= super.toString();
        int i = 1;
        for(Rota r: escalas) {
            if(i < escalas.size()) {
                tostring += "\nEscala " +i+ ": " +r.getDestino().getCodigo();
                i++;
            }
            else
            tostring += "\nDestino Final: " +r.getDestino().getCodigo();
        }
        tostring += "\nDuração total de voo: " + getDuracao();
        return tostring;
    }


}
