package reversingprocess;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Decode {
    public static String decode(String r) {
        Result result = parse(r);
        StringBuilder builder = new StringBuilder();
        if (result.number % 2 == 0 || result.number % 13 == 0) {
            return "Impossible to decode";
        }
        for (char c : result.text.toCharArray()) {
            int codePoint = (int) c - 97;
            for (int i = 0; i < 26; i++) {
                if (i * result.number % 26 == codePoint) {
                    builder.append((char) (i + 97));
                }
            }
        }
        return builder.toString();
    }

    private static Result parse(String r) {
        int number = Integer.parseInt(r.split("[^0-9]")[0]);
        Pattern pattern = Pattern.compile("[a-z]");
        Matcher matcher = pattern.matcher(r);
        StringBuilder builder = new StringBuilder();
        while (matcher.find()) {
            builder.append(matcher.group());
        }

        return new Result(number, builder.toString());
    }

    static class Result {
        private final int number;
        private final String text;

        public Result(int number, String text) {
            this.number = number;
            this.text = text;
        }
    }
}
