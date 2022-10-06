/**
 * @Description
 * @Author
 */
public class Waterfowl extends BirdsNearWater{

    private static String characteristic = "Live near water sources (fresh or salt)";
    public Waterfowl(BirdsType type) {
        super.setType(type);
        super.setExtinct(false);
        super.setWings(2);
        super.setCharacteristic(characteristic);
    }


}
