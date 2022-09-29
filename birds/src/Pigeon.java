/**
 * @Description
 * @Author
 */
public class Pigeon extends Bird{
    private String name;
    private String characteristic;
    private String isExtinct;
    private String[] food;

    public Pigeon() {
        super();
        this.name = "pigeon";
        this.characteristic = "They can feed their young \"bird milk\" very similar to the milk of mammals";
        this.isExtinct = "Some";
        this.food = new String[]{"berries", "seeds", "fruit", "vegetation"};
    }

    public String getName() {
        return name;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public String getIsExtinct() {
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
