import java.util.ArrayList;
import java.util.List;

public class Answer{
	public static int answer(int[] numbers){
		List<Integer> pirates = new ArrayList<Integer>();
		int i = 0;
		while (true) {

			if (pirates.contains(i)) {
				return pirates.size() - pirates.indexOf(i);
			}
			pirates.add(i);

			i = numbers[i];
		}
	}
}


