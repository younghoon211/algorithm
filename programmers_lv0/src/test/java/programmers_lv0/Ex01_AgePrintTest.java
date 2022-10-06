package programmers_lv0;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Ex01_AgePrintTest {

    Ex01_AgePrint ex01_agePrint;

    @BeforeEach
    void setUp() {
        ex01_agePrint = new Ex01_AgePrint();
    }

    @AfterEach
    void tearDown() {
        ex01_agePrint = null;
    }

    @Test
    void solution() {
        int age = 10;
        int result = 2013;
        assertThat(ex01_agePrint.solution(age)).isEqualTo(result);
    }
}