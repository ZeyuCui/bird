import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Conservatory {// a single conservatoryhi
    private static final int maxNumber=20;
    //a conservatory has many aviaries
    private ArrayList<Aviary> myAviaries;
    //food needed for all the birds in the conservatory
    private Map<Food,Integer> foodMap;
    private Map<BirdsType, Integer> typeLocation;
    public Conservatory() {
        myAviaries=new ArrayList<>();
        typeLocation = new HashMap<>();
        foodMap=new HashMap<Food, Integer>();
    }

    //whether we can add a new bird to the Conservatory
    public void addNewBirdToConser(BirdClass b){
        if(b.getIsExtinct()==true){
            throw new IllegalArgumentException("No extinct birds can be added to a Conservatory");
        }
        boolean canbeadd=false;
        //check if we can add b to the existing aviaries
        for(Aviary a: myAviaries){
                if(a.checkAddNewBird(b))
                {
                    a.addNewBird(b);
                    canbeadd=true;
                }
            }
        //if not check if we can create a new Aviary
        if(canbeadd==false&&getNumOfAviaries()<maxNumber)
        {
            Aviary a=new Aviary();
            a.addNewBird(b);
            myAviaries.add(a);
            canbeadd=true;
        }
        else if (getNumOfAviaries()==maxNumber){
            throw new RuntimeException("this bird can not be added to the conservatory because it's full or type doesn't match with the existing "+String.valueOf(maxNumber)+"aviaryies");
        }
        if (canbeadd==true){
            for (Food f:b.getFoodMap().keySet()){
                foodMap.put(f,foodMap.getOrDefault(f,0)+b.getFoodMap().get(f));
            }
        }
    }

    //if a bird is in the conservatory, return the index of its aviary, else return 0;
    public int lookUpBird(BirdClass b){
       for (int i=0;i<myAviaries.size();i++){
           if (myAviaries.get(i).getBirdsInAviary().contains(b))return i + 1;
       }
       return 0;
    }
    //get all the aviaries of this Conservatory
    public ArrayList<Aviary> getMyAviaries() {
        return myAviaries;
    }
    //set all the aviaries of this Conservatory
    public void setMyAviaries(ArrayList<Aviary> myAviaries) {
        this.myAviaries = myAviaries;
    }
    //get number of aviaries
    public int getNumOfAviaries(){
        return myAviaries.size();
    }

    //Print a “map” that lists all the aviaries by location and the birds they house
    public void printMap(){
        String str = "";
        for(int i = 0; i < myAviaries.size();i++){
            str += "Location " + i + 1;
            ArrayList<BirdClass> bird = myAviaries.get(i).getBirdsInAviary();
            for(BirdClass birdClass: bird){
                str += " " + birdClass.getType();
            }

        }
        str += "\n";
        System.out.println(str);
    }

    //Print an index that lists all birds in the conservatory in alphabetical order and their location
    public void printIndex(){

    }
}
