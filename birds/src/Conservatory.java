import java.util.*;

public class Conservatory {
    /* a single conservatory
    * Allow you to rescue new birds and bring them into your conservatory
    * Calculate what food needs to be kept and in what quantities
    * Assign a bird to an aviary in the conservatory
    */

    //upper limit of the number of aviaries the conservatory can contain
    private static final int maxNumber=20;

    //a conservatory has many aviaries
    private ArrayList<Aviary> myAviaries;

    //food needed for all the birds in the conservatory
    private Map<Food,Integer> foodMap;

    //
    private Map<BirdsType, Integer> typeLocation;

    //constructor, create a new Conservatory with no aviary and an empty food map
    public Conservatory() {
        myAviaries=new ArrayList<>();
        typeLocation = new HashMap<>();
        foodMap=new HashMap<Food, Integer>();
    }

    /* check whether we can add a new bird to the Conservatory, if yes, add it, if no, throw exceptions
    * @param b the BirdClass users want to add to this conservatory
    * @throws IllegalArgumentException if bird is extinct
    * @throws RuntimeException if conservatory is full or type doesn't match with the max number of the existing aviaries
     */
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

    /* check if a bird is in the conservatory, if yes return the index of its aviary, else return 0;
    * @param b is the bird we want to check whether it is inside the conservatory and where
    */
    public void lookUpBird(BirdClass b){
       boolean flag = false;
       for (int i=0;i<myAviaries.size();i++){
           if (myAviaries.get(i).getBirdsInAviary().contains(b))
           {
               flag=true;
               System.out.println("this "+b.getCategory().toString()+" is in "+String.valueOf(i+1)+"'s aviary");
               System.out.println("-----------------------------------------------------");
               System.out.println();
           }
       }
       if(!flag)System.out.println("this bird is not in the conservatory");
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
            str += "Location " + (i + 1) + ":";
            ArrayList<BirdClass> bird = myAviaries.get(i).getBirdsInAviary();
            for(BirdClass birdClass: bird){
                str += " " + birdClass.getType();
            }
            str += "\n";
        }

        System.out.println(str);
    }

    public String printDetails(int index){
        String s = "";
        Aviary aviary = myAviaries.get(index - 1);
        ArrayList<BirdClass> birds = aviary.getBirdsInAviary();
        for(BirdClass bird : birds){
            s += bird.getType() + " " + bird.getCharacteristic() + " ";
        }
        return s;
    }

    public String printInOrder(){
        String str = "";
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();
        PriorityQueue<Map.Entry<String, ArrayList<Integer>>> queue = new PriorityQueue<>();
        int i = 1;
        for(Aviary aviary : myAviaries){
            for(BirdClass bird : aviary.getBirdsInAviary()){
                String birdStr = bird.getType().toString();
                if(map.containsKey(birdStr)){
                    map.get(birdStr).add(i);
                }else{
                    map.put(birdStr, new ArrayList<>());
                    map.get(birdStr).add(i);
                }

            }
        }
        for(Map.Entry<String, ArrayList<Integer>> entry : map.entrySet()){
            queue.add(entry);
        }
        while(!queue.isEmpty()){
            Map.Entry<String, ArrayList<Integer>> entry = queue.poll();
            ArrayList<Integer> arr = entry.getValue();
            str += entry.getKey() + " ";
            for(int num : arr){
                str += "Location " + num + " ";
            }
        }
        return str;

    }
    //Print an index that lists all birds in the conservatory in alphabetical order and their location
    public void printIndex(){

    }
    //print the food needed to be kept in this Conservatory
    public void printFoodNeeded() {
        System.out.println("Here is the food needed to be kept in this Conservatory");
        for(Map.Entry e:foodMap.entrySet()){
            System.out.println(e.getValue().toString()+" "+e.getKey().toString());
        }
        System.out.println("-----------------------------------------------------");
        System.out.println();
    }
}
