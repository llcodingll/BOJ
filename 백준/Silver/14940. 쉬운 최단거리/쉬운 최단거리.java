import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M, endI, endJ;
    static int[] di = {0, 0, -1, 1};
    static int[] dj = {-1, 1, 0, 0};
    static int[][] map, result;
    static boolean[][] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        result = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st2.nextToken());
                if (map[i][j] == 2) {
                     endI = i;
                     endJ = j;
                }
            }
        }

        visited[endI][endJ] = true;
        bfs(endI, endJ);
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(!visited[i][j] && map[i][j] != 0) result[i][j] = -1;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sb.append(result[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static void bfs(int r, int c) {
        Queue<int[]> que = new LinkedList<>();
        que.offer(new int[]{r, c});

        while (!que.isEmpty()) {
            int[] curr = que.poll();
            int currI = curr[0];
            int currJ = curr[1];

            for (int d = 0; d < 4; d++) {
                int cnt = result[currI][currJ];
                int nr = currI + di[d];
                int nc = currJ + dj[d];
                if (nr >= 0 && nr < N && nc >= 0 && nc < M && !visited[nr][nc]
                    && map[nr][nc] != 0) {
                    cnt++;
                    visited[nr][nc] = true;
                    result[nr][nc] = cnt;
                    que.offer(new int[]{nr, nc});
                }
            }
        }
    }
}
