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
        super.setCharacteristic("living near water");
        food.put(Food.FISH,5);
        food.put(Food.INSECTS,2);
        food.put(Food.AQUATIC_INVERTEBRATES,3);
        super.setFoodMap(food);
    }
    public BirdsNearWater(BodyOfWater waterType){
        super();
        super.setCharacteristic("living near water");
        this.waterSources = waterType;
        Map food=new HashMap<Food,Integer>();
        food.put(Food.FISH,5);
        food.put(Food.INSECTS,2);
        food.put(Food.AQUATIC_INVERTEBRATES,3);
        super.setFoodMap(food);
    }

    public BirdsNearWater(BirdsType type) {

        if(type == BirdsType.GreatAuk){
            super.setExtinct(true);
        }else{
            super.setExtinct(false);
        }
        if (type != BirdsType.HornedPuffin && type != BirdsType.AfricanJacana&&type!=BirdsType.GreatAuk&&type != BirdsType.Ducks && type != BirdsType.Swans && type != BirdsType.Geese){
            throw new IllegalArgumentException("this bird is not a bird living near water");
        }
        super.setType(type);
        super.setWings(2);
        super.setCharacteristic("living near water");
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
