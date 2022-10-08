package racingcar.service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarGroupTest {

    @Test
    void 차이름들을_입력받아_객체생성() {
        String names = "a,b,c";
        CarGroup carGroup = CarGroup.fromNames(names);

        assertThat(carGroup).isNotNull();
        assertThat(carGroup.getCarCount()).isEqualTo(3);
    }

    @Test
    void 차이름들중_동일한이름있을경우_에러() {
        String names = "a,a,c";
        assertThatThrownBy(() -> CarGroup.fromNames(names))
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("[ERROR]");
    }
}
