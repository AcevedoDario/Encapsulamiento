package monedero.main;

public class Monedero {
	//atributos
	private double dinero;
	//-----------
	
	//constructor/es
	public Monedero(double dinero_inicial) {
		dinero = dinero_inicial;
	}
	//-----------
	
	//métodos (getters/setters)
	public void meter(double dinero) {
		this.dinero += dinero;
	}
	
	public void sacar(double dinero) {
		if(hayDineroDisponibleParaSacar(dinero)) {
			this.dinero -= dinero;
		}
	}
	
	private boolean hayDineroDisponibleParaSacar(double dinero) {
		return this.dinero >= dinero; 
	}
	
	public double verDinero() {
		return dinero;
	}
	//-----------
	
	public static void main(String[] args) {
		
	}
}
