import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());

        for (int i = 1; i <= 18258; i++) {
            if (1 + 3L * i * (i - 1) >= N) {
                System.out.print(i);
                break;
            }
        }
    }
}