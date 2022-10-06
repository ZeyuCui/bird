/**
 * @Description
 * @Author
 */
public class Shorebirds extends BirdsNearWater {
    //They live near water sources including wetlands, freshwater and saltwater shorelands, even the ocean.


    public Shorebirds(BirdsType type) {
        super.setType(type);
    }

    public Shorebirds(String name, Boolean isExtinct, BirdsType type) {
        super(name, isExtinct);
        super.setType(type);
    }

    public Shorebirds(String name, Boolean isExtinct, int numOfWings, BirdsType type) {
        super(name, isExtinct, numOfWings);
        super.setType(type);
    }

    public Shorebirds(String name, Boolean isExtinct, int numOfWings, BodyOfWater waterType, BirdsType type) {
        super(name, isExtinct, numOfWings, waterType);
        super.setType(type);
    }

}
