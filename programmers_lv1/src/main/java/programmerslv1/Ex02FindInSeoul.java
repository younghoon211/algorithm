package programmerslv1;

import java.util.Arrays;
import java.util.List;

// 서울에서 김서방 찾기
public class Ex02FindInSeoul {
    public String solution(String[] seoul) {
        int x = 0;

        for (String name : seoul) {
            if (name.equals("Kim")) {
                break;
            }

            x++;
        }

        return "김서방은 " + x + "에 있다";
    }

    public String solution2(String[] seoul) {
        int x = 0;

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                x = i;

                break;
            }
        }

        return "김서방은 " + x + "에 있다";
    }

    // 아래의 3, 4번 풀이는 코드 자체는 간결해서 좋아보일 순 있으나 배열->리스트로 변경하면 성능상 불리할 수 있다.
    public String solution3(String[] seoul) {
        int x = List.of(seoul).indexOf("Kim");
        return "김서방은 " + x + "에 있다";
    }

    public String solution4(String[] seoul) {
        int x = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 " + x + "에 있다";
    }

    // test
    public static void main(String[] args) {
        Ex02FindInSeoul ex02FindInSeoul = new Ex02FindInSeoul();
        String[] seoul = {"Kim", "Jack"};
        String s = ex02FindInSeoul.solution(seoul);
        System.out.println(s);
    }
}
