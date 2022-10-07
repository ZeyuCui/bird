import java.util.HashMap;
import java.util.Map;

/*@Description: This is a class for Waterfowl, extends from its parent class BirdClass.
     An object can be instantiated at Driver class using this class.*/

public class Waterfowl extends BirdsNearWater{

    //This is the characteristic of this bird category, it will be assigned to a String value in the constructor once an object of this bird category is created.
    private static String characteristic = "Live near water sources (fresh or salt)";

    //The constructor will set the type of birds, its extinct status, wing numbers , the type of water they live and characteristic for this bird category
    //once the object is created
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
    public Waterfowl(BirdsType type, BodyOfWater waterType) {
        super(waterType);
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
