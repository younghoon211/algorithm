package programmers_lv0;

// 나이 출력
class Ex01_AgePrint {
    public int solution(int age) {
        int answer = 0;
        if (age > 0 && age <= 120) {
            answer = 2022 - age + 1;
        }

        return answer;
    }
}
