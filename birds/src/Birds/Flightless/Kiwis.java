package Birds.Flightless;

import Birds.FlightlessBird;

import java.util.ArrayList;
import java.util.List;

public class Kiwis extends FlightlessBird {
    private List<String> food;

    public Kiwis() {
        super("Kiwis", " they have a long, flexible beak with a downward curve on end.", 0, "Yes");
        food = new ArrayList<>();
        food.add("larvae");
        food.add("vegetation");
        food.add("fruit");
        food.add("seeds");
    }
    public List<String> getFood() {
        return food;
    }
}
