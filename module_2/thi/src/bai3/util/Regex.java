package bai3.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static final String ID_BILL_REGEX = "^MHD-\\d{4}$";
    public static boolean idValidate(String regex){
        Pattern pattern = Pattern.compile(ID_BILL_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
