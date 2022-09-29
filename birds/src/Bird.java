import java.util.List;

/**
 * @Description
 * @Author
 */
public class Bird {
    private String name;
    private String characteristic;
    private Integer wings;
    private String isExtinct;

    public Bird(String name, String characteristic, Integer wings, String isExtinct) {
        this.wings = wings;
        this.name = name;
        this.characteristic = characteristic;
        this.isExtinct = isExtinct;

    }

    public Bird() {
    }

    public String getName() {
        return name;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public Integer getWings() {
        return wings;
    }

    public String getIsExtinct() {
        return isExtinct;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    public void setWings(Integer wings) {
        this.wings = wings;
    }

    public void setIsExtinct(String isExtinct) {
        this.isExtinct = isExtinct;
    }
}
