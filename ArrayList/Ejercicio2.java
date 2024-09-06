package ArrayList;
import java.util.ArrayList;
public class Ejercicio2 {

	public static void main(String[] args) {
		  ArrayList<Integer> numbers = new ArrayList<>();

	        // Agregar elementos al ArrayList
	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);

	        // Mostrar elementos del ArrayList
	        System.out.println("Elementos del ArrayList:");
	        for (int number : numbers) {
	            System.out.println(number);

	        }
	}
}
