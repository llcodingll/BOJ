import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double[] scores = new double[N];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < N; i++) {
            scores[i] = Double.parseDouble(st.nextToken());
        }

        double sum = 0;
        Arrays.sort(scores);
        for(int i = 0; i < N; i++) {
            sum += ((scores[i] / scores[N - 1]) * 100);
        }
        System.out.print(sum / N);
    }
}