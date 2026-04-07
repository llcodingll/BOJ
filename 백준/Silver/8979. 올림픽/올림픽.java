import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] medals = new int[N][4];
        int[] target = new int[3];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                medals[i][j] = Integer.parseInt(st.nextToken());
            }
            if (medals[i][0] == K) {
                target[0] = medals[i][1];
                target[1] = medals[i][2];
                target[2] = medals[i][3];
            }
        }

        int rank = 1;

        for (int i = 0; i < N; i++) {
            int gold = medals[i][1];
            int silver = medals[i][2];
            int bronze = medals[i][3];

            if (gold > target[0]
                    || (gold == target[0] && silver > target[1])
                    || (gold == target[0] && silver == target[1] && bronze > target[2])) {
                rank++;
            }
        }

        System.out.println(rank);
    }
}