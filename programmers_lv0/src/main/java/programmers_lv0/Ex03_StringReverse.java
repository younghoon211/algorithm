package programmers_lv0;

// StringBuffer / StringBuilder : 가변 , String : 불변
// StringBuffer 클래스 : String을 다루는 클래스
// 생성자의 파라미터로 문자열을 입력 받을 수 있음
// append, insert, reverse, replace 등의 다양한 함수가 있음
// StringBuffer 타입으로 객체 리턴하기 때문에 끝에 .toString() 붙여 String 형태로 변환해야 함 (String값이 불변의 속성을 가지기 때문)
//  charAt : String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환

// 문자열 뒤집기
class Ex03_StringReverse {

    // StringBuffer
    public String solution(String my_string) {
        StringBuffer stringBuffer = new StringBuffer(my_string);
        String answer = stringBuffer.reverse().toString();

        return answer;
    }

    //StringBuilder
    public String solution2(String my_string) {
        return new StringBuilder(my_string).reverse().toString();
    }

    // 반복문, charAt
    public String solution3(String my_string) {
        String answer = "";

        for (int i = my_string.length() - 1; i >= 0; i--) {
            answer += my_string.charAt(i);
        }

        return answer;
    }


}
