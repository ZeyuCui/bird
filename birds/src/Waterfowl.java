import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author
 */
public class Waterfowl extends BirdsNearWater{

    private static String characteristic = "Live near water sources (fresh or salt)";
    public Waterfowl(BirdsType type) {
        if (type != BirdsType.Ducks && type != BirdsType.Swans && type != BirdsType.Geese){
            throw new IllegalArgumentException("this bird doesn't belong to waterfowl's bird type");
        }
        super.setType(type);
        super.setCategory(Category.WATERFOWL);
        super.setExtinct(false);
        super.setWings(2);
        super.setCharacteristic(characteristic);
        Map food=new HashMap<Food,Integer>();
        food.put(Food.FISH,3);
        food.put(Food.INSECTS,2);
        food.put(Food.AQUATIC_INVERTEBRATES,1);
        super.setFoodMap(food);
    }


}
