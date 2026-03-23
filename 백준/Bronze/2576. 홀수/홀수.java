import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 7; i++) {
            int a = Integer.parseInt(br.readLine());

            if (a % 2 == 0) {
                continue;
            }

            num += a;
            min = Math.min(a, min);
        }

        if (num == 0) {
            System.out.println(-1);
            return;
        }

        System.out.print(num + "\n" + min);
    }
}