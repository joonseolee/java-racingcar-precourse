package racingcar.service;

import java.util.*;

public class CarGroup {
    private static final int INITIAL_WINNER = 0;

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

    public void raceByTimes(int loopCount) {
        for (int time = 0 ; time < loopCount ; time++) {
            raceOneCycle();
            System.out.println("");
        }
    }

    private void raceOneCycle() {
        for (Car car : this.cars) {
            car.move();
        }
    }

    public String getWinners() {
        List<Car> winners = new ArrayList<>();
        winners.add(this.cars.get(INITIAL_WINNER));
        for (int index = 1 ; index < this.cars.size() ; index++) {
            winners = recreateOrAddWinner(winners, this.cars.get(index));
        }

        return toWinnersFromWinnerCars(winners);
    }

    private List<Car> recreateOrAddWinner(List<Car> winners, Car car) {
        if (winners.get(INITIAL_WINNER).getDistanceSize() < car.getDistanceSize()) {
            return Arrays.asList(car);
        }

        if (winners.get(INITIAL_WINNER).getDistanceSize() == car.getDistanceSize()) {
            winners.add(car);
        }

        return winners;
    }

    private String toWinnersFromWinnerCars(List<Car> winners) {
        StringJoiner winnerNames = new StringJoiner(",");
        for (Car winner : winners) {
            winnerNames.add(winner.getName());
        }

        return winnerNames.toString();
    }
}
