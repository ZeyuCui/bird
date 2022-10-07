import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author
 */
public class BirdsNearWater extends BirdClass{
    private BodyOfWater waterSources;

    public BirdsNearWater() {
        super();
        Map food=new HashMap<Food,Integer>();
        food.put(Food.FISH,5);
        food.put(Food.INSECTS,2);
        food.put(Food.AQUATIC_INVERTEBRATES,3);
        super.setFoodMap(food);
    }
    public BirdsNearWater(BodyOfWater waterType){
        super();
        this.waterSources = waterType;
        Map food=new HashMap<Food,Integer>();
        food.put(Food.FISH,5);
        food.put(Food.INSECTS,2);
        food.put(Food.AQUATIC_INVERTEBRATES,3);
        super.setFoodMap(food);
    }

    public BodyOfWater getWaterSources() {
        return waterSources;
    }

    public void setWaterSources(BodyOfWater waterSources) {
        this.waterSources = waterSources;
    }
}
