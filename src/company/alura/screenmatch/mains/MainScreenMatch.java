package company.alura.screenmatch.mains;

public class MainScreenMatch {
    public static void main(String[] args) {
        System.out.println("Welcome to Screen Match");
        System.out.println("Movie: Matrix");

        int releaseDate = 1999;
        boolean includeInThePlan = true;
        double movieNote = 8.2;

        String synopsis = """
                Matrix es una paradoja
                La mejor pelicula del fin del milenio
                Fue lanzada en:
                """ + releaseDate;

        double media = (8.2 + 9.8 + 9.0) / 3;

        int classification = (int) (media / 2);

        System.out.println("Media is: " + media);

        System.out.println(synopsis);

        /*String name = "Josseph";
        int age = 29;
        double spent = 550.5050;

        String message = """
                Hello, %s
                You have %d years old , congratulations!!
                """.formatted(name, age);
        //System.out.println(message);

        //System.out.println(String.format("My name is %s, I´m %d years old and today I spent %.2f dollars", name, age, value));
        System.out.printf("My name is %s, I´m %d years old and today I spent %.2f dollars%n", name, age, spent);

        // implicit casting
        int xx = 10;
        double yy = xx;

        // casting explicito
        double x = 10.5;
        int y = (int) x; */
    }
}
