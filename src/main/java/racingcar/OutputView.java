package racingcar;

import java.util.List;
import java.util.stream.Collectors;

public class OutputView {
    static void printExecutionResultInfo() {
        System.out.println("\n실행 결과");
    }

    static void printRoundResult(List<Car> cars) {
        for (Car car : cars) {
            String positionSymbol = "-".repeat(car.getPosition());
            System.out.printf("%s : %s\n", car.getCarName().getName(), positionSymbol);
        }
        System.out.println();
    }

    static void printWinners(List<Car> winners) {
        String winnerNames = winners.stream()
                .map(car -> car.getCarName().getName())
                .collect(Collectors.joining(", "));
        System.out.printf("최종 우승자 : %s\n", winnerNames);
    }
}
