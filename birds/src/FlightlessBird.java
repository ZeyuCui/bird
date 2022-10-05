public class FlightlessBird extends Bird {
    //BirdTypes.Flightless birds live on the ground and have no (or undeveloped) wings. They include the emus, kiwis, and moas. Some (but not all) of these birds are extinct.

    public FlightlessBird() {
        super("flightless-bird","live on the ground and have no (or undeveloped) wings. They include the emus, kiwis, and moas. Some (but not all) of these birds are extinct.",0,"Some");
    }


    public FlightlessBird(String name, String characteristic, Integer wings, String isExtinct) {
        super.setName(name);
        super.setCharacteristic(characteristic);
        super.setWings(wings);
        super.setIsExtinct(isExtinct);
    }
}
