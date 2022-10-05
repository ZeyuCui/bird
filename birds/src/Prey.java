public class Prey extends Bird {
    //Birds of prey all have sharp, hooked beaks with visible nostrils. They include hawks, eagles, and osprey.

    public Prey() {
        super("prey","have sharp, hooked beaks with visible nostrils",2,"No");
    }
    public Prey(String name, String characteristic, Integer wings, String isExtinct) {
            super.setName(name);
            super.setCharacteristic(characteristic);
            super.setWings(wings);
            super.setIsExtinct(isExtinct);
        }

}
