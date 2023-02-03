package programmerslv1;

// 짝수와 홀수
public class Ex01EvenOrOdd {
    public String solution(int num) {
        if (num % 2 == 0 || num == 0) return "Even";
        else return "Odd";
    }

    public String solution2(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }
}
