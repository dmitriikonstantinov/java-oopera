public class Opera extends MusicalShow {
    private int choirSize;

    Opera(String title, int duration, String musicAuthor, String librettoText, int choirSize) {
        super(title, duration, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }
}
