import java.util.Arrays;

// 배열 두배 만들기
public class Ex06_ArrangeDouble {

    // for
    public int[] solution(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2;
        }

        return numbers;
    }

    // for-each
    public int[] solution2(int[] numbers) {
        int[] answer = new int[numbers.length];
        int i = 0;

        for (int number : numbers) {
            answer[i++] = number * 2;
        }

        return answer;
    }

    // Stream
    public int[] solution3(int[] numbers) {
        return Arrays.stream(numbers).map(i -> i*2).toArray();
    }
}

