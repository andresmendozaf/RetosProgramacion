import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import java.net.URL;

public class Reto05 {

	public static void main(String[] args) {
		/*
		 * Reto #5 ASPECT RATIO DE UNA IMAGEN Fecha publicación enunciado: 01/02/22
		 * Fecha publicación resolución: 07/02/22 Dificultad: DIFÍCIL
		 *
		 * Enunciado: Crea un programa que se encargue de calcular el aspect ratio de
		 * una imagen a partir de una url. - Nota: Esta prueba no se puede resolver con
		 * el playground online de Kotlin. Se necesita Android Studio. - Url de ejemplo:
		 * https://raw.githubusercontent.com/mouredev/mouredev/master/
		 * mouredev_github_profile.png - Por ratio hacemos referencia por ejemplo a los
		 * "16:9" de una imagen de 1920*1080px.
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

		// URL de ejemplo
		String imageUrl = "https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png";

		// Obtener el aspect ratio
		double aspectRatio = getAspectRatio(imageUrl);

		// Imprimir el resultado
		System.out.println("Aspect Ratio: " + aspectRatio);

	}

	public static double getAspectRatio(String imageUrl) {
		try {
			// Crear una instancia de la clase URL
			URL url = new URL(imageUrl);

			// Obtener la imagen desde la URL
			Image img = Toolkit.getDefaultToolkit().createImage(url);

			// Crear un objeto ImageObserver para obtener las dimensiones de la imagen
			ImageObserver observer = (img1, infoflags, x, y, width, height) -> true;

			// Esperar hasta que la imagen esté completamente cargada
			int width = img.getWidth(observer);
			int height = img.getHeight(observer);

			// Calcular el aspect ratio
			double aspectRatio = (double) width / height;

			return aspectRatio;
		} catch (Exception e) {
			// Manejar cualquier excepción que pueda ocurrir
			e.printStackTrace();
			return -1; // Valor de retorno negativo para indicar un error
		}
	}

}
