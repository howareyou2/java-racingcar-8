package racingcar;

import java.util.List;

public class RacingController {

    public void run() {
        Cars cars = initCars();
        AttemptCount attemptCount = initAttemptCount();

        race(cars, attemptCount);

        OutputView.printWinners(cars.findWinners());
    }

    private Cars initCars() {
        String carNamesInput = InputView.readCarNames();
        List<String> carNames = CarNameParser.parse(carNamesInput);
        return new Cars(carNames);
    }

    private AttemptCount initAttemptCount() {
        String tryCountInput = InputView.readAttemptCount();
        return new AttemptCount(tryCountInput);
    }

    private void race(Cars cars, AttemptCount attemptCount) {
        OutputView.printExecutionResultInfo();
        for (int i = 0; i < attemptCount.getValue(); i++) {
            cars.moveAll();
            OutputView.printRoundResult(cars.getCars());
        }
    }
}