import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    //괴물의 광선 상, 하, 좌, 우 델타값
    static int[] monsterLaserI = {-1, 1, 0, 0};
    static int[] monsterLaserJ = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());

            int[][] area = new int[N][N];
            //괴물의 위치가 2로 표시되므로 for문을 돌면서 2를 찾으면 현위치로 저장
            int monsterCurrI = 0;
            int monsterCurrJ = 0;
            for (int i = 0; i < N; i++) {
                String[] inputs = br.readLine().split(" ");
                for (int j = 0; j < N; j++) {
                    area[i][j] = Integer.parseInt(inputs[j]); //입력
                    if (area[i][j] == 2) {
                        monsterCurrI = i; //2
                        monsterCurrJ = j; //4
                    }
                }
            } //입력 + 괴물 위치 저장

            //괴물의 광선 나가는 방향
            int nextLaserI;
            int nextLaserJ;

            for (int d = 0; d < 4; d++) {
                for (int k = 1; k < N; k++) {
                    nextLaserI = monsterCurrI + monsterLaserI[d]*k;
                    nextLaserJ = monsterCurrJ + monsterLaserJ[d]*k;
                    if (nextLaserI < N && nextLaserI >= 0 && nextLaserJ >= 0 && nextLaserJ < N) {
                        if(area[nextLaserI][nextLaserJ] == 0) {
                            area[nextLaserI][nextLaserJ] = 1;
                        } else if(area[nextLaserI][nextLaserJ] == 1){
                            break;
                        }
                    }
                }
            }

            //0인 부분만 카운트
            int cnt = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if(area[i][j] == 0){
                        cnt++;
                    }
                }
            }
            System.out.println("#"+t+" "+cnt);
        }
    }
}
