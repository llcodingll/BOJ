import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int sortOfCoins, money;
    static int N, cnt;
    static int[] coinValues;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sortOfCoins = Integer.parseInt(st.nextToken());
        money = Integer.parseInt(st.nextToken());
        coinValues = new int[sortOfCoins];
        for (int i = 0; i < sortOfCoins; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            coinValues[i] = Integer.parseInt(st2.nextToken());
        }
        N = sortOfCoins-1;
        cnt = 0;
        int minCoins = 0;
        minCoins = re();

        System.out.println(minCoins);
    }

    static int re() {
        if(cnt != 0 && N >= 0 && money == 0) return cnt;
        int tmp = money;

        while(N >= 0 && money != 0) {
            if(coinValues[N] <= tmp){
                cnt += tmp /= coinValues[N];
                money %= coinValues[N];
            }
            N--;
            re();
        }
        return cnt;
    }
}
