package programmers_lv0;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Ex06_ArrangeDoubleTest {

    Ex06_ArrangeDouble ex06_arrangeDouble;

    @BeforeEach
    void setUp() {
        ex06_arrangeDouble = new Ex06_ArrangeDouble();
    }

    @AfterEach
    void tearDown() {
        ex06_arrangeDouble = null;
    }

    @Test
    void solution() {
        int[] numbers = {1, 2, 5};
        int[] result = {2, 4, 10};
        assertThat(ex06_arrangeDouble.solution(numbers)).isEqualTo(result);
    }

    @Test
    void solution2() {
        int[] numbers = {1, 3, 5};
        int[] result = {2, 6, 10};
        assertThat(ex06_arrangeDouble.solution2(numbers)).isEqualTo(result);
    }

    @Test
    void solution3() {
        int[] numbers = {7, 2, 5};
        int[] result = {14, 4, 10};
        assertThat(ex06_arrangeDouble.solution3(numbers)).isEqualTo(result);
    }
}