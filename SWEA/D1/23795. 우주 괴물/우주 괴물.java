import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpaceMonster {

    // 괴물의 광선 상, 하, 좌, 우 델타값
    static int[] monsterLaserI = {-1, 1, 0, 0};
    static int[] monsterLaserJ = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());

            // 입력 및 괴물 위치 저장
            int[][] area = new int[N][N];
            int[] monsterPosition = new int[2];
            area = readArea(br, N, monsterPosition);

            // 괴물의 광선 발사 적용
            applyMonsterLaser(area, N, monsterPosition);

            // 0인 부분 카운트
            int cnt = countZeros(area, N);
            System.out.println("#" + t + " " + cnt);
        }
    }

    private static int[][] readArea(BufferedReader br, int N, int[] monsterPosition) throws IOException {
        int[][] area = new int[N][N];
        for (int i = 0; i < N; i++) {
            String[] inputs = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                area[i][j] = Integer.parseInt(inputs[j]);
                if (area[i][j] == 2) {
                    monsterPosition[0] = i;
                    monsterPosition[1] = j;
                }
            }
        }
        return area;
    }

    private static void applyMonsterLaser(int[][] area, int N, int[] monsterPosition) {
        int monsterCurrI = monsterPosition[0];
        int monsterCurrJ = monsterPosition[1];

        int nextLaserI;
        int nextLaserJ;

        for (int d = 0; d < 4; d++) {
            for (int k = 1; k < N; k++) {
                nextLaserI = monsterCurrI + monsterLaserI[d] * k;
                nextLaserJ = monsterCurrJ + monsterLaserJ[d] * k;
                if (nextLaserI < N && nextLaserI >= 0 && nextLaserJ >= 0 && nextLaserJ < N) {
                    if (area[nextLaserI][nextLaserJ] == 0) {
                        area[nextLaserI][nextLaserJ] = 1;
                    } else if (area[nextLaserI][nextLaserJ] == 1) {
                        break;
                    }
                }
            }
        }
    }

    private static int countZeros(int[][] area, int N) {
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (area[i][j] == 0) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
