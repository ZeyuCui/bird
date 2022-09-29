import java.util.ArrayList;

public class Prey extends Bird {
    //Birds of prey all have sharp, hooked beaks with visible nostrils. They include hawks, eagles, and osprey.
    private String name;
    private String characteristic;
    private String isExtinct;

    private ArrayList<String> food;
    public Prey() {
        super();
        this.name = "prey";
        this.characteristic = "have sharp, hooked beaks with visible nostrils";
        this.isExtinct = "No";
        this.food = new ArrayList<String>();
        this.food.add("");
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

    public ArrayList<String> getFood() {
        return food;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }
}
