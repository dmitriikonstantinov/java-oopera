import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private List<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
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
        int foundIndex = -1;

        for (int i = 0; i < listOfActors.size(); i++) {
            Actor currentActor = listOfActors.get(i);

            if (currentActor.getSurname().equals(lastName)) {
                if (foundIndex != -1) {
                    System.out.println("Ошибка: найдено несколько актеров с фамилией '" + lastName + "'");
                    return false;
                }
                foundIndex = i;
            }
        }

        if (foundIndex == -1) {
            System.out.println("Актер с фамилией '" + lastName + "' не найден");
            return false;
        }

        Actor oldActor = listOfActors.get(foundIndex);
        listOfActors.set(foundIndex, newActor);

        System.out.println("Актер " + oldActor + " заменен на " + newActor);
        return true;
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

    public Director getDirector() {
        return director;
    }

    public void printActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }

    }
}
