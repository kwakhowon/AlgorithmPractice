package practice;

import java.util.Scanner;

/*
소수(에라토스테네스 체)
자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
제한시간은 1초입니다.
▣ 입력설명
첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
▣ 출력설명
첫 줄에 소수의 개수를 출력합니다.
▣ 입력예제 1
20
▣ 출력예제 1
*/
public class ArrayExample5 {
    public int solution(int n) {
        int cnt = 0;
        int[] arr = new int[n+1];
        for(int i=2; i<=n; i++) {
            if(arr[i] ==0)
                cnt++;
            for (int j = 0; j <= n; j= j+i) {
                arr[j] = 1;
                
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        ArrayExample5 example5 = new ArrayExample5();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(example5.solution(n));
    }
}
