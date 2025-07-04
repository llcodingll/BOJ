import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            String input = br.readLine();
            StringBuilder mirrored = new StringBuilder();

            for (int i = input.length() - 1; i >= 0; i--) {
                char c = input.charAt(i);
                switch (c) {
                    case 'b':
                        mirrored.append('d');
                        break;
                    case 'd':
                        mirrored.append('b');
                        break;
                    case 'p':
                        mirrored.append('q');
                        break;
                    case 'q':
                        mirrored.append('p');
                        break;
                }
            }

            System.out.println("#" + t + " " + mirrored.toString());
        }
    }
}