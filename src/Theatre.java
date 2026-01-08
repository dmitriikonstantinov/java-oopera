public class Theatre {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Иван", "Сидоров", Gender.MALE, 180);
        Actor actor2 = new Actor("Светлана", "Тихонова", Gender.FEMALE, 176);
        Actor actor3 = new Actor("Илья", "Кочетов", Gender.MALE, 176);
        Director director1 = new Director("Федор", "Климов", Gender.MALE, 12);
        Director director2 = new Director("Станислав", "Воробьев", Gender.MALE, 8);
        Person musicAuthor = new Person("Петр", "Чайковский", Gender.MALE);
        Person musicAuthor2 = new Person("Джузеппе", "Верди", Gender.MALE);
        Person choreographer = new Person("Иван", "Высоких", Gender.MALE);
        Ballet ballet = new Ballet("Щелкунчик", 180, director1, musicAuthor,
                "По мотивам сказки Э. Т. А. Гофмана «Щелкунчик и мышиный король»",
                choreographer);
        Opera opera = new Opera("Травиатта", 180, director2, musicAuthor2, "История любви" +
                " Виолетты и Альфредо", 37);
        Show show = new Show("Вишневый сад", 120, director1);
        show.addActor(actor1);
        show.addActor(actor3);

        opera.addActor(actor2);
        opera.addActor(actor1);

        ballet.addActor(actor2);
        ballet.addActor(actor3);
        System.out.println("Актеры Балета");
        ballet.printActors();
        System.out.println();
        System.out.println("Актеры Оперы");
        opera.printActors();
        System.out.println();
        System.out.println("Актеры Спектакля");
        show.printActors();
        System.out.println();

        System.out.println("Замена Оперного актера");
        opera.replaceActor("Сидоров", actor3);
        opera.printActors();
        System.out.println();

        System.out.println("Замена несуществующего актера");
        ballet.replaceActor("Хмельницкая", actor1);
        System.out.println();

        System.out.println(opera.getLibrettoText());
        System.out.println(ballet.getLibrettoText());
        System.out.println(director1);


    }

}
