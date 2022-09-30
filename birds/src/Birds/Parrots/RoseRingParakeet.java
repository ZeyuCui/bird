package Birds.Parrots;

import Birds.Parrot;

import java.util.ArrayList;
import java.util.List;

public class RoseRingParakeet extends Parrot {
    private List<String> food;

    public RoseRingParakeet() {
        super("RoseRingParakeet", "The adult male sports a red and black neck ring, and the hen and immature birds of both sexes either show no neck rings, or display shadow-like pale to dark grey neck rings.", 2, "No");
        food = new ArrayList<>();
        food.add("fruit");
        food.add("nuts");
        food.add("seeds");
        food.add("berries");
        super.setFavoriteSaying("babe");
        super.setVocabulary(250);
    }
    public List<String> getFood() {
        return food;
    }
}
