
public class Song {

    private String name;
    private String lyrics;

    public Song(String name) {
        setSong(name);
        this.name = name;
        System.out.println("parameterised constructor with name");
    }

    public Song(String name, String lyrics) {
        setSong(name);
        setLyrics(lyrics);
        this.name = name;
        this.lyrics = lyrics;
        System.out.println("parameterised constructor with name and lyrics");
    }

    public void play() {
        System.out.println("A song playing its lyrics " + this.lyrics);
    }

    public void setSong(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("invalid song name");
        }
        this.name = name;
    }

    public void setLyrics(String lyrics) {
        if (lyrics == null || lyrics.equals("")) {
            throw new IllegalArgumentException("invalid song lyrics");
        }
        this.lyrics = lyrics;
    }

    public String getName() {
        return name;
    }

    public String getLyrics() {
        return lyrics;
    }

}

class TestSong {

    public static void main(String[] args) {

        Song s = new Song("Akash", "neene neene");

        s.play();
        s.setLyrics("ninna kanda kshana dida");
        s.play();

        Song s1 = new Song("Appu");
        s1.setLyrics("Ellinda Arambaooo");
        s1.play();

    }

}
