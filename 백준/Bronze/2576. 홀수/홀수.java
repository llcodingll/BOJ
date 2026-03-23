import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[7];
        for (int i = 0; i < 7; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int num = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 7; i++) {
            if (arr[i] % 2 == 0) {
                continue;
            }
            num += arr[i];
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        if (num == 0) {
            System.out.println(-1);
        } else {
            System.out.print(num + "\n" + min);
        }

    }
}