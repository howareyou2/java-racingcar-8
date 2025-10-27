package racingcar;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> cars;

    Cars(List<String> carNames) {
        this.cars = carNames.stream()
                .map(CarName::new)
                .map(Car::new)
                .collect(Collectors.toList());
    }

    void moveAll() {
        for (Car car : cars) {
            car.move();
        }
    }

    List<Car> findWinners() {
        int maxPosition = findMaxPosition();
        return cars.stream()
                .filter(car -> car.getPosition() == maxPosition)
                .collect(Collectors.toList());
    }

    int findMaxPosition() {
        return cars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElse(0);
    }

    List<Car> getCars() {
        return Collections.unmodifiableList(cars);
    }
}
