public class UtilMethods {

    public static boolean Validate(String name) {

        if (name == null || name.equals("")) {
            return false;
        }

        if (Character.isDigit(name.charAt(0))) {
            return false;
        }

        if (name.split(" ").length > 1) {
            return false;
        }

        if (!Character.isLetter(name.charAt(0))) {
            return false;
        }

        for (int i = 1; i < name.length(); i++) {

            char c = name.charAt(i);

            if (!(Character.isLetter(c) || !Character.isDigit(c))) {
                return false;

            }

        }
        return true;

    }

}

class TestUtil {

    public static void main(String[] args) {

        System.out.println(UtilMethods.Validate("1dgh%^^"));

    }

}
