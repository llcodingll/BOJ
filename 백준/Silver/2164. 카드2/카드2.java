import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int card = Integer.parseInt(br.readLine());
        Deque<Integer> que = new LinkedList<>();
        for (int i = 1; i <= card; i++) {
            que.add(i);
        }
        for (int i = 0; i < card; i++) {
            while(que.size() != 1) {
                que.poll();
                if(que.size() != 1) {
                    que.addLast(que.getFirst());
                    que.poll();
                }
            }
        }
        System.out.println(que.getFirst());
    }
}
