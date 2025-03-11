import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> que = new LinkedList<Integer>();
        int x = 0;

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String S = st.nextToken();
            switch (S) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    que.add(num);
                    x = num;
                    break;
                case "pop":
                    if (que.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(que.remove() + "\n");
                    }
                    break;
                case "size":
                    sb.append(que.size() + "\n");
                    break;
                case "empty":
                    if (que.isEmpty()) sb.append("1\n");
                    else sb.append("0\n");
                    break;
                case "front":
                    if (que.isEmpty()) sb.append("-1\n");
                    else sb.append(que.peek() + "\n");
                    break;
                case "back":
                    if (que.isEmpty()) sb.append("-1\n");
                    else sb.append(x + "\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}