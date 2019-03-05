package objetos;

public class TestFraccion {

	public static void main(String[] args) {
		
		Fraccion fraccion1 = new Fraccion(4,24);
		
		System.out.println("Fraccion 1:");
		System.out.println(fraccion1.mostrarFraccion());
		System.out.println("Fraccion 1 simplificada:");
		fraccion1.simplificaFraccion();
		System.out.println(fraccion1.mostrarFraccion());
		
		System.out.println("El resultado decimal de Fraccion 1 es:");
		System.out.println(fraccion1.obtenerResultado());
		
		
		Fraccion fraccion2 = new Fraccion(5,4);
		Fraccion fraccion3 = new Fraccion(3,2);
		System.out.println("Fraccion 2:");
		System.out.println(fraccion2.mostrarFraccion());
		System.out.println("Fraccion 3:");
		System.out.println(fraccion3.mostrarFraccion());
		
		System.out.println("Suma de fracciones 2 y 3:");
		System.out.println(fraccion2.sumaFracciones(fraccion3).mostrarFraccion());
		System.out.println("Resta de fracciones 2 y 3:");
		System.out.println(fraccion2.restaFracciones(fraccion3).mostrarFraccion());
		System.out.println("Multiplicacion de fracciones 2 y 3:");
		System.out.println(fraccion2.multiplicaFracciones(fraccion3).mostrarFraccion());
		
		System.out.println("La fraccion 2 multiplicada por un numero:");
		fraccion2.multiplicaFraccion(10);
		System.out.println(fraccion2.mostrarFraccion());
	}

}
