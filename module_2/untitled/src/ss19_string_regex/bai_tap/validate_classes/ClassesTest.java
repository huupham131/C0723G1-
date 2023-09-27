package ss19_string_regex.bai_tap.validate_classes;

public class ClassesTest {
    private static Classes classes;
    public static String[] classesArray = new String[]{"C0223G", "A0323K", "M0318G", "P0323A"};

    public static void main(String[] args) {
        classes = new Classes();
        for (String classes1 : classesArray) {
            boolean isValid = classes.validate(classes1);
            System.out.println("Classes is " + classes1 + " is valid: " + isValid);
        }
    }
}
