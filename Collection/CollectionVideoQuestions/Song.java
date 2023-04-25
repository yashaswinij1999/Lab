import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class Song implements Comparable {

    private String name;
    private double length;
    private Set artists = new HashSet();
    private int rating;

    public void setName(String name) {

        this.name = name;

    }

    public String getName() {

        return name;

    }

    public void setLength(double length) {

        this.length = length;

    }

    public double getLength() {

        return length;

    }

    public void setArtists(Set artists) {

        this.artists = artists;

    }

    public Set getArtists() {

        return artists;

    }

    public void setRating(int rating) {

        this.rating = rating;

    }

    public int getRating() {

        return rating;

    }

    public Song() {

    }

    public Song(String name, double length, int rating) {

        super();
        this.name = name;
        this.length = length;
        this.rating = rating;
    }

    public Song(String name, double length, int rating, Set artists) {

        super();
        this.name = name;
        this.length = length;
        this.rating = rating;
        this.artists = artists;

    }

    public boolean equals(Object e) {

        if (e instanceof Song) {

            Song s = (Song) e;

            if (this.name.equals(s.name) && this.length == s.length && this.artists.equals(s.artists)
                    && this.rating == s.rating) {

                return true;
            }

        }

        throw new IllegalArgumentException(" Invalid object reference passed ");

    }

    public int hashCode() {

        return (name + length + artists + rating).hashCode();

    }

    public String toString() {

        return name + " " + length + " " + artists + " " + rating;
    }

    public int compareTo(Object e) {

        if (e instanceof Song) {

            Song s = (Song) e;

            if (this.length > s.length)
                return +1;

            else

            if (this.length == s.length)
                return 0;

            else
                return 1;

        }
        throw new IllegalArgumentException();
    }

    public void addArtists(String name) {

        artists.add(name);

    }

}


