// 머쓱이보다 키 큰 사람
import java.util.ArrayList;
import java.util.Arrays;

class Ex04_TallerThanMeosseuk {

    // ArrayList 이용
    public int solution(int[] array, int height) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > height) {
                arr.add(i);
            }
        }
        return arr.size();
    }

    // for문 (가장 일반적 풀이법)
    public int solution2(int[] array, int height) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > height) {
                answer++;
            }
        }
        return answer;
    }

    // for-each
    public int solution3(int[] array, int height) {
        int answer = 0;
        for (int i : array) {
            if (i > height) answer++;
        }
        return answer;
    }

    // Stream, 람다식
    public int solution4(int[] array, int height) {
        // Arrays.stream(array) : 배열을 순회하는 stream객체 생성
        return (int) Arrays.stream(array).filter(value -> value > height).count();
    }

    public static void main(String[] args) {
        int[] array = {180,120,140};
        int height = 100;
        System.out.println((int) Arrays.stream(array).filter(value -> value > height).count());
    }

}


