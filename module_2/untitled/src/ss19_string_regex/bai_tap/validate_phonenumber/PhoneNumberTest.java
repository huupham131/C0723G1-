package ss19_string_regex.bai_tap.validate_phonenumber;


public class PhoneNumberTest {
    private static PhoneNumber phoneNumbers;
    public static String[] phoneNumberArray = new String[]{"(84)-(0978489648)", "(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};

    public static void main(String[] args) {
        phoneNumbers = new PhoneNumber();
        for (String phoneNumber : phoneNumberArray) {
            boolean isValid = phoneNumbers.validate(phoneNumber);
            System.out.println("Phone number is " + phoneNumber + " is valid: " + isValid);
        }
    }
}
