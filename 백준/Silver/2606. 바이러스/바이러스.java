import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int computers, connections;
    static ArrayList<Integer>[] links;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        computers = Integer.parseInt(br.readLine());
        connections = Integer.parseInt(br.readLine());

        links = new ArrayList[computers + 1];
        for (int i = 1; i <= computers; i++) {
            links[i] = new ArrayList<>();
        }

        visited = new boolean[computers + 1];

        for (int i = 0; i < connections; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            links[a].add(b);
            links[b].add(a);
        }

        System.out.println(bfs());
    }

    static int bfs() {
        Queue<Integer> que = new LinkedList<>();
        que.add(1);
        visited[1] = true;

        int cnt = 0;
        while (!que.isEmpty()) {
            int curr = que.poll();
            for (int x : links[curr]) {
                if (!visited[x]) {
                    visited[x] = true;
                    cnt++;
                    que.add(x);
                }
            }
        }
        return cnt;
    }
}