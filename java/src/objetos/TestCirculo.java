package objetos;

public class TestCirculo {

	public static void main(String[] args) {
		//Creacion de la instancia circulo
		Circulo circulo1 = new Circulo(2);
		//Muestra estado inicial	
		System.out.println(circulo1.toString());
		//Le suma 27 metros al radio
		circulo1.crecerCirculo(27);
		//Muestra el area del circulo
		System.out.println("El area del circulo es: "+circulo1.getArea()+" metros cuadrados");
		//Decrementa su radio en 10 metros
		circulo1.menguarCirculo(10);
		//Muestra su estado final
		System.out.println(circulo1.toString());
		//Comprobamos un circulo de radio 0
		Circulo circulo0 = new Circulo(0);
	}

}
