public class Prey extends BirdClass {
    //Birds of prey all have sharp, hooked beaks with visible nostrils. They include hawks, eagles, and osprey.

    public Prey(BirdsType type) {
        super.setType(type);
    }

    public Prey(String name, Boolean isExtinct, BirdsType type) {
        super(name, isExtinct);
        super.setType(type);
    }

    public Prey(String name, Boolean isExtinct, Integer wings, BirdsType type) {
        super(name, isExtinct, wings);
        super.setType(type);
    }
}
