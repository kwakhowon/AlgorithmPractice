package practice;
/*
test
현수는 영희에게 알파벳 대문자로 구성된 비밀편지를 매일 컴퓨터를 이용해 보냅니다.
비밀편지는 현수와 영희가 서로 약속한 암호로 구성되어 있습니다.
비밀편지는 알파벳 한 문자마다 # *
또는 이 일곱 개로 구성되어 있습니다
.
만약 현수가 “#*****#”
으로 구성된 문자를 보냈다면 영희는 현수와 약속한 규칙대로 다음과
같이 해석합니다.
1.
“#*****#”
를 일곱자리의 이진수로 바꿉니다 은 이진수의 로 이진수의 으로 변환합
. # 1 ,
* 0
니다 결과는 로 변환됩니다
.
“1000001”
.
2. 2 10 .
“1000001” 10 65 .
바뀐 진수를 진수화 합니다 을 진수화 하면 가 됩니다
3. 65 . 65 'A'
아스키 번호가 문자로 변환합니다 즉 아스크번호 는 대문자 입니다
.
참고로 대문자들의 아스키 번호는 는 번 는 번 는 번 등 차례대로 씩 증가
'A' 65 ,
‘B' 66 ,
’C' 67 1
‘Z' 90 .
하여 는 번입니다
4
현수가 개의 문자를 다음과 같이 신호로 보냈다면
#****###**#####**#####**##**
이 신호를 개의 문자신호로 구분하면
4
#****## --> 'C'
#**#### --> 'O'
#**#### --> 'O'
#**##** --> 'L'
“COOL"
최종적으로 로 해석됩니다
.
현수가 보낸 신호를 해석해주는 프로그램을 작성해서 영희를 도와주세요.
▣ 입력설명
첫 줄에는 보낸 문자의 개수 (10 ) .
을 넘지 안습니다 가 입력된다 다음 줄에는 문자의 개수의 일
곱 배 만큼의 # *
또는 신호가 입력됩니다 현수는 항상 대문자로 해석할 수 있는 신호를 보낸
.
다고 가정합니다.
▣ 출력설명
영희가 해석한 문자열을 출력합니다.
▣ 입력예제 1
4
#****###**#####**#####**##**
▣ 출력예제 1
COOL
*/

import java.util.Scanner;
class ExamplePassword {
    public String solution(int n, String s){
        String answer="";
        for (int i = 0; i < n; i++) {
            String temp = s.substring(0,7).replace('#', '1').replace('*','0');
            int num = Integer.parseInt(temp, 2);
            answer += (char)num;
            s = s.substring(7);

        }
        return answer;
    }

    public static void main(String[] args){
        ExamplePassword T = new ExamplePassword();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        String str=kb.next();
        System.out.println(T.solution(n, str));
    }
}