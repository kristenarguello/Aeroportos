package pucrs.myflight.modelo;

interface Contavel {
		void contou();
}
interface Imprimivel {
	void imprimir();
}
public class Aeronave implements Imprimivel, Contavel, Comparable<Aeronave>{
	private String codigo;
	private String descricao;
	private static int aeronaves = 0;
	
	public Aeronave(String codigo, String descricao) {
		aeronaves++;
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public static int getContador() {
		return aeronaves;
	}

    public void contou() {
		System.out.println("Aeronaves existentes: " + getContador());
	}
	public void imprimir() {
		System.out.println(codigo + " - " + descricao);
	}
	public int compareTo(Aeronave outra) {
		return descricao.compareTo(outra.descricao);
	}

}
