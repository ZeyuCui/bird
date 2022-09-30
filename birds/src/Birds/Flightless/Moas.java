package Birds.Flightless;

import Birds.FlightlessBird;

import java.util.ArrayList;
import java.util.List;

public class Moas extends FlightlessBird {
    private List<String> food;

    public Moas() {
        super("Moas", "They were the largest land animals in New Zealand, being found in forests, shrubland and subalpine habitats.", 0, "Yes");
        food = new ArrayList<>();
        food.add("vegetation");
        food.add("fruit");
        food.add("seeds");
    }
    public List<String> getFood() {
        return food;
    }
}
