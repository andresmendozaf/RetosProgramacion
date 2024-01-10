
public class Reto04 {

	public static void main(String[] args) {
		/*
		 * Reto #4 ÁREA DE UN POLÍGONO Fecha publicación enunciado: 24/01/22 Fecha
		 * publicación resolución: 31/01/22 Dificultad: FÁCIL
		 *
		 * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz
		 * de calcular y retornar el área de un polígono. - La función recibirá por
		 * parámetro sólo UN polígono a la vez. - Los polígonos soportados serán
		 * Triángulo, Cuadrado y Rectángulo. - Imprime el cálculo del área de un
		 * polígono de cada tipo.
		 *
		 * Información adicional: - Usa el canal de nuestro discord
		 * (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o
		 * prestar ayuda a la acomunidad. - Puedes hacer un Fork del repo y una Pull
		 * Request al repo original para que veamos tu solución aportada. - Revisaré el
		 * ejercicio en directo desde Twitch el lunes siguiente al de su publicación. -
		 * Subiré una posible solución al ejercicio el lunes siguiente al de su
		 * publicación.
		 *
		 */

		Triangulo triangulo = new Triangulo(10, 5);
		triangulo.printArea();

		Cuadrado cuadrado = new Cuadrado(5);
		cuadrado.printArea();
		
		Rectangulo rectangulo = new Rectangulo(5,5);
		rectangulo.printArea();
		
	}

	public interface Poligonos {

		double area();

		void printArea();
	}

	public static class Triangulo implements Poligonos {

		private double base;
		private double altura;

		public Triangulo(double base, double altura) {
			this.base = base;
			this.altura = altura;
		}

		@Override
		public double area() {

			return (base / 2) * altura;
		}

		@Override
		public void printArea() {
			System.out.println("El área del TRIÁNGULO es : " + area());
		}

	}

	public static class Cuadrado implements Poligonos {

		private double base;

		public Cuadrado(double base) {
			this.base = base;
		}

		@Override
		public double area() {
			return base * base;
		}

		@Override
		public void printArea() {
			System.out.println("El área del CUADRADO es : " + area());
		}

	}

	public static class Rectangulo implements Poligonos {

		private double base;
		private double altura;

		public Rectangulo(double base, double altura) {
			this.base = base;
			this.altura = altura;
		}

		@Override
		public double area() {
			return base * altura;
		}

		@Override
		public void printArea() {
			System.out.println("El área del RECTANGULO es : " + area());
		}
	}

}
