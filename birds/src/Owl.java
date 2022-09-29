/**
 * @Description
 * @Author
 */
public class Owl extends Bird{
    private String name;
    private String characteristic;
    private String isExtinct;
    private String[] food;

    public Owl() {
        super();
        this.name = "owl";
        this.characteristic = "Has a facial disk that frame the eyes and bill";
        this.isExtinct = "No";
        this.food = new String[]{"insects", "other birds", "small mammals", "fish"};
    }

    public String getName() {
        return name;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public String getExtinct() {
        return isExtinct;
    }

    public String[] getFood() {
        return food;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }
}
