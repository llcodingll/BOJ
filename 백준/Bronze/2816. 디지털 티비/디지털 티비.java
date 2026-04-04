
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] channels = new String[N];
        ArrayList<Integer> orders = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            channels[i] = br.readLine();
        }

        if (channels.length == 2) {
            System.out.print(3);
            return;
        }

        if(!channels[0].equals("KBS1")){
            for (int i = 1; i < N; i++) {
                orders.add(1);
                if (channels[i].equals("KBS1")) {
                    while (i > 0) {
                        channels[i] = channels[i - 1];
                        channels[i - 1] = "KBS1";
                        i--;
                        orders.add(4);
                    }
                    break;
                }
            }
        }

        if(!channels[1].equals("KBS2")){
            for (int i = 1; i < N; i++) {
                orders.add(1);
                if (channels[i].equals("KBS2")) {
                    while (i > 1) {
                        channels[i] = channels[i - 1];
                        channels[i - 1] = "KBS2";
                        i--;
                        orders.add(4);
                    }
                    break;
                }
            }
        }

        for (int i = 0; i < orders.size(); i++) {
            System.out.print(orders.get(i));
        }
    }
}