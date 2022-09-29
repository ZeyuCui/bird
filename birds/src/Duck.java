import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author
 */
public class Duck extends Waterfowl{
    private List<String> food;
    List<String> waterHabitat;

    public Duck() {
        super("duck", "Ducks are highly intelligent and emotional creatures.", 2, "No");
        food = new ArrayList<>();
        food.add("seeds");
        food.add("fruit");
        food.add("insects");
        waterHabitat = new ArrayList<>();
        waterHabitat.add("wetlands");
        waterHabitat.add("rivers");
        waterHabitat.add("lakes");
        waterHabitat.add("oceans");
    }

    public List<String> getFood() {
        return food;
    }

    public List<String> getWaterHabitat() {
        return waterHabitat;
    }
}
