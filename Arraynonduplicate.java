package review;

public class Arraynonduplicate {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, };
		int[] b = { 5, 6, 7, 8 };
		int[] c = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int j = 0; j < b.length; j++) {
			c[a.length + j] = b[j];

		}
		for (int i = 0; i < c.length; i++) {
			int count = 1;
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					count++;

				}
			}

			if (count == 1) {
				System.out.println(c[i]);

			}

		}

	}
}
