package practice;

import java.util.ArrayList;
import java.util.Scanner;

/*
첫 번째 줄에 정수 K가 주어진다. (1 ≤ K ≤ 100,000)
이후 K개의 줄에 정수가 1개씩 주어진다. 정수는 0에서 1,000,000 사이의 값을 가지며, 정수가 "0" 일 경우에는 가장 최근에 쓴 수를 지우고, 아닐 경우 해당 수를 쓴다.
정수가 "0"일 경우에 지울 수 있는 수가 있음을 보장할 수 있다.
*/
public class Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> valueList = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            int commend = sc.nextInt();
            if (commend == 0 && !valueList.isEmpty()) {
                valueList.remove(valueList.size() - 1); // 리스트가 비어 있지 않을 때만 제거
            } else {
                valueList.add(commend);
            }
        }

        int sum = valueList.stream().mapToInt(integer -> integer).sum();
        System.out.println(sum);
        }
    }
