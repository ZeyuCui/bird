import java.util.LinkedList;

public class Conservatory {
    //a conservatory has many aviaries
    private LinkedList<Aviary> myAviaries;

    public Conservatory() {
        myAviaries=new LinkedList<>();
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

    //whether we can add a new bird to the Conservatory
    public boolean addNewBirdToConser(BirdClass b){
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
        return canbeadd;
    }




}
