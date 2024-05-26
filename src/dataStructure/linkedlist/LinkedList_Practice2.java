package dataStructure.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.stream.IntStream;

public class LinkedList_Practice2 {

    public static ArrayList getJosephusPermutation(int N, int K) {
        LinkedList<Integer> queue = new LinkedList<>();
        IntStream.range(1,N+1).forEach(queue::add);

        ArrayList<Integer> result = new ArrayList<>();

        int index = 0;
        while (queue.size()!=1) {
            index+=K-1;
            index = index%queue.size();
            result.add(queue.remove(index));
        }
        return result;
    }

    public static void main(String[] args) {
        // Test code
        System.out.println(getJosephusPermutation(5, 2));
        System.out.println(getJosephusPermutation(7, 3));
    }
}


    // Practice2
// 요세푸스 문제
// N과 K가 주어졌을 때 (N, K) 요세푸스 순열을 구하시오.
// N과 K는 N >= K 를 만족하는 양의 정수이다.
// 1부터 N 번까지 N명이 순서대로 원을 이루어 모여 있다.
// 이 모임에서 원을 따라 순서대로 K번째 사람을 제외한다.
// 모든 사람이 제외될 때까지 반복하며 이 때, 제외되는 순서가 요세푸스 순열이다.

// 예시 입력
// 입력: N = 5, K = 2
// 결과: 2, 4, 1, 5, 3

// 입력: N = 7, K = 3
// 결과: 3, 6, 2, 7, 5, 1, 4



