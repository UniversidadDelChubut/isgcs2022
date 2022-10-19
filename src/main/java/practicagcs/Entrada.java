package practicagcs;

public class Entrada {
	
	private String campo;
	private Double valor;
	
	public Entrada() {
		
	}
	
	public Entrada(String campo, Double valor) {
		super();
		this.campo = campo;
		this.valor = valor;
	}
	
	public String getCampo() {
		return campo;
	}
	public void setCampo(String campo) {
		this.campo = campo;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
}
