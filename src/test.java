import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;

public class test {

	static ArrayList<Unary> Lst = new ArrayList<Unary>();

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		do {
			Unary s = new Unary(inp);
			if (s.getNum() == 0)
				break;
			Lst.add(s);

		} while (true);

		Collections.sort(Lst);

		for (Unary t : Lst)
			System.out.println(t.toString());

	}

}
