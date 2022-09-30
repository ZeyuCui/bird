package Birds.Shorebirds;

import Birds.Shorebird;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author
 */
public class GreatAuk extends Shorebird {
    private List<String> food;
    List<String> waterHabitat;
    public GreatAuk() {
        super("great auk", "The bird stood erect on land. It had a black back and head, a white front, and a large white spot between the bill and eye.", 2, "Yes");
        food = new ArrayList<>();
        food.add("fish");
        waterHabitat = new ArrayList<>();
        waterHabitat.add("intertidal zone");
        waterHabitat.add("Oceanic pelagic zone");
    }

    public List<String> getFood() {
        return food;
    }

    public List<String> getWaterHabitat() {
        return waterHabitat;
    }
}
