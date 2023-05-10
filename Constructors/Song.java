public class Song {

    private String name;
    private String lyrics;

    public Song(String name) {
        this.setName(name);
        System.out.println("param name only constr");
    }

    public Song(String name, String lyrics) {
        this.setName(name);
        this.setLyrics(lyrics);
        System.out.println("param constr");
    }

    public void setName(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLyrics(String lyrics) {
        if (lyrics == null || lyrics.equals("")) {
            throw new IllegalArgumentException("Invalid lyrics");
        }
        this.lyrics = lyrics;
    }

    public String getlyrics() {
        return lyrics;
    }

    public void play() {
        System.out.println(" lyrics = " + lyrics);
    }
}

class TestSong {

    public static void main(String[] args) {

        Song s1 = new Song("Akash", "neene neene");
        s1.setName("Akash");
        s1.setLyrics("neene neene");
        System.out.println("Name = " + s1.getName());
        System.out.println("lyrics = " + s1.getlyrics());

        Song s2 = new Song("Appu", "Elinda arambavoo");
        s2.setName("Appu");
        s2.setLyrics("Elinda arambavoo");
        System.out.println("Name = " + s2.getName());
        System.out.println("lyrics = " + s2.getlyrics());
        s2.play();

        Song s3 = new Song("Abhi","nee nanna kannane");
        s3.setName("Appu");
        s3.setLyrics("Elinda arambavoo");
        s3.play();
    }
}