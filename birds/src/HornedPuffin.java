import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author
 */
public class HornedPuffin extends Shorebird{
    private List<String> food;
    List<String> waterHabitat;

    public HornedPuffin() {
        super("horned puffin", "They have a white breast and belly, and vivid orange feet.", 2, "No");
        food = new ArrayList<>();
        food.add("aquatic invertebrates");
        food.add("fish");
        waterHabitat = new ArrayList<>();
        waterHabitat.add(" coastal cliffs");
        waterHabitat.add("offshore islands");
    }

    public List<String> getFood() {
        return food;
    }

    public List<String> getWaterHabitat() {
        return waterHabitat;
    }
}
