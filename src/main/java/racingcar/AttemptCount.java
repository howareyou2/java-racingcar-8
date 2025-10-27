package racingcar;

public class AttemptCount {
    private final int value;

    AttemptCount(String input) {
        validate(input);
        this.value = Integer.parseInt(input);
    }

    private void validate(String input) {
        try {
            int number = Integer.parseInt(input);
            if (number <= 0) {
                throw new IllegalArgumentException("시도 횟수는 양의 정수여야 합니다.");
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도 횟수는 숫자여야 합니다.");
        }
    }

    public int getValue() {
        return value;
    }
}
