
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                for (int j2 = j + 1; j2 < 5; j2++) {
                    for (int k = j2 + 1; k < 6; k++) {
                        for (int k2 = k + 1; k2 < 7; k2++) {
                            for (int k3 = k2 + 1; k3 < 8; k3++) {
                                for (int l = k3 + 1; l < 9; l++) {
                                    int num = arr[i] + arr[j] + arr[j2] + arr[k] + arr[k2] + arr[k3] + arr[l];
                                    if (num == 100) {
                                        System.out.println(arr[i]);
                                        System.out.println(arr[j]);
                                        System.out.println(arr[j2]);
                                        System.out.println(arr[k]);
                                        System.out.println(arr[k2]);
                                        System.out.println(arr[k3]);
                                        System.out.println(arr[l]);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }

            }
        }
    }
}
