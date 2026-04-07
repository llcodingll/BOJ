import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] bodyProfiles = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                bodyProfiles[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            int result = 1;
            for (int j = 0; j < N; j++) {
                if (bodyProfiles[i][0] < bodyProfiles[j][0] && bodyProfiles[i][1] < bodyProfiles[j][1]) {
                    result++;
                }
            }
            System.out.print(result + " ");
        }
    }
}