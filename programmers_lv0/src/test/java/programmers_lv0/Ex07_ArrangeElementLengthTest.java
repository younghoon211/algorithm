package programmers_lv0;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Ex07_ArrangeElementLengthTest {

    Ex07_ArrangeElementLength ex07_arrangeElementLength;

    @BeforeEach
    void setUp() {
        ex07_arrangeElementLength = new Ex07_ArrangeElementLength();
    }

    @AfterEach
    void tearDown() {
        ex07_arrangeElementLength = null;
    }

    @Test
    void solution() {
        String[] strlist = {"abcde", "abc"};
        int[] compare = {5, 3};
        assertThat(ex07_arrangeElementLength.solution(strlist)).isEqualTo(compare);
    }

    @Test
    void solution2() {
        String[] strlist = {"aa", "bbb"};
        int[] compare = {2, 3};
        assertThat(ex07_arrangeElementLength.solution2(strlist)).isEqualTo(compare);
    }
}