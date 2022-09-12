package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	
	public GerenciadorCias() {
		empresas = new ArrayList<>();
	}

	public void adicionar(CiaAerea cia) {
		empresas.add(cia);
	}
	
	public void listarTodas() {
		System.out.println("Companhias Áreas:");
		for (CiaAerea c : empresas) {
			System.out.println(c.getCodigo() + " - " + c.getNome());
		}
	}

	public CiaAerea buscaPorCodigo (String cod) {
		for (CiaAerea a : empresas) {
			if (a.getCodigo().equals(cod))
				return a;
		}
		return null;
	}

	public CiaAerea buscaPorNome (String nome) {
		for (CiaAerea c : empresas) {
			if (c.getNome().equals(nome))
				return c;
		} return null;
		}
}

