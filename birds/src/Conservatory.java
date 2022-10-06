import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Conservatory {
    //a conservatory has many aviaries
    private LinkedList<Aviary> myAviaries;
    //food needed for all the birds in the conservatory
    private Map<Food,Integer> foodMap;

    public Conservatory() {
        myAviaries=new LinkedList<>();
        foodMap=new HashMap<Food, Integer>();
    }

    //whether we can add a new bird to the Conservatory
    public boolean addNewBirdToConser(BirdClass b){
        if(b.getIsExtinct()=="Yes")return false;
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
        if(canbeadd==false&&getNumOfAviaries()<20)
        {
            Aviary a=new Aviary();
            a.addNewBird(b);
            myAviaries.add(a);
            canbeadd=true;
        }
        if (canbeadd==true){
            for (Food f:b.getFoodMap().keySet()){
                foodMap.put(f,foodMap.getOrDefault(f,0)+b.getFoodMap().get(f));
            }
        }
        return canbeadd;
    }

    //if a bird is in the conservatory, return the index of its aviary, else return 0;
    public int lookUpBird(BirdClass b){
       for (int i=0;i<myAviaries.size();i++){
           if (myAviaries.get(i).getBirdsInAviary().contains(b))return i;
       }
       return 0;
    }
    //get all the aviaries of this Conservatory
    public LinkedList<Aviary> getMyAviaries() {
        return myAviaries;
    }
    //set all the aviaries of this Conservatory
    public void setMyAviaries(LinkedList<Aviary> myAviaries) {
        this.myAviaries = myAviaries;
    }
    //get number of aviaries
    public int getNumOfAviaries(){
        return myAviaries.size();
    }

}
