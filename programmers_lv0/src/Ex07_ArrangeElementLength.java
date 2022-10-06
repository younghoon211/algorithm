import java.util.Arrays;

// 배열 원소의 길이
public class Ex07_ArrangeElementLength {

    // Stream
    public int[] solution(String[] strlist) {
        return Arrays.stream(strlist).mapToInt(value -> value.length()).toArray();
    }

    public int[] solution2(String[] strlist) {
        return Arrays.stream(strlist).mapToInt(String::length).toArray();
    }

}
