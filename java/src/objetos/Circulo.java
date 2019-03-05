package objetos;
import javax.swing.*;
public class Circulo {
	private double radio;
	
	public Circulo(double r){
		setRadio(r);
	}
	
	private void setRadio(double radio) {
		if (radio > 0) {
			this.radio = radio;
		}
		else if(radio == 0){
			this.radio = radio;
			JOptionPane.showMessageDialog(null, "Soy un misero punto sin area");
		}
		else {
			System.err.println("\nEl radio no puede ser negativo.");
			this.radio = 1;
		}
	}

	public double getRadio(){
		return this.radio;
	}
	
	public void crecerCirculo(double suma) {
		setRadio(this.radio + suma);
	}
	public void menguarCirculo(double resta) {
		setRadio(this.radio - resta);
	}
	public double getArea() {
		return (Math.pow(getRadio(),2)*Math.PI);
	}
	public String toString() {
		return "Soy un círculo de radio "+getRadio()+" metros. Ocupo un área de "+getArea()+" metros cuadrados";
	}
}
