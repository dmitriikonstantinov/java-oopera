public class MusicalShow extends Show {
    private String musicAuthor;
    private String librettoText;

   public MusicalShow(String title, int duration, String musicAuthor, String librettoText) {
        super(title, duration);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public String getMusicAuthor() {
        return musicAuthor;
    }

    public void printLibrettoText() {
        System.out.println(librettoText);
    }
}
