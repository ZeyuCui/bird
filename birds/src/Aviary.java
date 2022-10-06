import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Aviary {//a single aviary

    //No aviary can house more than 5 birds
    private static final int maxNumber=5;

    //Flightless birds, birds of prey, and waterfowl should not be mixed with other bird types
    //so there are 5 kinds of aviary,empty, mixed, flightless, prey, and waterfowl
    private AviaryType aviaryType;
    //names of all the birds inside this Aviary.
    private ArrayList<BirdClass> birdsInAviary;
    //food needed for all the birds in the Aviary.
    private Map<Food,Integer> foodMap;



    //creat a new aviary
    public Aviary(){
        birdsInAviary= new ArrayList<>();
        aviaryType=AviaryType.EMPTY;
        foodMap=new HashMap<Food,Integer>();
    }

    //check if we can add the bird into this aviary, if yes add it to the aviary and return true, else return false.
    public boolean checkAddNewBird(BirdClass bird){
        if (bird.getIsExtinct()==true)return false;
        if (getNumOfBirds()==maxNumber)return false;
        else {
            Category c=bird.getCategory();
            return checkTypeMatch(c,aviaryType);
        }
    }

    //check if the bird matches with the aviary
    private boolean checkTypeMatch(Category c, AviaryType aviaryType){
        if((c==Category.FLIGHTLESS)&&(aviaryType==AviaryType.EMPTY||aviaryType==AviaryType.FLIGHTLESS)){
            return true;
        }
        else if((c==Category.PREY)&&(aviaryType==AviaryType.EMPTY||aviaryType==AviaryType.PREY)){
            return true;
        }
        else if((c==Category.WATERFOWL)&&(aviaryType==AviaryType.EMPTY||aviaryType==AviaryType.WATERFOWL)){
            return true;
        }
        else if((c!=Category.FLIGHTLESS)&&(c!=Category.PREY)&&(c!=Category.WATERFOWL)&&(aviaryType==AviaryType.EMPTY||aviaryType==AviaryType.MIXED)){
            return true;
        }
        else return false;
    }

    //add bird into this aviary
    public void addNewBird(BirdClass bird){
        Category c=bird.getCategory();
        birdsInAviary.add(bird);
        for (Food f:bird.getFoodMap().keySet()){
            foodMap.put(f,foodMap.getOrDefault(f,0)+bird.getFoodMap().get(f));
        }
        if((c==Category.FLIGHTLESS))aviaryType = AviaryType.FLIGHTLESS;
        else if(c==Category.PREY)aviaryType =AviaryType.PREY;
        else if(c==Category.WATERFOWL)aviaryType=AviaryType.WATERFOWL;
        else aviaryType=AviaryType.MIXED;
    }

    //check and add bird for a specific aviary
    public void checkAndAdd(BirdClass bird){
        if (bird.getIsExtinct()==true) throw new IllegalArgumentException("No extinct birds can be added to an aviary");
        Category c=bird.getCategory();
        if(birdsInAviary.size()==maxNumber) throw  new RuntimeException("this aviary is full");
        if(!checkTypeMatch(bird.getCategory(),aviaryType)) throw new RuntimeException(bird.getCategory().toString()+ "can not be added to a "+aviaryType.toString()+"aviary");
        birdsInAviary.add(bird);
        //update food map of the aviary, add food needed by this bird into the food map
        for (Food f:bird.getFoodMap().keySet()){
            foodMap.put(f,foodMap.getOrDefault(f,0)+bird.getFoodMap().get(f));
        }
        if((c==Category.FLIGHTLESS))aviaryType = AviaryType.FLIGHTLESS;
        else if(c==Category.PREY)aviaryType =AviaryType.PREY;
        else if(c==Category.WATERFOWL)aviaryType=AviaryType.WATERFOWL;
        else aviaryType=AviaryType.MIXED;
    }

    //Print a sign for any given aviary that gives a description of the birds it houses
    // and any interesting information that it may have about that animal.
    public void printSign(){

    }
    // get the number of birds in this aviary
    public int getNumOfBirds(){
        return birdsInAviary.size();
    }
    //determine whether this aviary is full
    public Boolean isFull(){
        return birdsInAviary.size() >= maxNumber;
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

//    public String printAviarySign(){
//
//    }


}
