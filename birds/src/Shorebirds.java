/**
 * @Description
 * @Author
 */
public class Shorebirds extends BirdsNearWater {


    private static String characteristic = "They live near water sources including wetlands, freshwater and saltwater shorelands, even the ocean.";
    public Shorebirds(BirdsType type) {

        if(type == BirdsType.GreatAuk){
            super.setExtinct(true);
            throw new RuntimeException("An extinct bird type cannot be added into the aviary");
        }else{
            super.setExtinct(false);
        }
        if (type != BirdsType.HornedPuffin && type != BirdsType.AfricanJacana){
            throw new IllegalArgumentException("this bird doesn't belong to parrot's bird type");
        }
        super.setType(type);
        super.setCategory(Category.SHOREBIRDS);
        super.setWings(2);
        super.setCharacteristic(characteristic);
    }
    public Shorebirds(BirdsType type, BodyOfWater waterType) {
        super(waterType);
        if(type == BirdsType.GreatAuk){
            super.setExtinct(true);
            throw new RuntimeException("An extinct bird type cannot be added into the aviary");
        }else{
            super.setExtinct(false);
        }
        if (type != BirdsType.HornedPuffin && type != BirdsType.AfricanJacana){
            throw new IllegalArgumentException("this bird doesn't belong to parrot's bird type");
        }
        super.setType(type);
        super.setCategory(Category.SHOREBIRDS);
        super.setWings(2);
        super.setCharacteristic(characteristic);
    }

}
