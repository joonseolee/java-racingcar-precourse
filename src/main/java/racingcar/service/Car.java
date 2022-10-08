package racingcar.service;

public class Car {

    private final String name;

    public Car(String name) {
        if (name == null || name.length() > 5 || name.length() == 0) {
            throw new IllegalArgumentException("[ERROR] 자동차 이름을 다시 확인해주세요.");
        }

        this.name = name;
    }
}
