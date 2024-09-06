package ArrayList;
import java.util.ArrayList;
public class Ejercicio3 {

	public static void main(String[] args) {
		        ArrayList<Integer> numbers = new ArrayList<>();
		        numbers.add(5);
		        numbers.add(15);
		        numbers.add(25);

		        int sum = 0;
		        for (int number : numbers) {
		            sum += number;
		        }

		        System.out.println("Suma de los elementos: " + sum);

	}

}
