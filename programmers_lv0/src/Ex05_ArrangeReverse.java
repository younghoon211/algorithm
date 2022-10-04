import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// 배열 뒤집기
class Ex05_ArrangeReverse {

    // IntStream
    public int[] solution(int[] num_list) {
        int[] reverse = IntStream.rangeClosed(0, num_list.length-1)
                .map(i -> num_list[num_list.length-i-1])
                .toArray();

        return reverse;
    }

    // Stream, Collections
    public int[] solution2(int[] num_list) {
        List<Integer> list = Arrays
                .stream(num_list)
                .boxed()
                .collect(Collectors.toList());

        Collections.reverse(list);

        int[] answer = list
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return answer;
    }
}
