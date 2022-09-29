import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author
 */
public class AfricanJacana extends Shorebird{
    private List<String> food;
    List<String> waterHabitat;

    public AfricanJacana() {
        super("African Jacana", "Their enormous feet are by far their most unique feature and " +
                "feature elongated toes that help them walk on floating vegetation. ", 2, "No");
        food = new ArrayList<>();
        food.add("insects");
        food.add("invertebrates");
        waterHabitat = new ArrayList<>();
        waterHabitat.add("lagoons");
        waterHabitat.add("swamps");
        waterHabitat.add("marshes");
    }

    public List<String> getFood() {
        return food;
    }

    public List<String> getWaterHabitat() {
        return waterHabitat;
    }
}
