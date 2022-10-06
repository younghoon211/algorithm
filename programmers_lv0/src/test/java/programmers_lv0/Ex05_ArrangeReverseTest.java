package programmers_lv0;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Ex05_ArrangeReverseTest {

    Ex05_ArrangeReverse ex05_arrangeReverse;

    @BeforeEach
    void setUp() {
        ex05_arrangeReverse = new Ex05_ArrangeReverse();
    }

    @AfterEach
    void tearDown() {
        ex05_arrangeReverse = null;
    }

    @Test
    void solution() {
        int[] num_list = {1, 2, 3, 4};
        int[] result = {4, 3, 2, 1};
        assertThat(ex05_arrangeReverse.solution(num_list)).isEqualTo(result);
    }

    @Test
    void solution2() {
        int[] num_list = {1, 2, 3, 4, 5};
        int[] result = {5, 4, 3, 2, 1};
        assertThat(ex05_arrangeReverse.solution2(num_list)).isEqualTo(result);
    }
}