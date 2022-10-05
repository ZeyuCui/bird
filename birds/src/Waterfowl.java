/**
 * @Description
 * @Author
 */
public class Waterfowl extends Bird {
    public Waterfowl() {
        super("waterfowl", "Live near water sources (fresh or salt) ", 2, "No");

    }

    public Waterfowl(String name, String characteristic, Integer wings, String isExtinct) {
        super.setName(name);
        super.setCharacteristic(characteristic);
        super.setWings(wings);
        super.setIsExtinct(isExtinct);

    }
}
