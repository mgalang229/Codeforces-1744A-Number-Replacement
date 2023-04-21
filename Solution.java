import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = fs.nextInt();
			}
			char[] s = fs.next().toCharArray();
			char[] holder = new char[50];
			Arrays.fill(holder, '?');
			boolean possible = true;
			for (int i = 0; i < n; i++) {
				if (holder[a[i]-1] == '?') {
					holder[a[i]-1] = s[i];
				}
				if (holder[a[i]-1] != '?' && holder[a[i]-1] != s[i]) {
					possible = false;
					break;
				}
			}
			System.out.println(possible ? "YES" : "NO");
		}
		fs.close();
	}
}
