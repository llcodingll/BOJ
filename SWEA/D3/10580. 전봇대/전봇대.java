import java.io.*;
import java.util.*;

public class Solution {
    static long countInversions(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1, new int[arr.length]);
    }

    static long mergeSort(int[] arr, int left, int right, int[] temp) {
        if (left >= right) return 0;

        int mid = (left + right) / 2;
        long invCount = 0;

        invCount += mergeSort(arr, left, mid, temp);
        invCount += mergeSort(arr, mid + 1, right, temp);

        int i = left, j = mid + 1, k = left;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) temp[k++] = arr[i++];
            else {
                temp[k++] = arr[j++];
                invCount += (mid - i + 1);
            }
        }

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];
        for (int p = left; p <= right; p++) arr[p] = temp[p];

        return invCount;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int TC = Integer.parseInt(br.readLine());
        for (int t = 1; t <= TC; t++) {
            int N = Integer.parseInt(br.readLine());
            int[][] wires = new int[N][2];

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                wires[i][0] = Integer.parseInt(st.nextToken());
                wires[i][1] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(wires, Comparator.comparingInt(a -> a[0]));

            int[] biArr = new int[N];
            for (int i = 0; i < N; i++) {
                biArr[i] = wires[i][1];
            }
            long result = countInversions(biArr);
            sb.append("#").append(t).append(" ").append(result).append("\n");
        }

        System.out.print(sb);
    }
}
