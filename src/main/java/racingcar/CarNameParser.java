package racingcar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CarNameParser {
    private static final String DELIMITER = ",";

    static List<String> parse(String input) {
        List<String> names = Arrays.stream(input.split(DELIMITER))
                .map(String::strip)
                .collect(Collectors.toList());
        validate(names);
        return names;
    }

    private static void validate(List<String> names) {
        Set<String> uniqueNames = new HashSet<>(names);
        if (uniqueNames.size()!= names.size()) {
            throw new IllegalArgumentException("중복된 자동차 이름를 등록할 수 없습니다.");
        }
    }
}
