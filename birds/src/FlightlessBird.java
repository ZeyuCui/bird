import java.util.ArrayList;

public class FlightlessBird extends Bird {
    //Flightless birds live on the ground and have no (or undeveloped) wings. They include the emus, kiwis, and moas. Some (but not all) of these birds are extinct.
    private String name;
    private String characteristic;
    private String isExtinct;

    private ArrayList<String> food;
    public FlightlessBird() {
        super();
        this.name = "flightless-bird";
        this.characteristic = "live on the ground and have no (or undeveloped) wings. They include the emus, kiwis, and moas. Some (but not all) of these birds are extinct.";
        this.isExtinct = "Some";
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
