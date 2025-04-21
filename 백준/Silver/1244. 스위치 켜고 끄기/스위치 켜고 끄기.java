import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int switchCnt = sc.nextInt();
        int[] switches = new int[switchCnt+1];
        for (int i = 1; i <= switchCnt; i++) {
            switches[i] = sc.nextInt();
        }
        int studentsCnt = sc.nextInt();
        int[][] students = new int[studentsCnt][2];
        for (int i = 0; i < studentsCnt; i++) {
            for (int j = 0; j < 2; j++) {
                students[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < studentsCnt; i++) {
            if(students[i][0] == 1) {
                for (int j = switchCnt; j > 0; j--) {
                    if (j % students[i][1] == 0) {
                        switch (switches[j]){
                            case 0:
                                switches[j] = 1;
                                break;
                            case 1:
                                switches[j] = 0;
                                break;
                        }
                    }
                }
            } else {
                int mid = students[i][1];
                int left = mid;
                int right = mid;
                while (left > 0 && right <= switchCnt && switches[left] == switches[right]) {
                    left--;
                    right++;
                }
                left++;
                right--;
                for (int j = left; j <= right; j++) {
                    switch (switches[j]) {
                        case 0:
                            switches[j] = 1;
                            break;
                        case 1:
                            switches[j] = 0;
                            break;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= switchCnt; i++) {
            sb.append(switches[i]).append(" ");
            if (i % 20 == 0) {
                sb.append("\n");
            }
        }
        System.out.print(sb);
    }
}