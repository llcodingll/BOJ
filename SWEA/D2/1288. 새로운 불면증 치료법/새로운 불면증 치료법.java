
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();

            Set<Character> check = new HashSet<>();

            int number = N;

            while (true) {
                String str = String.valueOf(number);
                for (int i = 0; i < str.length(); i++) {
                    check.add(str.charAt(i));
                }

                //set 내부의 데이터가 0~9까지 모두 포함되어있는지 체크
                //숫자를 한자리씩 잘랐으니, 총 10자리가 들어갔는지만 체크 = size가 10
                if (check.size() == 10) {
                    break; //0~9까지 모든 수가 들어갔다는 뜻
                }

                number += N;
            }
            System.out.println("#" + tc + " " + number);
        }
    }
}
