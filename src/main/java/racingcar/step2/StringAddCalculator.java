package racingcar.step2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {
    public static int splitAndSum(String text) {

        if (isBlank(text)) {
            return 0;
        }
        String[] tokens = tokenize(text);
        return calculateSum(tokens);
    }

    //빈값 검증
    private static boolean isBlank(String text) {
        return text == null || text.isEmpty();
    }

    //토큰 추출
    private static String[] tokenize(String text) {
        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(text);
        if (matcher.find()) {
            return splitUsingCustomDelimiter(matcher);
        }
        return text.split(",|:");
    }

    //커스텀 구분자 추출
    private static String[] splitUsingCustomDelimiter(Matcher matcher) {
        String customDelimiter = matcher.group(1);
        return matcher.group(2).split(Pattern.quote(customDelimiter));
    }

    //전체 합계
    private static int calculateSum(String[] tokens) {
        int sum = 0;
        for (String token : tokens) {
            int number = toPositiveInt(token);
            sum += number;
        }
        return sum;
    }

    //Int 변경 및 양수 검증
    private static int toPositiveInt(String token) {
        int number = Integer.parseInt(token);
        if (number < 0) {
            throw new RuntimeException("음수 값은 허용되지 않습니다.");
        }
        return number;
    }

}
