package arrays.task3;

public class ArrayMovie {

    public static void main(String[] args) {

        Movie[] films = new Movie[3];

        films[0] = new Movie("Властелин колец", 8.6, "Фэнтези", "Новая Зеландия", true);
        films[1] = new Movie("Темный рыцарь", 8.5, "Нуар", "США", true);
        films[2] = new Movie("Большой куш", 8.6, "Кинокомедия", "Выликобритания", false);

        System.out.println(films[0].name);
        System.out.println(films[1].name);
        System.out.println(films[2].name);


    }
}
