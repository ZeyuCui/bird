import java.util.HashMap;
import java.util.Map;

public class Parrot extends BirdClass {
    //BirdTypes.Parrots have a short, curved beak and are known for their intelligence and ability to mimic sounds.
    // Many pet parrots can learn a vocabulary of up to 100 words and often adopt a single "favorite" saying.
    // They include the rose-ring parakeet, gray parrot, and sulfur-crested cockatoo.
    Integer vocabulary;
    String favoriteSaying;

    private static String characteristic = "Parrots have a short, curved beak and are known for their intelligence and ability to mimic sounds. Many pet parrots can learn a vocabulary of up to 100 words and often adopt a single \"favorite\" saying. ";
    //@param: type: defines the specific type of a bird category, such as duck in waterfowl

    public Parrot(BirdsType type) {
        if (type != BirdsType.RoseRingParakeet && type != BirdsType.GrayParrot && type != BirdsType.SulfurCrestedCockatoo){
            throw new IllegalArgumentException("this bird doesn't belong to parrot's bird type");
        }
        super.setCategory(Category.PARROTS);
        super.setType(type);
        super.setExtinct(false);
        super.setWings(2);
        super.setCharacteristic(characteristic);
        Map food=new HashMap<Food,Integer>();
        food.put(Food.NUTS,5);
        food.put(Food.FRUIT,2);
        food.put(Food.SEEDS,3);
        super.setFoodMap(food);
    }

    public void setVocabulary(Integer vocabulary) {
        this.vocabulary = vocabulary;
    }
    public void setFavoriteSaying(String favoriteSaying) {
        this.favoriteSaying = favoriteSaying;
    }
    public Integer getVocabulary() {
        return vocabulary;
    }

    public String getFavoriteSaying() {
        return favoriteSaying;
    }

}
