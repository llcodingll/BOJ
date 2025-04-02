import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static int N, cnt;
    static int[][] adj;
    static boolean[][] visited;
    static int[] di = {0, 0, -1, 1}, dj = {-1, 1, 0, 0};
    static List<Integer> result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        adj = new int[N][N];
        visited = new boolean[N][N];
        result = new LinkedList<>();
        cnt = 1;

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < N; j++) {
                adj[i][j] = input.charAt(j) - '0';
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && adj[i][j] == 1) {
                    dfs(i, j);
                    result.add(cnt);
                    cnt = 1;
                }
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    static void dfs(int i, int j) {
        visited[i][j] = true;

        for (int d = 0; d < 4; d++) {
            int ni = i + di[d];
            int nj = j + dj[d];
            if (ni >= 0 && ni < N && nj >= 0 && nj < N && !visited[ni][nj] && adj[ni][nj] == 1) {
                cnt++;
                dfs(ni, nj);
            }
        }
    }
}