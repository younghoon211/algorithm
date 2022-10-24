package programmers_lv0;

public class Ex10_LambSkewers {
    public int solution(int n, int k) {
        // 64인분을 시켜 서비스로 음료수를 6개 받아 총 64 * 12000 + 6 * 2000 - 6 * 2000 =768,000원입니다.
        return n * 12000 + k * 2000 - (n / 10) * 2000;
    }
}
