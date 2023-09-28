package case_study.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private final String ID_EMPLOYEE_REGEX = "^[NV][0-9]{4}$";
    private final String NAME_REGEX = "^(?:[A-Z][a-z]*\\s[A-Z][a-z]*\\s[A-Z][a-z]*)+$";
    public boolean idEmployeeValidate(String regex) {
        Pattern pattern = Pattern.compile(ID_EMPLOYEE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public boolean NameEmployeeValidate(String regex) {
        Pattern pattern = Pattern.compile(NAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
