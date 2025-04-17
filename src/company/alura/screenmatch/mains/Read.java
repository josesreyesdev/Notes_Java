package company.alura.screenmatch.mains;

import java.util.Scanner;
import java.util.function.Function;

public class Read {
    public static void main(String[] args) {
        double mediaEvaluations = 0;

        String movie = entry("Write your favorite movie:", input -> input);
        System.out.println("Your favorite movie is: "+ movie);

        int releaseDate =  entry("\nWrite release date of " + movie, Integer::parseInt);
        System.out.println("Release date of " + movie + " was in " + releaseDate);

        for (int i = 0; i < 3; i++) {
            double noteOfMovie = entry("\nWrite the note of "+ movie, Double::parseDouble);
            mediaEvaluations += noteOfMovie;
        }
        System.out.printf("The media of: " + movie  + " is: %.2f",  (mediaEvaluations / 3));
    }

    private static <T> T entry(String message, Function<String, T> parser) {
        Scanner teclado = new Scanner(System.in);
        while (true) {
            System.out.println(message);
            String input = teclado.nextLine();

            if (input.isEmpty()) {
                System.out.println("Entry is empty. Try again.");
                continue;
            }

            try {
                return parser.apply(input);
            } catch (Exception e) {
                System.out.println("Invalid entry. Try again.");
            }
        }
    }
}
