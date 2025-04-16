package company.alura.screenmatch.mains;

public class Decisions {
    public static void main(String[] args) {
        int releaseDate = 1999;
        boolean includeInThePlan = false;
        double movieNote = 8.2;
        String planType = "plus";


        if (releaseDate > 2022) {
            System.out.println("Movie most popular");
        } else {
            System.out.println("Movie not popular but is recommend to watch");
        }

        if (includeInThePlan || planType.equalsIgnoreCase("plus")) {
            System.out.println("Disfrute movie");
        } else {
            System.out.println("Is not available for your current plan");
        }

    }
}
