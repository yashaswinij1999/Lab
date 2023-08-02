public class Question6 {

    public static void main(String[] args) {

        noOfDaysInMonth(6, 2023);

    }

    public static void noOfDaysInMonth(int month, int year) {

        int noOfDaysInMonth = 0;
        String MonthName = "";

        while (month != 12) {

            switch (month) {

                case 2:
                    MonthName = "febraury";
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        noOfDaysInMonth = 29;
                    } else {
                        noOfDaysInMonth = 28;
                    }
                    break;

                case 3:
                    MonthName = "March";
                    noOfDaysInMonth = 31;
                    break;

                case 4:
                    MonthName = "April";
                    noOfDaysInMonth = 30;
                    break;

                case 5:
                    MonthName = "May";
                    noOfDaysInMonth = 31;
                    break;

                case 6:
                    MonthName = "June";
                    noOfDaysInMonth = 30;
                    break;

                case 7:
                    MonthName = "July";
                    noOfDaysInMonth = 31;
                    break;

                case 8:
                    MonthName = "August";
                    noOfDaysInMonth = 31;
                    break;

                case 9:
                    MonthName = "September";
                    noOfDaysInMonth = 30;
                    break;

                case 10:
                    MonthName = "October";
                    noOfDaysInMonth = 31;
                    break;

                case 11:
                    MonthName = "November";
                    noOfDaysInMonth = 30;
                    break;

                case 12:
                    MonthName = "December";
                    noOfDaysInMonth = 31;

            }
            System.out
                    .println(" the month  " + MonthName + " has " + noOfDaysInMonth + " no of days in a year " + year);
        }

    }

}
