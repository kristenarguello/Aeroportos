package pucrs.myflight.modelo;
/** *
 * 
 * Observação em relação aos commits do projeto inteiro: todas as vezes fizemos em um computador, realizando commits a partir de um 
 * computador, mas pensamos e programamos juntas em todos os processos.
 * 
 * Uma parte do código já existia na base para o exercício, fomos adicionando conforme os exercícios no pdf diziam para ser feito
 * e seguiamos as instruções de cada pdf. Aqui temos a classe da aeronave, com codigo, descricao, capacidade de pessoas e um contador
 * de quantas aeronaves criadas. Possui interfaces de imprimir, contar, e comparar a partir da aeronave. 
 * 
 * @author Carol e Kristen
 * @version 19 agosto, e primeiras semanas de setembro
 * 
*/

public class Aeronave implements Imprimivel, Contavel, Comparable<Aeronave>{
	private String codigo;
	private String descricao;
	private int capacidade;
	private static int aeronaves = 0;
	
	public Aeronave(String codigo, String descricao, int capacidade) {
		aeronaves++;
		this.codigo = codigo;
		this.descricao = descricao;
		this.capacidade = capacidade;
	}

	public String getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public int getCapacidade() { 
		return capacidade;
	}

	public static int getContador() {
		return aeronaves;
	}

    public void contou() {
		System.out.println("Aeronaves existentes: " + getContador());
	}

	public void imprimir() {
		System.out.println(codigo + " - " + descricao + " - capacidade: "+ capacidade);
	}

	public int compareTo(Aeronave outra) {
		return descricao.compareTo(outra.descricao);
	}

	public String toString() {
		return codigo + " - " + descricao + " - capacidade: "+ capacidade;
	}
}
