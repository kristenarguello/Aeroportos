package pucrs.myflight.modelo;

import java.util.ArrayList;
/** *
 * Uma parte do código já existia na base para o exercício, fomos adicionando conforme os exercícios
 * e seguiamos as instruções de cada pdf. Aqui temos a classe gerenciador de cia aerea, com uma lista de cias aereas.
 * Possui os métodos de adicionar, listar todas, buscar por código e buscar por nome. 
 * 
 * @author Carol e Kristen
 * @version 1, 12 e 27 setembro
 * 
*/
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
		int i = 1;
		for (CiaAerea c : empresas) {
			System.out.println(i + ") "+c);
			i++;
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
