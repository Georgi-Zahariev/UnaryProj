import java.util.Scanner;

public class Unary implements Comparable<Unary> {
	private long num;

	public Unary(Scanner inp) {
		num = inp.nextLong();
	}

	public long getNum() {
		return num;
	}

	public String toBinary(Long a) {
		return Long.toBinaryString(a);
		// return Long.toBinaryString(num);
	}

	public int count1(String s) {
		int br = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1')
				br++;
		}
		return br;
	}

	@Override
	public int compareTo(Unary a) {
		if (count1(toBinary(num)) > count1(toBinary(a.num)))
			return -1;
		if (count1(toBinary(num)) < count1(toBinary(num)))
			return 1;
		return Long.signum(a.num - this.num);

	}

	public String toString() {
		return this.num + "";
	}

}
