package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.

수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
*/
public class Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[10];
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
            n[i] = n[i] % 42;
            result.add(n[i]);
        }

        // 중복 제거
        List<Integer> distinctList = result.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctList.size()); // 고유한 값의 개수를 출력
    }
}
