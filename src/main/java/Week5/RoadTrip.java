package Week5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static input.InputUtils.positiveIntInput;

public class RoadTrip {

    public static void main(String[] args) {

        Map<String, Integer> distanceFromMinneapolis = new HashMap<>();

        distanceFromMinneapolis.put("Duluth", 154);
        distanceFromMinneapolis.put("Brainerd", 127);
        distanceFromMinneapolis.put("Stillwater", 26);
        distanceFromMinneapolis.put("Ely", 245);
        distanceFromMinneapolis.put("Red Wing", 54);

        int maxDrivingDistance = positiveIntInput("Enter the maximum distance in miles you want to drive on your road trip");

        for (Map.Entry<String, Integer> cityData : distanceFromMinneapolis.entrySet()) {
            String city = cityData.getKey();
            int drivingDistance = cityData.getValue();
            if (drivingDistance <= maxDrivingDistance) {
                System.out.println(city);
            }
        }

        List<String> citiesInRange = new ArrayList<>();

        // Better version, looping over keys
        for (String city: distanceFromMinneapolis.keySet()) {
            int drivingDistance = distanceFromMinneapolis.get(city);
            if (drivingDistance <= maxDrivingDistance) {
             //   System.out.printf("%s is %d miles away\n", city, drivingDistance);
                citiesInRange.add(city);
            }
        }

        if (citiesInRange.isEmpty()) {
            System.out.println("Sorry, no Minnesota cities are within your driving distance.");
        } else {
            System.out.println("Here are the cities in your driving distance: " + citiesInRange);
        }

    }
}