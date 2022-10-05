import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author
 */
public class Pigeon extends Bird {
    private List<String> food;

    public Pigeon() {
        super("pigeon", "They can feed their young \"bird milk\" very similar to the milk of mammals", 2, "Some");
        food = new ArrayList<>();
        food.add("berries");
        food.add("seeds");
        food.add("fruit");
        food.add("vegetation");
    }

    public List<String> getFood() {
        return food;
    }
}
