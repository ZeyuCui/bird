/**
 * @Description
 * @Author
 */
public class Shorebird extends BirdClass {
    public Shorebird() {
        super("shorebird", "They live near water sources including wetlands, freshwater and saltwater shorelands, even the ocean.", 2, "No");

    }

    public Shorebird(String name, String characteristic, Integer wings, String isExtinct) {
        super.setName(name);
        super.setCharacteristic(characteristic);
        super.setWings(wings);
        super.setIsExtinct(isExtinct);

    }


}
