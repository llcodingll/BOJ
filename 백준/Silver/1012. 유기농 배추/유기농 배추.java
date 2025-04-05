import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int M, N, K;
    static int[][] cabbage;
    static boolean[][] visited;
    static int cnt;
    static final int[] di = {-1, 1, 0, 0};
    static final int[] dj = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            cabbage = new int[N][M];
            visited = new boolean[N][M];
            cnt = 0;

            for (int i = 0; i < K; i++) {
                StringTokenizer inputs = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(inputs.nextToken());
                int b = Integer.parseInt(inputs.nextToken());

                cabbage[b][a] = 1;
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if(cabbage[i][j] == 1 && !visited[i][j]) {
                        bfs(i, j);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }

    static void bfs(int x, int y) {
        visited[x][y] = true;
        for (int d = 0; d < 4; d++) {
            int nx = x + di[d];
            int ny = y + dj[d];
            if (nx >= 0 && nx < N && ny >= 0 && ny < M && !visited[nx][ny]
                && cabbage[nx][ny] == 1) {
                bfs(nx, ny);
            }
        }
    }
}
