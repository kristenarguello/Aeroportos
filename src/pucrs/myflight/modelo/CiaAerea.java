package pucrs.myflight.modelo;
/** *
 * Uma parte do código já existia na base para o exercício, fomos adicionando conforme os exercícios
 * e seguiamos as instruções de cada pdf. Aqui temos a classe da companhia aerea, com codigo, nome, e o total
 * de cias criadas. Possui a interface de comparar a partir do nome da cia aerea. 
 * 
 * @author Carol e Kristen
 * @version 19 agosto, 1, 13 e 22 de setembro
 * 
*/
public class CiaAerea implements Comparable<CiaAerea>{
	private static int totalCias = 0;
	private String codigo;
	private String nome;
	
	public CiaAerea(String codigo, String nome) {
		totalCias++;
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}	
	public static int getTotalCias() {
		return totalCias;
	}

    public int compareTo(CiaAerea cia) {
        return nome.compareTo(cia.nome);
    }

	public String toString() {
		return codigo + "-" + nome;
	}
}
