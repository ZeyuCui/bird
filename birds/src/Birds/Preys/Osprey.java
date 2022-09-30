package Birds.Preys;

import Birds.Prey;

import java.util.ArrayList;
import java.util.List;

public class Osprey extends Prey {
    private List<String> food;

    public Osprey() {
        super("Osprey", "Osprey is a diurnal, fish-eating bird of prey with a cosmopolitan range. ", 2, "No");
        food = new ArrayList<>();
        food.add("fish");
        food.add("aquatic invertebrates");
    }
    public List<String> getFood() {
        return food;
    }
}
