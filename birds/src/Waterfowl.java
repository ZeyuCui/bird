/**
 * @Description
 * @Author
 */
public class Waterfowl extends BirdsNearWater{

    private static String characteristic = "Live near water sources (fresh or salt)";
    public Waterfowl(BirdsType type) {
        if (type != BirdsType.Ducks && type != BirdsType.Swans && type != BirdsType.Geese){
            throw new IllegalArgumentException("this bird doesn't belong to parrot's bird type");
        }
        super.setType(type);
        super.setCategory(Category.WATERFOWL);
        super.setExtinct(false);
        super.setWings(2);
        super.setCharacteristic(characteristic);
    }


}
