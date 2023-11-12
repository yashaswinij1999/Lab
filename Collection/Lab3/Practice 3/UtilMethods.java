import java.text.SimpleDateFormat;
import java.util.Date;

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

    public static boolean validateDate(String Date) {

        Date dt = null;

        Date currDate = new Date();

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        format.setLenient(false);

        try {

            dt = format.parse(Date);
            return true;

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();
            return false;

        }

    }

    public static boolean checkIfDateIsINFuture(Date dt) {

        Date date = new Date();

        if (dt.before(date) || dt.equals(date)) {
            return true;
        }
        return false;

    }

}

class TestUtil {

    public static void main(String[] args) {

        System.out.println(UtilMethods.Validate("1dgh%^^"));

        String s = "159-15-96";
        Date dt = UtilMethods.validateDate(s);
        System.out.println(dt);

    }

}
