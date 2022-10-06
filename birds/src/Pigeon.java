import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author
 */
public class Pigeon extends BirdClass {
    private static String characteristic = "They can feed their young \"bird milk\" very similar to the milk of mammals";
    public Pigeon(BirdsType type) {
        super.setType(type);
        super.setCharacteristic(characteristic);
    }

    public Pigeon(String name, Boolean isExtinct, BirdsType type) {
        super(name, isExtinct);
        super.setType(type);
        super.setCharacteristic(characteristic);
    }

    public Pigeon(String name, Boolean isExtinct, Integer wings, BirdsType type) {
        super(name, isExtinct, wings);
        super.setType(type);
        super.setCharacteristic(characteristic);
    }

}
