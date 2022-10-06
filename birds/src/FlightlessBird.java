public class FlightlessBird extends BirdClass {
    //BirdTypes.Flightless birds live on the ground and have no (or undeveloped) wings. They include the emus, kiwis, and moas. Some (but not all) of these birds are extinct.


    public FlightlessBird(BirdsType type) {
        super.setType(type);
    }

    public FlightlessBird(String name, Boolean isExtinct,BirdsType type) {
        super(name, isExtinct);
        super.setType(type);
    }

    public FlightlessBird(String name, Boolean isExtinct, Integer wings, BirdsType type) {
        super(name, isExtinct, wings);
        super.setType(type);
    }
}
