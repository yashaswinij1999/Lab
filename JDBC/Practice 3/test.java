import java.text.SimpleDateFormat;
import java.util.Date;

public class test {

    public static void main(String[] args) {

        try {

            String dob = "01/02/2002";

            Date dt = new SimpleDateFormat("DD/MM/YYYY").parse(dob);
            System.out.println(dt);

        } catch (Exception e) {
            // TODO: handle exception
        }

    }

}
