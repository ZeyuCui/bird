/**
 * @Description
 * @Author
 */
public class Shorebird extends Bird{
    private String characteristic;

    public Shorebird() {
        this.characteristic = "They live near water sources including wetlands, freshwater and saltwater shorelands, even the ocean.";
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }
}
