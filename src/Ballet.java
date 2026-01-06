public class Ballet extends MusicalShow {
   private String choreographer;

   public Ballet(String title, int duration, String musicAuthor, String librettoText, String choreographer) {
        super(title, duration, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public String getChoreographer() {
        return choreographer;
    }
}
