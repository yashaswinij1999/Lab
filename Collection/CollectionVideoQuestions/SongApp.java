import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SongApp {

    public static void main(String[] args) {

        int ch = 0;
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        List songs = new ArrayList();
        String name, artists;
        double length;
        int rating;

        while (ch != 5) {

            System.out.println(" ------------------------------------------------");

            System.out.println(" Press 1 to add the Song");
            System.out.println(" Press 2 to search the Song");
            System.out.println(" Press 3 to remove the Song");
            System.out.println(" Press 4 to list the Song");
            System.out.println(" Press 5 to  exit ");

            System.out.println(" ------------------------------------------------");

            ch = sc1.nextInt();

            System.out.println(" choice entered = " + ch);

            switch (ch) {

                case 1:

                    System.out.println(" Enter the name of the song ");
                    name = sc2.nextLine();

                    System.out.println(" ------------------------------------------------");

                    System.out.println("Enter the length of the song ");
                    length = sc1.nextDouble();

                    System.out.println(" ------------------------------------------------");

                    System.out.println(" Enter the rating of the song ");
                    rating = sc1.nextInt();

                    System.out.println(" ------------------------------------------------");

                    System.out.println(" Enter name of the artist ");
                    String names = sc2.nextLine();

                    System.out.println(" ------------------------------------------------");

                    Song song = new Song(name, length, rating);

                    String[] sa = names.split(",");

                    for (String str : sa) {

                        song.addArtists(str);
                    }

                    songs.add(song);

                    break;

                case 2:

                    System.out.println(" searching ");

                    System.out.println(" ------------------------------------------------");

                    System.out.println(" Enter the part of the song ");
                    String partName = sc1.next();

                    for (Object e : songs) {

                        if (e instanceof Song) {
                            Song s = (Song) e;

                            if (s.getName().contains(partName)) {

                                System.out.println(s);

                            }
                        }
                    }

                    break;

                case 3:
                    System.out.println(" removing ");

                    break;

                case 4:

                    System.out.println("listing ");

                    System.out.println(" ------------------------------------------------");

                    System.out.println(songs);

                    SongRatingComparator src = new SongRatingComparator();

                    Collections.sort(songs);
                    
                    System.out.println(" sorting based on natural ordering ");

                case 5:
                    System.out.println(" tata bye bye ");
                    break;

                default:
                    System.out.println(" press numbers less than 5 only ");
            }

        }

    }

}

class SongRatingComparator {

    public int compare(Object o1, Object o2) {

        if (o1 instanceof Song && o2 instanceof Song) {

            Song s1 = (Song) o1;
            Song s2 = (Song) o2;

            return s1.getRating() - s2.getRating();
        }
        throw new IllegalArgumentException();

    }
}
