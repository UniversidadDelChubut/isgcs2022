package practicagcs;

public class Entrada {
	
	private String campo;
	private Double valor;
	
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
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((campo == null) ? 0 : campo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entrada other = (Entrada) obj;
		if (campo == null) {
			if (other.campo != null)
				return false;
		} else if (!campo.equals(other.campo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Entrada [campo=" + campo + ", valor=" + valor + "]";
	}
	
	
}
