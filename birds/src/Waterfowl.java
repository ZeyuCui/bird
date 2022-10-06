/**
 * @Description
 * @Author
 */
public class Waterfowl extends BirdsNearWater{
    //Live near water sources (fresh or salt)

    public Waterfowl(BirdsType type) {
        super.setType(type);
    }

    public Waterfowl(String name, Boolean isExtinct, BirdsType type) {
        super(name, isExtinct);
        super.setType(type);
    }

    public Waterfowl(String name, Boolean isExtinct, int numOfWings, BirdsType type) {
        super(name, isExtinct, numOfWings);
        super.setType(type);
    }

    public Waterfowl(String name, Boolean isExtinct, int numOfWings, BodyOfWater waterType, BirdsType type) {
        super(name, isExtinct, numOfWings, waterType);
        super.setType(type);
    }
}
