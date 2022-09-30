package Birds.Parrots;

import Birds.Parrot;

import java.util.ArrayList;
import java.util.List;

public class GrayParrot extends Parrot {
    private List<String> food;

    public GrayParrot() {
        super("GrayParrot", "is a medium-sized, predominantly grey, black-billed parrot.", 2, "No");
        food = new ArrayList<>();
        food.add("fruit");
        food.add("nuts");
        food.add("seeds");
        super.setFavoriteSaying("Woof");
        super.setVocabulary(950);
    }
    public List<String> getFood() {
        return food;
    }
}
