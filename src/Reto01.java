import java.util.Arrays;
import java.util.Scanner;

public class Reto01 {

	public static void main(String[] args) {
		/*
		 * Reto #1 ¿ES UN ANAGRAMA? Fecha publicación enunciado: 03/01/22 Fecha
		 * publicación resolución: 10/01/22 Dificultad: MEDIA
		 *
		 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne
		 * verdadero o falso (Boolean) según sean o no anagramas. Un Anagrama consiste
		 * en formar una palabra reordenando TODAS las letras de otra palabra inicial.
		 * NO hace falta comprobar que ambas palabras existan. Dos palabras exactamente
		 * iguales no son anagrama.
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
		Scanner scanner = new Scanner(System.in);
		String primera, segunda;

		System.out.println("Ingrese una palabra");
		primera = scanner.nextLine();

		System.out.println("Ingrese otra palabra");
		segunda = scanner.nextLine();

		if (anagrama(primera, segunda)) {
			System.out.println("Las palabras corresponden a un ANAGRAMA");
		} else {
			System.out.println("Las palabras NO son un ANAGRAMA");
		}

	}

	public static Boolean anagrama(String palabra1, String palabra2) {

		if (palabra1.equalsIgnoreCase(palabra2))
			return false;

		char[] primeraPalabra = palabra1.toLowerCase().toCharArray();
		char[] segundaPalabra = palabra2.toLowerCase().toCharArray();

		Arrays.sort(primeraPalabra);
		Arrays.sort(segundaPalabra);

		return Arrays.equals(primeraPalabra, segundaPalabra);
	}

}
