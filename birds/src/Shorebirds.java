import java.util.HashMap;
import java.util.Map;

/*@Description: This is a class for Shorebirds, extends from its parent class BirdClass.
     An object can be instantiated at Driver class using this class.*/

public class Shorebirds extends BirdsNearWater {

    //This is the characteristic of this bird category, it will be assigned to a String value in the constructor once an object of this bird category is created.

    private static String characteristic = "They live near water sources including wetlands, freshwater and saltwater shorelands, even the ocean.";

    //The constructor will set the type of birds, its extinct status, wing numbers , the type of water they live and characteristic for this bird category
    //once the object is created
    public Shorebirds(BirdsType type) {

        if(type == BirdsType.GreatAuk){
            super.setExtinct(true);
        }else{
            super.setExtinct(false);
        }
        if (type != BirdsType.HornedPuffin && type != BirdsType.AfricanJacana&&type!=BirdsType.GreatAuk){
            throw new IllegalArgumentException("this bird doesn't belong to shorebird's bird type");
        }
        super.setType(type);
        super.setCategory(Category.SHOREBIRDS);
        super.setWings(2);
        super.setCharacteristic(characteristic);
        Map food=new HashMap<Food,Integer>();
        food.put(Food.FISH,5);
        food.put(Food.INSECTS,2);
        food.put(Food.AQUATIC_INVERTEBRATES,3);
        super.setFoodMap(food);
    }
    public Shorebirds(BirdsType type, BodyOfWater waterType) {
        super(waterType);
        if(type == BirdsType.GreatAuk){
            super.setExtinct(true);
        }else{
            super.setExtinct(false);
        }
        if (type != BirdsType.HornedPuffin && type != BirdsType.AfricanJacana&&type!=BirdsType.GreatAuk){
            throw new IllegalArgumentException("this bird doesn't belong to shorebird's bird type");
        }
        super.setType(type);
        super.setCategory(Category.SHOREBIRDS);
        super.setWings(2);
        super.setCharacteristic(characteristic);
        Map food=new HashMap<Food,Integer>();
        food.put(Food.FISH,5);
        food.put(Food.INSECTS,2);
        food.put(Food.AQUATIC_INVERTEBRATES,3);
        super.setFoodMap(food);
    }

}
