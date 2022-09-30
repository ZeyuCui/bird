package Birds.Flightless;


import Birds.FlightlessBird;

import java.util.ArrayList;
import java.util.List;

public class Emus extends FlightlessBird {
    private List<String> food;

    public Emus() {
        super("Emus", " are soft-feathered, brown, flightless birds with long necks and legs, and can reach up to 1.9 metres (6.2 ft) in height.", 0, "No");
        food = new ArrayList<>();
        food.add("insects");
        food.add("vegetation");
        food.add("fruit");
        food.add("seeds");
    }
    public List<String> getFood() {
        return food;
    }
}
