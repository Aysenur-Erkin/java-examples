import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ActivityRecommendation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How is the weather today (sunny, rainy, snowy, foggy)? ");
        String weather = scanner.nextLine().toLowerCase();

        List<String> activities = getActivitiesForWeather(weather);
        if (activities.isEmpty()) {
            System.out.println("Weather condition not understood. Please try again.");
        } else {
            Random random = new Random();
            String randomActivity = activities.get(random.nextInt(activities.size()));
            System.out.println("Suggested activity: " + randomActivity);
        }

        scanner.close();
    }

    private static List<String> getActivitiesForWeather(String weather) {
        List<String> activities = new ArrayList<>();

        switch (weather) {
            case "sunny":
                activities.add("Go for a walk in the park");
                activities.add("Have a picnic");
                activities.add("Go cycling");
                break;
            case "rainy":
                activities.add("Read a book");
                activities.add("Watch a movie");
                activities.add("Bake cookies");
                break;
            case "snowy":
                activities.add("Go skiing");
                activities.add("Build a snowman");
                activities.add("Have a snowball fight");
                break;
            case "foggy":
                activities.add("Watch a movie at home");
                activities.add("Do some indoor yoga");
                activities.add("Play board games");
                break;
        }

        return activities;
    }
}
