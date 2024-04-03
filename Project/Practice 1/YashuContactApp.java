import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class YashuContactApp {

    Scanner sc1;
    Scanner sc2;
    final String directory;
    File[] fileArray;
    File f;
    BufferedReader br;

    {

        sc1 = new Scanner(System.in);
        sc2 = new Scanner(System.in);
        directory = System.getProperty("user.dir");

    }

    public void menu(int num) {
        System.out.println("----------------------------------------------");
        System.out.println("          " + "menu" + num + "                    ");
        System.out.println("----------------------------------------------");
    }

    public void printEmptyLines(int num) {

        for (int i = 1; i < num; i++) {
            System.out.println("");
        }
    }

    public void startContactApp() {

        int menuOneOption = 0;

        try {

            menuOneOption = MenuOneApp();
            processMenuOneOption(menuOneOption);

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }

    }

    public int MenuOneApp() {

        int choice = 0;

        try {

            menu(1);
            System.out.println("Press 1 to Create Contacts Book");
            System.out.println("Press 2 to Load Contacts Book");
            System.out.println("Press 3 to Search contacts");
            System.out.println("Press 4 to List contacts");
            System.out.println("Press 5 for Birthday reminders");
            System.out.println("Press 6 to Exit");
            printEmptyLines(1);

            System.out.println("Enter your choice");
            choice = sc1.nextInt();

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }
        return choice;
    }

    public int MenuTwoOption() {

        int choice = 0;

        try {

            menu(2);
            System.out.println("Press 1 to Add a Contact");
            System.out.println("Press 2 to Edit a Contact");
            System.out.println("Press 3 to Remove a Contact");
            System.out.println("Press 4 to List the Contact");
            System.out.println("Press 5 to Search Contact");
            System.out.println("Press 6 to Go back");
            printEmptyLines(1);

            System.out.println("Please enter your choice");
            choice = sc1.nextInt();

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }
        return choice;

    }

    public int startToCreateContactBook() {

        int option = 0;

        try {

            option = MenuTwoOption();
            processMenuTwoOption(option);

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }
        return option;
    }

    public void processMenuOneOption(int option) {

        try {

            switch (option) {

                case 1: {

                    CreateContactApp();
                    break;
                }

                case 2: {
                    LoadContactsBook();
                    break;
                }

                case 3: {
                    searchContactBook();
                    break;
                }
                case 4: {
                    ListContactsBook();
                    break;
                }
                case 5: {
                    setBirthDayRemainders();
                    break;
                }
                case 6: {
                    System.out.println("bye bye");
                }
                default: {
                    System.out.println("enter valid option");
                }

            }

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }

    }

    public void processMenuTwoOption(int option) {

        try {

            switch (option) {
                case 1:
                    addContacts();
                    break;

                case 2:
                    editContact();
                    break;

                case 3:
                    removeContact();
                    break;

                case 4:
                    listTheContacts();
                    break;
                case 5:
                    searchContactName();
                    break;
            }

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }

    }

    public void CreateContactApp() {

        String contactName = "";
        String temp = "";
        File f1 = null;
        boolean isContactBookExists = false;
        f = new File(directory);

        try {

            System.out.println("Please enter the Contact Book name");
            contactName = sc1.next() + ".txt";
            f1 = new File(contactName);

            File[] files = f.listFiles();

            for (File fl : files) {

                if (fl.getName().contains(".txt")) {

                    if (fl.getName().equals(contactName)) {
                        isContactBookExists = true;
                    }
                }

            }

            if (isContactBookExists == true) {
                System.out.println("the contact book already exists , please enter the another contact name");
                temp = sc1.next();

                if (temp.equals("back")) {

                    startContactApp();

                } else {

                    if (temp.contains(".txt")) {
                        checkIfNameExits(temp);

                    } else {
                        temp = temp + ".txt";
                        checkIfNameExits(temp);
                    }

                }
                printEmptyLines(1);
            }

            if (isContactBookExists == false) {

                f1.createNewFile();
                startToCreateContactBook();
            }

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }

    }

    public void checkIfNameExits(String nameOfContact) {

        String temp = "";
        boolean isContactBookExists = false;
        f = new File(directory);
        File f1 = null;

        try {

            f1 = new File(nameOfContact);
            File[] files = f.listFiles();

            for (File fl : files) {

                if (fl.getName().contains(".txt")) {

                    if (fl.getName().equals(nameOfContact)) {
                        isContactBookExists = true;
                    }
                }

            }
            if (isContactBookExists == true) {

                System.out.println("name of the contact already exists , please give another name");
                temp = sc1.next();

                if (temp.equals("back")) {
                    startContactApp();
                    printEmptyLines(1);
                } else {

                    if (temp.contains(".txt")) {
                        checkIfNameExits(temp);

                    } else {
                        temp = temp + ".txt";
                        checkIfNameExits(temp);
                    }
                }

            } else {

                f1.createNewFile();
                startToCreateContactBook();
                printEmptyLines(1);

            }

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }

    }

    public void LoadContactsBook() {

        boolean isValidContactNumber = false;
        String contactBookName = "";
        int contactBookNumber = 0;
        int count1 = 1;
        int count2 = 1;
        f = new File(directory);

        File[] files = f.listFiles();

        try {

            if (checkIfAnyContactBookExists()) {

                for (File f1 : files) {

                    if (f1.getName().contains(".txt")) {
                        System.out.println((count1++) + "." + f1.getName());
                    }

                }
                System.out.println("Enter contact Book Number");
                contactBookNumber = sc1.nextInt();

                if (contactBookNumber == 0) {
                    startContactApp();
                    printEmptyLines(1);
                } else {

                    for (File f1 : files) {

                        if (f1.getName().contains(".txt")) {
                            contactBookName = count2 + "." + f1.getName();

                            if (count2 == contactBookNumber) {
                                isValidContactNumber = true;
                            }
                            count2++;
                        }

                    }
                    if (isValidContactNumber == true) {
                        startToCreateContactBook();
                        printEmptyLines(1);
                    }
                    if (isValidContactNumber == false) {
                        checkIfValidContactBookNumberEntered();
                    }
                }

            } else {

                System.out.println("the entered number is not present , please enter file existed number ");
                startContactApp();
                printEmptyLines(1);

            }

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }
    }

    public boolean checkIfAnyContactBookExists() {

        boolean doesBookExists = true;
        int count = 0;
        f = new File(directory);

        try {

            File[] files = f.listFiles();
            for (File f1 : files) {

                if (f1.getName().contains(".txt")) {
                    count++;
                }
            }
            if (count == 0) {
                doesBookExists = false;
            }

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }
        return doesBookExists;

    }

    public void checkIfValidContactBookNumberEntered() {

        int contactBookNumber = 0;
        String contactBookName = "";
        int count = 1;
        boolean isValidContactNumber = false;

        f = new File(directory);

        File[] files = f.listFiles();

        try {

            System.out.println("the  Entered contact Number is invalid try another");
            contactBookNumber = sc1.nextInt();

            if (contactBookNumber == 0) {
                startContactApp();
                printEmptyLines(1);
            } else {

                for (File f1 : files) {

                    if (f1.getName().contains(".txt")) {
                        contactBookName = count + "." + f1.getName();

                        if (count == contactBookNumber) {
                            isValidContactNumber = true;
                        }
                        count++;
                    }
                    if (isValidContactNumber == true) {

                        startToCreateContactBook();
                        printEmptyLines(1);

                    } else {

                        checkIfValidContactBookNumberEntered();

                    }

                }

            }

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }
    }

    public void searchContactBook() {

        System.out.println("enter the file name you want to search");
        String fileName = sc1.next();

        f = new File(directory);
        File[] fileArray = f.listFiles();

        for (File f1 : fileArray) {

            try {

                if (f1.getName().endsWith("txt")) {

                    if (f1.getName().equals(fileName)) {

                        startToCreateContactBook();
                        printEmptyLines(1);

                    }

                } else {

                    System.out.println("the entered file is not present, try again");
                    searchContactBook();
                    printEmptyLines(1);

                }

            } catch (Exception e) {

                // TODO: handle exception
                e.printStackTrace();

            }

        }

    }

    public void ListContactsBook() {

        f = new File(directory);

        File[] fileArray = f.listFiles();

        for (File f1 : fileArray) {

            if (f1.getName().endsWith(".txt")) {
                System.out.println(f1.getName());
            }
        }

    }

    public void setBirthDayRemainders() {

        System.out.println("enter birthday date");
        int birDate = sc1.nextInt();

        System.out.println("Enter birthday month in capitals");
        String birMonth = sc1.next();
        System.out.println(birMonth);

        Month birthdayMonth = Month.JULY;
        LocalDate currenDate = LocalDate.now();

        int date = currenDate.getDayOfMonth();
        Month month = currenDate.getMonth();

        if (date == birDate && month == birthdayMonth) {
            System.out.println("Happy BirthDay");
        } else {
            System.out.println("its not your birthday");
        }

    }

    public void addContacts() {

        String contactBookName;
        String name;
        String dob;
        String address;
        String petName;
        String email1;
        String email2;
        String createdDate;
        BufferedWriter bw = null;

        try {
            System.out.println("Enter name of the file where you add");
            contactBookName = sc1.next();

            System.out.println("Enter name");
            name = sc1.next();

            System.out.println("Enter dob in YYYY-MM-DD");
            dob = sc1.next();
            LocalDate dt = LocalDate.parse(dob);

            System.out.println("enter address");
            address = sc1.next();

            System.out.println("Enter petname");
            petName = sc1.next();

            System.out.println("enter email");
            email1 = sc1.next();

            System.out.println("enter email2");
            email2 = sc1.next();

            System.out.println("enter created date");
            createdDate = sc1.next();
            LocalDate crdt = LocalDate.parse(createdDate);

            String temp = name + ":" + dt + ":" + address + ":" + petName + ":" + email1 + ":" + email2 + ":"
                    + createdDate;

            fileArray = f.listFiles();

            for (File f1 : fileArray) {

                bw = new BufferedWriter(new FileWriter(f1, true));

                if (f1.getName().equals(contactBookName)) {
                    System.out.println(temp);
                    bw.write(temp);
                    bw.newLine();
                    bw.flush();
                }

            }

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        } finally {

            try {

                if (br != null) {
                    br.close();
                }
            } catch (Exception e) {

                // TODO: handle exception
                e.printStackTrace();

            }
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }

    }

    public void editContact() {

        String contactName;
        String editWord;
        String replaceWord;
        BufferedReader br = null;
        String line = "";
        BufferedWriter bw = null;
        List<String> l = new ArrayList<>();

        System.out.println("Enter file name where you want to edit");
        contactName = sc1.next();

        System.out.println("the word which you want to edit");
        editWord = sc1.next();

        System.out.println("enter replace word");
        replaceWord = sc1.next();

        fileArray = f.listFiles();

        for (File f1 : fileArray) {

            try {
                br = new BufferedReader(new FileReader(f1));

                if (f1.getName().equals(contactName)) {

                    while ((line = br.readLine()) != null) {

                        if (line.contains(editWord)) {
                            line = line.replace(editWord, replaceWord);
                            System.out.println(line);
                            l.add(line);
                        } else {
                            l.add(line);
                        }

                    }

                }
                br.close();
                System.out.println(l);

                bw = new BufferedWriter(new FileWriter(f1));

                if (f1.getName().equals(contactName)) {

                    for (String s : l) {
                        bw.write(s);
                        bw.newLine();
                    }

                }

            } catch (Exception e) {

                // TODO: handle exception
                e.printStackTrace();

            } finally {

                try {

                    if (br != null) {
                        br.close();
                    }

                } catch (Exception e) {

                    // TODO: handle exception
                    e.printStackTrace();

                }

                try {
                    if (bw != null) {
                        bw.close();
                    }

                } catch (Exception e) {

                    // TODO: handle exception
                    e.printStackTrace();

                }
            }
        }
    }

    public void removeContact() {

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter the file name in which you want to remove the contact");
        String contactBookName = sc1.next();

        System.out.println("enter the contact which you want to remove");
        String contact = sc1.next();

        String line = "";
        BufferedReader br = null;
        BufferedWriter bw = null;
        List<String> l;

        File f = new File(directory);
        File[] filearray = f.listFiles();

        for (File f1 : filearray) {

            try {

                br = new BufferedReader(new FileReader(f1));

                l = new ArrayList<>();

                if (f1.getName().endsWith(".txt")) {

                    while ((line = br.readLine()) != null) {

                        if (!line.contains(contact)) {
                            l.add(line);
                        }

                    }

                }
                br.close();

                bw = new BufferedWriter(new FileWriter(f1));
                for (String s : l) {
                    bw.write(s);
                    bw.newLine();
                }

            } catch (Exception e) {

                // TODO: handle exception
                e.printStackTrace();

            } finally {

                try {

                    if (br != null) {
                        br.close();
                    }

                } catch (Exception e) {

                    // TODO: handle exception
                    e.printStackTrace();

                }
                try {

                    if (bw != null) {
                        bw.close();
                    }

                } catch (Exception e) {

                    // TODO: handle exception
                    e.printStackTrace();

                }
            }
        }

    }

    public void listTheContacts() {

        int choice = 0;

        while (choice != 3) {

            System.out.println("Press 1 : to sort based on name");
            System.out.println("Press 2 : sort based on length ");
            System.out.println("Enter 3 to exit");
            printEmptyLines(1);

            System.out.println("Enter choice");
            choice = sc1.nextInt();

            switch (choice) {

                case 1:
                    sortBasedOnName();
                    break;

                case 2:
                    sortBasedOnLength();
                    break;

                default:
                    System.out.println("enter right input");

                case 3:
                    System.out.println("bye bye");

            }

        }

    }

    public void sortBasedOnName() {

        System.out.println("Enter the file name in whih you want to sort");
        String fileName = sc1.next();

        f = new File(directory);
        File[] fileArray = f.listFiles();
        BufferedReader br = null;
        BufferedWriter bw = null;
        String line;
        List<String> l;
        StringNameComparator sc = null;

        for (File f1 : fileArray) {

            try {

                br = new BufferedReader(new FileReader(f1));
                sc = new StringNameComparator();
                l = new ArrayList<>();

                if (f1.getName().equals(fileName)) {

                    while ((line = br.readLine()) != null) {

                        l.add(line);
                        Collections.sort(l, sc);

                    }

                }
                br.close();

                bw = new BufferedWriter(new FileWriter(f1));

                for (String s : l) {
                    bw.write(s);
                    bw.newLine();
                }

            } catch (Exception e) {

                // TODO: handle exception
                e.printStackTrace();

            } finally {

                try {

                    if (br != null) {
                        br.close();
                    }

                } catch (Exception e) {

                    // TODO: handle exception
                    e.printStackTrace();

                }
                try {

                    if (bw != null) {
                        bw.close();
                    }

                } catch (Exception e) {

                    // TODO: handle exception
                    e.printStackTrace();

                }

            }

        }

    }

    public void sortBasedOnLength() {

        System.out.println("Enter the file name in whih you want to sort");
        String fileName = sc1.next();

        f = new File(directory);
        File[] fileArray = f.listFiles();
        BufferedReader br = null;
        BufferedWriter bw = null;
        String line;
        List<String> l;
        StringLengthComparator sl = null;

        for (File f1 : fileArray) {

            try {

                br = new BufferedReader(new FileReader(f1));
                sl = new StringLengthComparator();
                l = new ArrayList<>();

                if (f1.getName().equals(fileName)) {

                    while ((line = br.readLine()) != null) {

                        l.add(line);
                        Collections.sort(l, sl);

                    }

                }
                br.close();

                bw = new BufferedWriter(new FileWriter(f1));

                for (String s : l) {

                    bw.write(s);
                    bw.newLine();
                }

            } catch (Exception e) {

                // TODO: handle exception
                e.printStackTrace();

            } finally {

                try {

                    if (br != null) {
                        br.close();
                    }

                } catch (Exception e) {

                    // TODO: handle exception
                    e.printStackTrace();

                }
                try {

                    if (bw != null) {
                        bw.close();
                    }

                } catch (Exception e) {

                    // TODO: handle exception
                    e.printStackTrace();

                }

            }

        }

    }

    public void searchContactName() {

        System.out.println("enter the file name in which you want to search");
        String fileName = sc1.next();

        System.out.println("enter the contact Name which yoy want to search");
        String contactName = sc1.next();

        f = new File(directory);
        File[] fileArray = f.listFiles();
        String line;
        BufferedReader br = null;
        int count = 0;

        for (File f1 : fileArray) {

            try {

                if (f1.getName().endsWith("txt")) {

                    if (f1.getName().equals(fileName)) {

                        br = new BufferedReader(new FileReader(f1));

                        while ((line = br.readLine()) != null) {

                            if (line.contains(contactName)) {
                                count++;
                            }

                        }

                    }
                }

            } catch (Exception e) {

                // TODO: handle exception
                e.printStackTrace();

            }

        }
        System.out.println(
                "the contactName " + contactName + " ocurrs in  file name " + fileName + " " + count + " times ");

    }

}

class Test1 {

    public static void main(String[] args) {

        YashuContactApp y = new YashuContactApp();
        y.startContactApp();

    }
}
