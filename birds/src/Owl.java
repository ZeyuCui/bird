import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author
 */
public class Owl extends Bird{
    private List<String> food;

    public Owl() {
        super("owl", "Has a facial disk that frame the eyes and bill", 2, "No");
        this.food= new ArrayList<>();
        food.add("insects");
        food.add("other birds");
        food.add("small mammals");
        food.add("fish");
    }

    public List<String> getFood() {
        return food;
    }

}
