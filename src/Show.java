import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Show {
    private String title;
    private int duration;
    private List<Actor> listOfActors;

  public Show(String title, int duration) {
        this.title = title;
        this.duration = duration;
        this.listOfActors = new ArrayList<>();
    }
    public boolean addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Такой актер уже есть!");
            return false;
        }
        listOfActors.add(actor);
        return true;
    }
    public boolean replaceActor(String lastName, Actor newActor) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(lastName)) {
                listOfActors.set(i, newActor);
                return true;
            }
        }
        System.out.println("Предупреждение: актер с фамилией " + lastName + " не найден!");
        return false;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public List<Actor> getListOfActors() {
        return listOfActors;
    }

    public void printActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }

    }
}
