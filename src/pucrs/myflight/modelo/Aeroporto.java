package pucrs.myflight.modelo;
/** *
 * 
 * 
 * 
 * @author Carol e Kristen
 * @version 19 agosto, 1 e 22 de setembro
 * 
*/
public class Aeroporto implements Comparable<Aeroporto>{
	private String codigo;
	private String nome;
	private Geo loc;
	
	public Aeroporto(String codigo, String nome, Geo loc) {
		this.codigo = codigo;
		this.nome = nome;
		this.loc = loc;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Geo getLocal() {
		return loc;
	}
	public int compareTo(Aeroporto outro) {
		return nome.compareTo(outro.nome);
	}

	public String toString() {
		return codigo + "-" + nome + "-" + loc;
	}
}
