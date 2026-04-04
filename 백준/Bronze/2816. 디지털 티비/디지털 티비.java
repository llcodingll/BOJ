import java.io.*;
import java.util.*;

public class Main {

    public static int N;
    public static ArrayList<Integer> orders;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        String[] channels = new String[N];
        orders = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            channels[i] = br.readLine();
        }

        if (channels.length == 2) {
            System.out.print(3);
            return;
        }

        find(channels, "KBS1", 0);
        find(channels, "KBS2", 1);

        for (int i = 0; i < orders.size(); i++) {
            System.out.print(orders.get(i));
        }
    }

    private static void find(String[] channels, String target, int destinationIndex) {
        if (channels[destinationIndex].equals(target)) {
            return;
        }

        for (int i = 1; i < N; i++) {
            orders.add(1);
            if (channels[i].equals(target)) {
                while (i > destinationIndex) {
                    channels[i] = channels[i - 1];
                    channels[i - 1] = target;
                    i--;
                    orders.add(4);
                }
                break;
            }
        }
    }
}