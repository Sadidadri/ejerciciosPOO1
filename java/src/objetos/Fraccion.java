package objetos;

public class Fraccion {
	private int numerador;
	private int denominador;
	
	public Fraccion(int num, int den) {
		setNumerador(num);
		setDenominador(den);
	}
	private void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	private void setDenominador(int denominador) {
		if(denominador != 0) {
			this.denominador = denominador;
		}
		else {
			System.err.println("El denominador no puede ser 0\n");
			this.denominador = 1;
		}
	}
	
	public int getNumerador() {
		return numerador;
	}
	
	public int getDenominador() {
		return denominador;
	}
	
	public String mostrarFraccion() {
		return "\t "+getNumerador()+"\n  ---------------- \n\t "+getDenominador()+"\n\n";
	}
	
	public void modificarFraccion(int nuevoNum, int nuevoDen) {
		setNumerador(nuevoNum);
		setDenominador(nuevoDen);
	}
	
	public double obtenerResultado() {
		return (double)this.numerador/this.denominador;
	}
	
	public void multiplicaFraccion(int num) {
		setNumerador(getNumerador()*num);
	}
	
	public Fraccion multiplicaFracciones(Fraccion segundaFraccion) {
		Fraccion resultado = new Fraccion(getNumerador()*segundaFraccion.getNumerador(), getDenominador()*segundaFraccion.getDenominador());
		return resultado;
	}
	
	public Fraccion sumaFracciones(Fraccion segundaFraccion) {
		int numerador1 = getNumerador()*segundaFraccion.getDenominador();
		int numerador2 = getDenominador()*segundaFraccion.getNumerador();
		int denominadorComun = getDenominador()*segundaFraccion.getDenominador();
		Fraccion resultado = new Fraccion(numerador1+numerador2,denominadorComun);
		return resultado;
	}
	public Fraccion restaFracciones(Fraccion segundaFraccion) {
		int numerador1 = getNumerador()*segundaFraccion.getDenominador();
		int numerador2 = getDenominador()*segundaFraccion.getNumerador();
		int denominadorComun = getDenominador()*segundaFraccion.getDenominador();
		Fraccion resultado = new Fraccion(numerador1-numerador2,denominadorComun);
		return resultado;
	}
	public void simplificaFraccion() {
		int contador;
		int nuevoNumerador = getNumerador();
		int nuevoDenominador = getDenominador();
		if (getNumerador() >= getDenominador()) {
			contador = getNumerador();
		}
		else {
			contador = getDenominador();
		}
		
		for (int i = contador;i>0;i--) {
			if(nuevoNumerador%i == 0 && nuevoDenominador%i == 0) {
				nuevoNumerador = nuevoNumerador/i;
				nuevoDenominador = nuevoDenominador/i;
			}
		}
		setNumerador(nuevoNumerador);
		setDenominador(nuevoDenominador);
	}
}
