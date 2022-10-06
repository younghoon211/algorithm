package programmers_lv0;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Ex02_ArrAverageTest {

    Ex02_ArrAverage ex02_arrAverage;

    @BeforeEach
    void setUp() {
        ex02_arrAverage = new Ex02_ArrAverage();
    }

    @AfterEach
    void tearDown() {
        ex02_arrAverage = null;
    }

    @Test
    void solution() {
        int[] numbers = {1, 2, 3, 4};
        double result = 2.5;
        assertThat(ex02_arrAverage.solution(numbers)).isEqualTo(result);
    }
}