import java.util.ArrayList;
import java.util.List;

/*@Description: This is a class for Pigeon, extends from its parent class BirdClass.
     An object can be instantiated at Driver class using this class.*/
public class Pigeon extends BirdClass {
    //This is the characteristic of this bird category, it will be assigned to a String value in the constructor once an object of this bird category is created.
    private static String characteristic = "They can feed their young \"bird milk\" very similar to the milk of mammals";

    //The constructor will set the type of birds, its extinct status, wing numbers and characteristic for this bird category
    //once the object is created
    public Pigeon() {
        super.setType(BirdsType.Pigeons);
        super.setExtinct(false);
        super.setWings(2);
        super.setCharacteristic(characteristic);
    }

}
