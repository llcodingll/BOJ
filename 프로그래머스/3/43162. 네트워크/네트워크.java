import java.util.*;

class Solution {

    public int solution(int n, int[][] computers) {

        return network(n, computers);
    }

    public static int network(int n, int[][] computers) {

        int count = 0;

        boolean[] visited = new boolean[n];

        Queue<int[]> que = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {

                que.offer(new int[]{i});
                visited[i] = true;

                while (!que.isEmpty()) {

                    int[] cur = que.poll();

                    int now = cur[0];

                    for (int next = 0; next < n; next++) {
                        if (computers[now][next] == 1 && !visited[next]) {

                            visited[next] = true;

                            que.offer(new int[]{next});
                        }
                    }
                }
                count++;
            }
        }

        return count;
    }
}