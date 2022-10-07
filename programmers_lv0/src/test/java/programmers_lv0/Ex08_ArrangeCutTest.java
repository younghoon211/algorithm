package programmers_lv0;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Ex08_ArrangeCutTest {

    Ex08_ArrangeCut ex08_arrangeCut;

    @BeforeEach
    void setUp() {
        ex08_arrangeCut = new Ex08_ArrangeCut();
    }

    @AfterEach
    void tearDown() {
        ex08_arrangeCut = null;
    }

    @Test
    void solution() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int num1 = 1;
        int num2 = 3;
        int[] result = {2, 3, 4};
        assertThat(ex08_arrangeCut.solution(numbers, num1, num2)).isEqualTo(result);
    }

    @Test
    void solution2() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int num1 = 1;
        int num2 = 3;
        int[] result = {2, 3, 4};
        assertThat(ex08_arrangeCut.solution2(numbers, num1, num2)).isEqualTo(result);
    }
}