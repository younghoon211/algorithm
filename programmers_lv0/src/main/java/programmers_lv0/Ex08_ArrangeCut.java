package programmers_lv0;

import java.util.Arrays;

// 배열 자르기
public class Ex08_ArrangeCut {

    // for
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];

        for (int i = 0; i < num2 - num1 + 1; i++) {
            answer[i] = numbers[num1+i];
        }

        return answer;
    }

    // Arrays
    public int[] solution2(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}
