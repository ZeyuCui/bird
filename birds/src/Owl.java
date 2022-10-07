import com.sun.org.glassfish.gmbal.Description;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*@Description: This is a class for Owl, extends from its parent class BirdClass.
     An object can be instantiated at Driver class using this class.*/
public class Owl extends BirdClass {

    //This is the characteristic of this bird category, it will be assigned to a String value in the constructor once an object of this bird category is created.
    private static String characteristic = "Has a facial disk that frame the eyes and bill";

    //The constructor will set the type of birds, its extinct status, wing numbers and characteristic for this bird category
    //once the object is created
    public Owl() {
        super.setType(BirdsType.Owls);
        super.setCategory(Category.OWLS);
        super.setExtinct(false);
        super.setWings(2);
        super.setCharacteristic(characteristic);
        Map food=new HashMap<Food,Integer>();
        food.put(Food.OTHER_BIRDS,1);
        food.put(Food.SMALL_MAMMALS,3);
        food.put(Food.FISH,2);
        super.setFoodMap(food);
    }

}
