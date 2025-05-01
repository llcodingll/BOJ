import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Integer[][] arr = new Integer[41][2];
        arr[0][0] = 1;
        arr[0][1] = 0;
        arr[1][0] = 0;
        arr[1][1] = 1;
        for (int j = 0; j < N; j++) {
            int n = Integer.parseInt(br.readLine());
            for (int i = 2; i <= n; i++) {
                arr[i][0] = arr[i - 1][0] + arr[i - 2][0];
                arr[i][1] = arr[i - 1][1] + arr[i - 2][1];
            }
            System.out.println(arr[n][0]+" "+arr[n][1]);
        }
    }
}