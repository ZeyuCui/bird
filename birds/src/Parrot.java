public class Parrot extends BirdClass {
    //BirdTypes.Parrots have a short, curved beak and are known for their intelligence and ability to mimic sounds.
    // Many pet parrots can learn a vocabulary of up to 100 words and often adopt a single "favorite" saying.
    // They include the rose-ring parakeet, gray parrot, and sulfur-crested cockatoo.
    Integer vocabulary;
    String favoriteSaying;

    //@param: type: defines the specific type of a bird category, such as duck in waterfowl
    public Parrot(BirdsType type) {
        super.setType(type);
    }

    public Parrot(String name, Boolean isExtinct,BirdsType type) {
        super(name, isExtinct);
        super.setType(type);
    }

    public Parrot(String name, Boolean isExtinct, Integer wings,BirdsType type) {
        super(name, isExtinct, wings);
        super.setType(type);
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
