package programmers_lv0;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Ex03_StringReverseTest {

    Ex03_StringReverse ex03_stringReverse;

    @BeforeEach
    void setUp() {
        ex03_stringReverse = new Ex03_StringReverse();
    }

    @AfterEach
    void tearDown() {
        ex03_stringReverse = null;
    }

    @Test
    void solution() {
        String my_string = "apple";
        String result = "elppa";
        assertThat(ex03_stringReverse.solution(my_string)).isEqualTo(result);
    }

    @Test
    void solution2() {
        String my_string = "banana";
        String result = "ananab";
        assertThat(ex03_stringReverse.solution2(my_string)).isEqualTo(result);
    }

    @Test
    void solution3() {
        String my_string = "mango";
        String result = "ognam";
        assertThat(ex03_stringReverse.solution3(my_string)).isEqualTo(result);
    }
}