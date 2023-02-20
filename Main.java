import java.util.Scanner;
public class Main {   
  static Scanner console = new Scanner(System.in);
	public static void main(String[] args) {
		int t, d, w, b;
		t = console.nextInt();
		String[] arr = new String[t];
		for (int i = 0; i < t; i++) {
		    d = console.nextInt();
		    w = console.nextInt();
		    b = console.nextInt();
		    arr[i] = (b < d-1) ? "NO" :  "YES";
		}
		for (String j: arr) {
            System.out.println(j);
    }
	}
}
