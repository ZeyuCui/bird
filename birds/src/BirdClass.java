import java.util.Map;

/**
 * @Description
 * @Author
 */
public class BirdClass implements Bird{

    //parent class of all the different type of birds

    //name of that bird
    private String name;

    //type of that bird
    private String type;

    //category of that bird
    private String category;

    //characteristic of that bird
    private String characteristic;

    //number of the wings the bird has
    private Integer wings;

    //whether the bird is extinct
    private String isExtinct;

    //what food needs to be kept and in what quantities for that bird in one day
    private Map<String,Integer> foodMap;

    public BirdClass() {
    }

    public BirdClass(String name) {
        this.name = name;
    }


    public BirdClass(String category, String characteristic, Integer wings, String isExtinct) {
        this.wings = wings;
        this.category = category;
        this.characteristic = characteristic;
        this.isExtinct = isExtinct;
    }


    public BirdClass(String name, String type, String category, String characteristic, Integer wings, String isExtinct, Map<String, Integer> foodMap) {
        this.name = name;
        this.type = type;
        this.category = category;
        this.characteristic = characteristic;
        this.wings = wings;
        this.isExtinct = isExtinct;
        this.foodMap = foodMap;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getCategory() {
        return category;
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

    public void setType(String type) {
        this.type = type;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Map<String, Integer> getFoodMap() {
        return foodMap;
    }

    public void setFoodMap(Map<String, Integer> foodMap) {
        this.foodMap = foodMap;
    }
}
