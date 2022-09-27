package pucrs.myflight.modelo;
/** *
 * 
 * 
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
