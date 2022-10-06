/**
 * @Description
 * @Author
 */
public class Shorebirds extends BirdsNearWater {
    //They live near water sources including wetlands, freshwater and saltwater shorelands, even the ocean.

    private static String characteristic = "They live near water sources including wetlands, freshwater and saltwater shorelands, even the ocean.";
    public Shorebirds(BirdsType type) {
        super.setType(type);
        if(type == BirdsType.GreatAuk){
            super.setExtinct(true);
        }else{
            super.setExtinct(false);
        }
        super.setWings(2);
        super.setCharacteristic(characteristic);
    }
    public Shorebirds(BirdsType type, BodyOfWater waterType) {
        super.setType(type);
        if(type == BirdsType.GreatAuk){
            super.setExtinct(true);
        }else{
            super.setExtinct(false);
        }
        super.setWings(2);
        super.setCharacteristic(characteristic);
    }
    public Shorebirds(String name, Boolean isExtinct, int numOfWings, BodyOfWater waterType, BirdsType type) {
        super(name, isExtinct, numOfWings, waterType);
        super.setType(type);
    }

}
