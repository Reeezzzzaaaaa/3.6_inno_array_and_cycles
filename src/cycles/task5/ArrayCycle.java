package cycles.task5;

import arrays.task3.ArrayMovie;
import arrays.task3.Movie;

public class ArrayCycle {

    public static void main(String[] args) {

        Movie[] films = new Movie[3];

        films[0] = new Movie("Властелин колец", 8.6, "Фэнтези", "Новая Зеландия", true);
        films[1] = new Movie("Темный рыцарь", 8.5, "Нуар", "США", true);
        films[2] = new Movie("Большой куш", 8.6, "Кинокомедия", "Выликобритания", false);

        films[0].year = 2002;
        films[1].year = 2008;
        films[2].year = 2000;

        for (int i = 0; i < films.length; i++) {
            String info = films[i].year + " " + films[i].name + " " + films[i].genre + " " + films[i].rating;
            System.out.println(info);
        }
    }
}
