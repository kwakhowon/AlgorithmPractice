package practice;

import java.util.Scanner;
/*
문제
단어 S와 정수 i가 주어졌을 때, S의 i번째 글자를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 영어 소문자와 대문자로만 이루어진 단어 S가 주어진다. 단어의 길이는 최대 1,000이다.

둘째 줄에 정수 i가 주어진다. (1 <= i <= |S|)
*/
public class Example27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] letters = str.split("");
        int index = sc.nextInt();
        int absValue = Math.abs(index);
        System.out.println(letters[absValue-1]);

    }
}
