package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final int FORWARD_SIGN = 4;
    private final CarName name;
    private int position = 0;

    Car(CarName name) {
        this.name = name;
    }

    void move() {
        if (canMove()) {
            this.position++;
        }
    }

    private boolean canMove() {
        int randomNumber = Randoms.pickNumberInRange(0, 9);
        return randomNumber >= FORWARD_SIGN;
    }

    CarName getCarName() {
        return name;
    }

    int getPosition() {
        return position;
    }
}
