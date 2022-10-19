package practicagcs;

public class Salida {

	private String idProceso;
	private String campo;
	private Double total;
	public Salida(String idProceso, String campo, Double total) {
		super();
		this.idProceso = idProceso;
		this.campo = campo;
		this.total = total;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((campo == null) ? 0 : campo.hashCode());
		result = prime * result + ((idProceso == null) ? 0 : idProceso.hashCode());
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
		Salida other = (Salida) obj;
		if (campo == null) {
			if (other.campo != null)
				return false;
		} else if (!campo.equals(other.campo))
			return false;
		if (idProceso == null) {
			if (other.idProceso != null)
				return false;
		} else if (!idProceso.equals(other.idProceso))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Salida [idProceso=" + idProceso + ", campo=" + campo + ", total=" + total + "]";
	}
	
		
	
}
