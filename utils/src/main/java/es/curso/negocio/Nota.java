package es.curso.negocio;

public class Nota {
	
	
	private double valor ;
	private String asignatura ;
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public Nota(double valor, String asignatura) {
		super();
		this.valor = valor;
		this.asignatura = asignatura;
	}
	
	public boolean esMayorQue(Nota n) {
		return this.valor > n.getValor();
	}

}
