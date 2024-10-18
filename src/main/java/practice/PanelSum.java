package practice;

import java.util.Scanner;

public class PanelSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] numbers = new int[n + 1];
        int[] preSum = new int[n + 1];  // 구간 합 배열

        for (int i = 1; i <= n; i++) {
            numbers[i] = sc.nextInt();
            preSum[i] = preSum[i - 1] + numbers[i];  // 구간 합 미리 계산
        }

        for (int k = 0; k < m; k++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            System.out.println(preSum[j] - preSum[i - 1]);  // i부터 j까지의 합
        }
    }
}
