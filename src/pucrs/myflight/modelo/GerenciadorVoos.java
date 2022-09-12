package pucrs.myflight.modelo;

import java.lang.reflect.Array;
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
            System.out.print("oi");
        }
    }
}
