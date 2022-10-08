package racingcar.service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarTest {
    private static final String ERROR_MESSAGE = "[ERROR]";

    @Test
    void 자동차이름_5글자초과할경우_에러() {
        assertThatThrownBy(() -> new Car("abcdefg"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(ERROR_MESSAGE);
    }

    @Test
    void 자동차이름_0글자일경우_에러() {
        assertThatThrownBy(() -> new Car(""))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(ERROR_MESSAGE);
    }

    @Test
    void 자동차이름_유효할경우_객체생성() {
        Car car = new Car("abcd");

        assertThat(car).isNotNull();
    }
}
