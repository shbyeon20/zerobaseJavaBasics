package dataStructure.stack;

import java.util.*;

public class Stackex {
    public Stack<Integer> solution(int[] arr) {
        Stack<Integer> answer = new Stack<Integer>();
        for (int i = 0; i < arr.length; i++) {
            try {
                if (answer.peek() == arr[i]) {
                    i++;
                } else {
                    answer.push(arr[i]);
                }
            } catch (Exception exception) {
                answer.push(arr[i]);
            }
        }
        return answer;
    }
}

