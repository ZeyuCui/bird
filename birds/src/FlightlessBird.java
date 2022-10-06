/*@Description: This is a class for Flightless bird, extends from its parent class BirdClass.
     An object can be instantiated at Driver class using this class.*/
public class FlightlessBird extends BirdClass {

    //This is the characteristic of this bird category, it will be assigned to a String value in the constructor once an object of this bird category is created.
    private static String characteristic = "Flightless birds live on the ground and have no (or undeveloped) wings.";

    //The constructor will set the type of birds, its extinct status, wing numbers and characteristic for this bird category
    //once the object is created
    public FlightlessBird(BirdsType type) {
        super.setType(type);
        if(type == BirdsType.Kiwis || type == BirdsType.Moas){
            super.setExtinct(true);
        }else {
            super.setExtinct(false);
        }
        super.setWings(0);
        super.setCharacteristic(characteristic);
    }

}
