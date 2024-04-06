
public class S6 {

    public static int getNoOfDays(int num, int year) {

        int noOfDaysInMonth = 0;
        String nameOfTheMonth = "";

        switch (num) {
            case 1:
                nameOfTheMonth = "Januvary";
                noOfDaysInMonth = 31;
                break;

            case 2:
                nameOfTheMonth = "Febravary";
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    noOfDaysInMonth = 29;
                } else {
                    noOfDaysInMonth = 28;
                }
                break;
            case 3:
                nameOfTheMonth = "March";
                noOfDaysInMonth = 31;
                break;

            case 4:
                nameOfTheMonth = "April";
                noOfDaysInMonth = 30;
                break;

            case 5:
                nameOfTheMonth = "May";
                noOfDaysInMonth = 31;
                break;

            case 6:
                nameOfTheMonth = "June";
                noOfDaysInMonth = 30;
                break;

            case 7:
                nameOfTheMonth = "July";
                noOfDaysInMonth = 31;
                break;

            case 8:
                nameOfTheMonth = "August";
                noOfDaysInMonth = 31;
                break;

            case 9:
                nameOfTheMonth = "September";
                noOfDaysInMonth = 30;
                break;

            case 10:

                nameOfTheMonth = "October";
                noOfDaysInMonth = 31;
                break;

            case 11:
                nameOfTheMonth = "November";
                noOfDaysInMonth = 30;
                break;

            case 12:
                nameOfTheMonth = "December";
                noOfDaysInMonth = 30;
                break;

            default:
                break;
        }

        return noOfDaysInMonth;

    }

    public static void main(String[] args) {

        System.out.println(S6.getNoOfDays(4, 2024));

    }

}
