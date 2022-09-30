package Birds.Parrots;

import Birds.Parrot;

import java.util.ArrayList;
import java.util.List;

public class SulfurCrestedCockatoo extends Parrot {
    private List<String> food;

    public SulfurCrestedCockatoo() {
        super("Sulfur Crested Cockatoo", "is a large and white parrot with a distinctive yellow crest on top of its head which it can raise or leave folded down.", 2, "No");
        food = new ArrayList<>();
        food.add("fruit");
        food.add("nuts");
        food.add("seeds");
        food.add("berries");
        super.setFavoriteSaying("peekaboo");
        super.setVocabulary(200);
    }
    public List<String> getFood() {
        return food;
    }
}
