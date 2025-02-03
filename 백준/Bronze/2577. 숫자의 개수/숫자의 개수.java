import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int sum = A * B * C;
        
        int[] arr = new int[10];
        String str = Integer.toString(sum);

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - '0']++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}