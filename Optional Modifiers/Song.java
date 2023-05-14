public class Song {

    private String lyrics;
    private String movie;

    public void setLyrics(String lyrics) {
        if (lyrics == null || lyrics.equals("")) {
            throw new IllegalArgumentException("Invalid Lyrics");
        }
        this.lyrics = lyrics;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setMovie(String movie) {
        if (movie == null || movie.equals("")) {
            throw new IllegalArgumentException("Invalid movie");
        }
        this.movie = movie;
    }

    public String getMovie() {
        return movie;
    }

    public void play(String movie, String lyrics) {

        System.out.println("the person is singing the favorite song = " + movie + " with lyrics = " + lyrics);
    }
}
