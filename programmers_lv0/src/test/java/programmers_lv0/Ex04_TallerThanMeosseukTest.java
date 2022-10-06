package programmers_lv0;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Ex04_TallerThanMeosseukTest {

    Ex04_TallerThanMeosseuk ex04_tallerThanMeosseuk;

    @BeforeEach
    void setUp() {
        ex04_tallerThanMeosseuk = new Ex04_TallerThanMeosseuk();
    }

    @AfterEach
    void tearDown() {
        ex04_tallerThanMeosseuk = null;
    }

    @Test
    void solution() {
        int[] array = {150, 160, 170};
        int height = 155;
        int result = 2;
        assertThat(ex04_tallerThanMeosseuk.solution(array, height)).isEqualTo(result);
    }

    @Test
    void solution2() {
        int[] array = {150, 160, 170, 180};
        int height = 155;
        int result = 3;
        assertThat(ex04_tallerThanMeosseuk.solution2(array, height)).isEqualTo(result);
    }

    @Test
    void solution3() {
        int[] array = {150, 160};
        int height = 155;
        int result = 1;
        assertThat(ex04_tallerThanMeosseuk.solution3(array, height)).isEqualTo(result);
    }

    @Test
    void solution4() {
        int[] array = {150, 160, 170, 180, 190};
        int height = 155;
        int result = 4;
        assertThat(ex04_tallerThanMeosseuk.solution4(array, height)).isEqualTo(result);
    }
}