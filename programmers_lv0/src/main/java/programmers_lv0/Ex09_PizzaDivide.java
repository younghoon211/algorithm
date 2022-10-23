package programmers_lv0;

public class Ex09_PizzaDivide {

    // 피자 나눠 먹기_1
    // n명이 피자를 1조각 이상 먹을 수 있는 판의 개수(1판:7조각)
    public int solution_1(int n) {
        return (n + 6) / 7;
    }

    // 피자 나눠 먹기_2
    // n명이 피자를 같은 조각으로 나눌 수 있는 판의 개수(1판:6조각)
    public int solution_2(int n) {
        int result = 1;

        while (true) {
            if (result * 6 % n == 0)
                break;
            result++;
        }

        return result;
    }

    // 피자 나눠 먹기_3
    // 머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다. 피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때, n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
    public int solution_3(int slice, int n) {
        int result = 1;

        while (true) {
            if (slice * result >= n) break;
            result++;
        }

        return result;
    }
}
