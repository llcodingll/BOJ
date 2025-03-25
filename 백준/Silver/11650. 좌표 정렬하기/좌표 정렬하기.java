import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] coor = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer inputs = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
               coor[i][j] = Integer.parseInt(inputs.nextToken());
            }
        }

        Arrays.sort(coor, Comparator.comparingInt((int[] o) -> o[0])
                .thenComparing(o -> o[1]));
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                sb.append(coor[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
