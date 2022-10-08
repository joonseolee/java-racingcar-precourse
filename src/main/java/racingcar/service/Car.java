package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private static final String INITIAL_DISTANCE = "";

    private final String name;
    private String distance;

    public Car(String name) {
        if (name == null || name.length() > 5 || name.length() == 0) {
            throw new IllegalArgumentException("[ERROR] 자동차 이름을 다시 확인해주세요.");
        }

        this.name = name;
        this.distance = INITIAL_DISTANCE;
    }

    public String move() {
        int randomValue = Randoms.pickNumberInRange(0, 9);
        if (randomValue >= 4) {
            this.distance += "-";
        }

        return this.distance;
    }
}
