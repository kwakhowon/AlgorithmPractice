package practice;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class TalkToCenter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 최대 힙 (중간값 이하의 수를 저장)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // 최소 힙 (중간값 이상의 수를 저장)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
                maxHeap.offer(num);
            } else {
                minHeap.offer(num);
            }

            // 최대 힙과 최소 힙의 크기 조정
            if (maxHeap.size() > minHeap.size() + 1) {
                minHeap.offer(maxHeap.poll());
            } else if (minHeap.size() > maxHeap.size()) {
                maxHeap.offer(minHeap.poll());
            }

            System.out.println(maxHeap.peek());
        }
    }
}