package racingcar.service;

import java.util.*;

public class CarGroup {
    private final List<Car> cars;

    private CarGroup(List<Car> cars) {
        this.cars = cars;
    }

    public static CarGroup fromNames(String rawNames) {
        String[] names = rawNames.split(",");
        checkUniqueName(names);

        List<Car> cars = new ArrayList<>();
        for (String name : names) {
            cars.add(new Car(name));
        }

        return new CarGroup(cars);
    }

    private static void checkUniqueName(String[] names) {
        Set<String> distinctNames = new HashSet<>(Arrays.asList(names));

        if (distinctNames.size() != names.length) {
            throw new IllegalStateException("[ERROR] 증복된 이름이 기입되었습니다.");
        }
    }

    public int getCarCount() {
        return getCars().size();
    }

    public List<Car> getCars() {
        return cars;
    }
}
