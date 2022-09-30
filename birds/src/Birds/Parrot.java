package Birds;

public class Parrot extends Bird {
    //BirdTypes.Parrots have a short, curved beak and are known for their intelligence and ability to mimic sounds.
    // Many pet parrots can learn a vocabulary of up to 100 words and often adopt a single "favorite" saying.
    // They include the rose-ring parakeet, gray parrot, and sulfur-crested cockatoo.
    Integer vocabulary;
    String favoriteSaying;
    public Parrot() {
        super("parrot","BirdTypes.Parrots have a short, curved beak and are known for their intelligence and ability to mimic sounds.\n" +
                "Many pet parrots can learn a vocabulary of up to 100 words and often adopt a single \"favorite\" saying.",2,"No");
    }

    public Parrot(String name, String characteristic, Integer wings, String isExtinct) {
        super.setName(name);
        super.setCharacteristic(characteristic);
        super.setWings(wings);
        super.setIsExtinct(isExtinct);
    }
    public void setVocabulary(Integer vocabulary) {
        this.vocabulary = vocabulary;
    }
    public void setFavoriteSaying(String favoriteSaying) {
        this.favoriteSaying = favoriteSaying;
    }
    public Integer getVocabulary() {
        return vocabulary;
    }

    public String getFavoriteSaying() {
        return favoriteSaying;
    }

}
