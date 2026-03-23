import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long min = Math.min(a, b);
        long max = Math.max(a, b);
        long count = max - min - 1;
        if (count < 0) count = 0;
        System.out.println(count);
        
        for (long i = min + 1; i < max; i++) {
            System.out.print(i + " ");
        }
    }
}