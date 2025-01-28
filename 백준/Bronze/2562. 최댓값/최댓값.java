import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		List<Integer> list = Arrays.asList(sc.nextInt(), sc.nextInt(), sc.nextInt(),
					sc.nextInt(), sc.nextInt(), sc.nextInt(),
					sc.nextInt(), sc.nextInt(), sc.nextInt());
 
		int val = Collections.max(list);
		int idx = list.indexOf(val) + 1;
 
		System.out.println(val);
		System.out.println(idx);
 
	}
}