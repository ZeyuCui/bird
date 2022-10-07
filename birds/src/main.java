public class main {
    public static void main(String[] args) {
        //create 102 birds
        BirdClass[] birds=new BirdClass[102];
        for(int i=0;i<6;i++){
            //Hawks, Eagles, Osprey, Emus, Kiwis, Moas, GreatAuk, HornedPuffin, AfricanJacana, Ducks, Swans, Geese, Owls, RoseRingParakeet, GrayParrot, SulfurCrestedCockatoo, Pigeons, NotRecord
            birds[i*17]=new Prey(BirdsType.Hawks);
            birds[i*17+1]=new Prey(BirdsType.Eagles);
            birds[i*17+2]=new Prey(BirdsType.Osprey);
            birds[i*17+3]=new FlightlessBird(BirdsType.Emus);
            birds[i*17+4]=new FlightlessBird(BirdsType.Kiwis);
            birds[i*17+5]=new FlightlessBird(BirdsType.Moas);
            birds[i*17+6]=new Owl();
            birds[i*17+7]=new Parrot(BirdsType.RoseRingParakeet);
            birds[i*17+8]=new Parrot(BirdsType.SulfurCrestedCockatoo);
            birds[i*17+9]=new Parrot(BirdsType.GrayParrot);
            birds[i*17+10]=new Pigeon();
            birds[i*17+11]=new Shorebirds(BirdsType.GreatAuk);
            birds[i*17+12]=new Shorebirds(BirdsType.HornedPuffin);
            birds[i*17+13]=new Shorebirds(BirdsType.AfricanJacana);
            birds[i*17+14]=new Waterfowl(BirdsType.Ducks);
            birds[i*17+15]=new Waterfowl(BirdsType.Geese);
            birds[i*17+16]=new Waterfowl(BirdsType.Swans);
        }

        //gray parrot is a kind of parrot not a prey, here we test whether exception will be thrown.
        //new Prey(BirdsType.GrayParrot);

        //create a new Conservatory
        Conservatory conservatory=new Conservatory();

        //add all the birds into this conservatory
        for(int i=0;i< birds.length;i++){
            try {
                conservatory.addNewBirdToConser(birds[i]);
            }
            catch (RuntimeException e){
                System.out.println("bird "+String.valueOf(i) +" is a "+birds[i].getType().toString()+" "+e.toString());
            }
        }

        //print map
        conservatory.printMap();

        //print index
        conservatory.printIndex();

        //lookup a bird
        conservatory.lookUpBird(birds[10]);

        //print a sign for given aviary
        conservatory.getMyAviaries().get(0).printAviarySign();

        //print food needed for an given Aviary
        //conservatory.getMyAviaries().get(0).printFoodNeeded();

        //print food needed for an given conservatory
        //conservatory.printFoodNeeded();

    }
}
