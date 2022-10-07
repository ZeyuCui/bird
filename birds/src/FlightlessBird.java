/*@Description: This is a class for Flightless bird, extends from its parent class BirdClass.
     An object can be instantiated at Driver class using this class.*/
public class FlightlessBird extends BirdClass {

    //This is the characteristic of this bird category, it will be assigned to a String value in the constructor once an object of this bird category is created.
    private static String characteristic = "Flightless birds live on the ground and have no (or undeveloped) wings.";

    //The constructor will set the type of birds, its extinct status, wing numbers and characteristic for this bird category
    //once the object is created
    public FlightlessBird(BirdsType type) {
        if(type == BirdsType.Kiwis || type == BirdsType.Moas){
            super.setExtinct(true);
            throw new RuntimeException("An extinct bird type cannot be added into the aviary");
        }else {
            super.setExtinct(false);
        }
        if (type != BirdsType.Emus){
            throw new IllegalArgumentException("this bird doesn't belong to parrot's bird type");
        }
        super.setType(type);
        super.setWings(0);
        super.setCharacteristic(characteristic);
    }

}
