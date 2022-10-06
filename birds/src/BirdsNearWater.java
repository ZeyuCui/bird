/**
 * @Description
 * @Author
 */
public class BirdsNearWater extends BirdClass{
    private BodyOfWater waterSources;

    public BirdsNearWater() {
        super();
    }
    public BirdsNearWater(BodyOfWater waterType){
        super();
        this.waterSources = waterType;
    }

    public BodyOfWater getWaterSources() {
        return waterSources;
    }

    public void setWaterSources(BodyOfWater waterSources) {
        this.waterSources = waterSources;
    }
}
