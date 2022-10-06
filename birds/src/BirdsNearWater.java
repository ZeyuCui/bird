/**
 * @Description
 * @Author
 */
public class BirdsNearWater extends BirdClass{
    private BodyOfWater waterSources;

    public BirdsNearWater() {
        super();
    }
    public BirdsNearWater(String name, Boolean isExtinct) {
        super(name, isExtinct);
    }
    public BirdsNearWater(String name, Boolean isExtinct, int numOfWings){
        super(name, isExtinct, numOfWings);
    }
    public BirdsNearWater(String name, Boolean isExtinct, int numOfWings, BodyOfWater waterType){
        super(name, isExtinct, numOfWings);
        this.waterSources = waterType;
    }

    public BodyOfWater getWaterSources() {
        return waterSources;
    }

    public void setWaterSources(BodyOfWater waterSources) {
        this.waterSources = waterSources;
    }
}
