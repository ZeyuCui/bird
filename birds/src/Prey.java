import java.util.HashMap;
import java.util.Map;

/*@Description: This is a class for Prey, extends from its parent class BirdClass.
     An object can be instantiated at Driver class using this class.*/
public class Prey extends BirdClass {

    //This is the characteristic of this bird category, it will be assigned to a String value in the constructor once an object of this bird category is created.
    private static String characteristic = "Birds of prey all have sharp, hooked beaks with visible nostrils. They include hawks, eagles, and osprey.";

    //The constructor will set the type of birds, its extinct status, wing numbers and characteristic for this bird category
    //once the object is created
    public Prey(BirdsType type) {
        if (type != BirdsType.Hawks && type != BirdsType.Eagles && type != BirdsType.Osprey){
            throw new IllegalArgumentException("this bird doesn't belong to prey's bird type");
        }
        super.setType(type);
        super.setCategory(Category.PREY);
        super.setExtinct(false);
        super.setWings(2);
        super.setCharacteristic(characteristic);
        Map food=new HashMap<Food,Integer>();
        food.put(Food.INSECTS,1);
        food.put(Food.SMALL_MAMMALS,2);
        food.put(Food.OTHER_BIRDS,1);
        super.setFoodMap(food);
    }

}
