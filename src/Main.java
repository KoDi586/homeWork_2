public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }


    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("\nЗадача 2");

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("\nЗадача 3");

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }


    public static void task2 () {
        System.out.println("\nЗадача 4");

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("\nЗадача 5");

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

    }
    public static void task3 () {
        System.out.println("\nЗадача 6");
        var boxer_1 = 78.2;
        var boxer_2 = 82.7;
        var sumBoxers = boxer_2 + boxer_1;
        System.out.println("Общий вес боксеров - " + sumBoxers);
        var difBoxers = boxer_2 - boxer_1;
        System.out.println("Разница между весами боксеров - " + difBoxers);


        System.out.println("\nЗадача 7");
        System.out.println("Первый способ: " + (boxer_2 - boxer_1));
        System.out.println("Второй способ: " + (boxer_2 % boxer_1));

    }
    public static void task4 () {
        System.out.println("\nЗадача 8");

        var hour = 640;
        var personHour = 8;
        var countPeople = hour / personHour;
        System.out.println("Всего работников в компании — " + countPeople + " человек.");

        var allPeople = countPeople + 94;
        var allHour = allPeople * personHour;
        System.out.println("Если в компании работает " + allPeople + " человек, то всего " + allHour + " часов работы может быть поделено между сотрудниками!");




    }
}