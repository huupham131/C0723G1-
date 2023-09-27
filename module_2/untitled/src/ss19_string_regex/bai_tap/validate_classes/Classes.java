package ss19_string_regex.bai_tap.validate_classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Classes {
    private final String CLASSES_REGEX = "^[CAP][0-9]{4}[GHIK]$";

    public Classes() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASSES_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
