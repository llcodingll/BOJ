import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    static int j = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            for( ; j <= num; j++) {
                stack.push(j);
                sb.append("+\n");
            }
            if(stack.peek() == num) {
                stack.pop();
                sb.append("-\n");
            }else {
                System.out.println("NO");
                return;
            }
        }

        System.out.println(sb);
    }
}
