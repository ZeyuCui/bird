package Birds.Preys;

import Birds.Prey;

import java.util.ArrayList;
import java.util.List;

public class Eagle extends Prey {
    private List<String> food;

    public Eagle() {
        super("Eagle", "They are at the top of the food chain", 2, "No");
        food = new ArrayList<>();
        food.add("small mammals");
        food.add("other birds");
    }
    public List<String> getFood() {
        return food;
    }
}
