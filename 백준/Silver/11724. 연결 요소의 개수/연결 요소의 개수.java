
import java.io.*;
import java.util.*;

public class Main {

    public static List<List<Integer>> graph;
    public static int N;
    public static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = br.readLine().split(" ");
        N = Integer.parseInt(nm[0]);
        int M = Integer.parseInt(nm[1]);
        visited = new boolean[N + 1];

        int answer = 0;

        graph = new ArrayList<>();

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for (int i = 1; i <= N; i++) {
            if (visited[i]) {
                continue;
            }

            bfs(i);
            answer++;
        }

        System.out.println(answer);

    }

    public static void bfs(int start) {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int cur = queue.poll();

            for (int next : graph.get(cur)) {
                if (visited[next]) {
                    continue;
                }

                visited[next] = true;
                queue.add(next);
            }
        }

    }
}
