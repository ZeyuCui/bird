import java.util.ArrayList;

public class Aviary {//a single aviary

    //No aviary can house more than 5 birds
    private static final int maxNumber=5;

    //Flightless birds, birds of prey, and waterfowl should not be mixed with other bird types
    //so there are 5 kinds of aviary,empty, mixed, flightless, prey, and waterfowl
    private AviaryType aviaryType;
    //names of all the birds inside this Aviary.
    private ArrayList<BirdClass> birdsInAviary;

    //creat a new aviary
    public Aviary(){
        birdsInAviary= new ArrayList<>();
        aviaryType=AviaryType.EMPTY;
    }

    //check if we can add the bird into this aviary, if yes add it to the aviary and return true, else return false.
    public boolean checkAddNewBird(BirdClass bird){
        Category c=bird.getCategory();
        if (this.birdsInAviary.size()==maxNumber)return false;
        else {
            if((c==Category.FLIGHTLESS)&&(aviaryType==AviaryType.EMPTY||aviaryType==AviaryType.FLIGHTLESS)){

                aviaryType = AviaryType.FLIGHTLESS;
                return true;
            }
            else if((c==Category.PREY)&&(aviaryType==AviaryType.EMPTY||aviaryType==AviaryType.PREY)){

                aviaryType = AviaryType.PREY;
                return true;
            }
            else if((c==Category.WATERFOWL)&&(aviaryType==AviaryType.EMPTY||aviaryType==AviaryType.WATERFOWL)){

                aviaryType=AviaryType.WATERFOWL;
                return true;
            }
            else if((c!=Category.FLIGHTLESS)&&(c!=Category.PREY)&&(c!=Category.WATERFOWL)&&(aviaryType==AviaryType.EMPTY||aviaryType==AviaryType.MIXED)){

                aviaryType=AviaryType.MIXED;
                return true;
            }
            else return false;
        }
    }
    public void addNewBird(BirdClass bird){
        Category c=bird.getCategory();
        birdsInAviary.add(bird);
        if((c==Category.FLIGHTLESS))aviaryType = AviaryType.FLIGHTLESS;
        else if(c==Category.PREY)aviaryType =AviaryType.PREY;
        else if(c==Category.WATERFOWL)aviaryType=AviaryType.WATERFOWL;
        else aviaryType=AviaryType.MIXED;
    }
    // get the number of birds in this aviary
    public int getNumOfBirds(){
        return birdsInAviary.size();
    }
    //get the type of the aviary
    public AviaryType getAviaryType() {
        return aviaryType;
    }
    //set the type of the aviary
    public void setAviaryType(AviaryType aviaryType) {
        this.aviaryType = aviaryType;
    }

    //get the list of birds in aviary
    public ArrayList<BirdClass> getBirdsInAviary() {
        return birdsInAviary;
    }

    //set birds in aviary
    public void setBirdsInAviary(ArrayList<BirdClass> birdsInAviary) {
        this.birdsInAviary = birdsInAviary;
    }



}
