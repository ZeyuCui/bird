package Waterfowls;

import BirdTypes.Waterfowl;

import java.util.List;

/**
 * @Description
 * @Author
 */
public class Swan extends Waterfowl {
    private List<String> food;
    List<String> waterHabitat;

    public Swan() {

    }

    public List<String> getFood() {
        return food;
    }

    public List<String> getWaterHabitat() {
        return waterHabitat;
    }
}
