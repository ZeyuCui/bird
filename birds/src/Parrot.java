import java.util.ArrayList;

public class Parrot extends Bird {
    //Parrots have a short, curved beak and are known for their intelligence and ability to mimic sounds.
    // Many pet parrots can learn a vocabulary of up to 100 words and often adopt a single "favorite" saying.
    // They include the rose-ring parakeet, gray parrot, and sulfur-crested cockatoo.
    private String name;
    private String characteristic;
    private String isExtinct;

    private ArrayList<String> food;
    public Parrot() {
        super();
        this.name = "parrot";
        this.characteristic = "Parrots have a short, curved beak and are known for their intelligence and ability to mimic sounds.\n" +
                "Many pet parrots can learn a vocabulary of up to 100 words and often adopt a single \"favorite\" saying.";
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
