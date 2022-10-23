package programmers_lv0;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Ex09_PizzaDivideTest {

    Ex09_PizzaDivide ex09_pizzaDivide;

    @BeforeEach
    void setUp() {
        ex09_pizzaDivide = new Ex09_PizzaDivide();
    }

    @AfterEach
    void tearDown() {
        ex09_pizzaDivide = null;
    }

    @Test
    void solution_1() {
        int n = 8;
        assertThat(ex09_pizzaDivide.solution_1(n)).isEqualTo(2);
    }

    @Test
    void solution_2() {
        int n = 4;
        assertThat(ex09_pizzaDivide.solution_2(n)).isEqualTo(2);
    }

    @Test
    void solution_3() {
        int slice = 7;
        int n = 10;
        assertThat(ex09_pizzaDivide.solution_3(slice, n)).isEqualTo(2);
    }
}