package utils;

import java.util.Arrays;
import java.util.List;

public class StringUtils {
    public static final String DEFAULT_SPLIT_DELIMITER = ",";
    public static final String WHITE_SPACE = " ";
    public static final String BLANK = "";

    public static List<String> splitText(String inputText) {
        if (isEmpty(inputText)) {
            throw new IllegalArgumentException("문자열을 입력해주세요.");
        }
        inputText = inputText.replaceAll(WHITE_SPACE, BLANK);
        return Arrays.asList(inputText.split(DEFAULT_SPLIT_DELIMITER));
    }

    private static boolean isEmpty(String inputText) {
        return inputText == null || inputText.trim().isEmpty();
    }
}