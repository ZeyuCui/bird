package Birds.Waterfowls;

import Birds.Waterfowl;

import java.util.List;

/**
 * @Description
 * @Author
 */
public class Geese extends Waterfowl {
    private List<String> food;
    List<String> waterHabitat;

    public Geese() {

    }

    public List<String> getFood() {
        return food;
    }

    public List<String> getWaterHabitat() {
        return waterHabitat;
    }
}
