package practice;

import java.util.LinkedList;
import java.util.Scanner;

/*
정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 여섯 가지이다.

push X: 정수 X를 큐에 넣는 연산이다.
pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 큐에 들어있는 정수의 개수를 출력한다.
empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
*/
public class QueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> queue = new LinkedList<>();
        int n = sc.nextInt(); // 명령어의 수 입력

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String command = sc.next(); // 명령어 입력

            switch (command) {
                case "push":
                    int x = sc.nextInt();
                    queue.offer(x); // 큐에 값을 넣는다.
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(queue.poll()).append("\n"); // 큐의 첫 번째 값을 빼고 출력
                    }
                    break;
                case "size":
                    sb.append(queue.size()).append("\n"); // 큐의 크기를 출력
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? "1\n" : "0\n"); // 큐가 비었는지 확인
                    break;
                case "front":
                    if (queue.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(queue.peek()).append("\n"); // 큐의 첫 번째 값을 출력
                    }
                    break;
                case "back":
                    if (queue.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(queue.getLast()).append("\n"); // 큐의 마지막 값을 출력
                    }
                    break;
                default:
                    break;
            }
        }

        // 결과 출력
        System.out.print(sb);

    }
}
