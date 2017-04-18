
public class Linea {
	private Punto inicio;
	private Punto fin;
	
	public Linea(Punto inicio, Punto fin) {
		this.setInicio(inicio);
		this.setFin(fin);
	}

	public Punto getInicio() {
		return inicio;
	}

	public void setInicio(Punto inicio) {
		this.inicio = inicio;
	}

	public Punto getFin() {
		return fin;
	}

	public void setFin(Punto fin) {
		this.fin = fin;
	}
}
