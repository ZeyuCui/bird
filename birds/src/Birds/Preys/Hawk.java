package Birds.Preys;

import Birds.Prey;

import java.util.ArrayList;
import java.util.List;

public class Hawk extends Prey {
    private List<String> food;

    public Hawk() {
        super("Hawk", "Hawks are strong, powerful birds. Their feet are equipped with sharp, curved talons for capturing prey, and their strong beaks are hooked for biting and tearing flesh. Swift fliers, some hawks can attain speeds of over 150 mph when diving. ", 2, "No");
        food = new ArrayList<>();
        food.add("insects");
        food.add("small mammals");
        food.add("other birds");
    }
    public List<String> getFood() {
        return food;
    }
}
