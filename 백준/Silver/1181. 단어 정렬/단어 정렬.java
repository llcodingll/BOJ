import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] words = new String[N];

        for(int i = 0; i < N; i++) {
            words[i] = br.readLine();
        }

        for(int i = 0; i < N; i++) {
            for(int j = i + 1; j < N; j++) {
                if(words[i].length() == words[j].length()) {
                    if(words[i].compareTo(words[j]) > 0) {
                        String tmp = words[j];
                        words[j] = words[i];
                        words[i] = tmp;
                    }
                }
                else {
                    if(words[i].length() > words[j].length()) {
                        String tmp = words[j];
                        words[j] = words[i];
                        words[i] = tmp;
                    }
                }
            }
        }
        for(int i = 0; i < N; i++) {
            if(i != 0) {
                if(words[i].compareTo(words[i-1]) != 0)
                    System.out.println(words[i]);
            }
            else
                System.out.println(words[i]);
        }
    }
}