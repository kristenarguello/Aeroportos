package pucrs.myflight.modelo;
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
