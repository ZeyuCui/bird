public class main {
    public static void main(String[] args) {
        //create 102 birds
        BirdClass[] birds=new BirdClass[102];
        for(int i=0;i<10;i++){
            //Hawks, Eagles, Osprey, Emus, Kiwis, Moas, GreatAuk, HornedPuffin, AfricanJacana, Ducks, Swans, Geese, Owls, RoseRingParakeet, GrayParrot, SulfurCrestedCockatoo, Pigeons, NotRecord
            birds[i]=new Prey(BirdsType.Hawks);
            birds[i+1]=new Prey(BirdsType.Eagles);
            birds[i+2]=new Prey(BirdsType.Osprey);
            birds[i+3]=new FlightlessBird(BirdsType.Emus);
            birds[i+4]=new FlightlessBird(BirdsType.Kiwis);
            birds[i+5]=new FlightlessBird(BirdsType.Moas);
            birds[i+6]=new Owl();
            birds[i+7]=new Parrot(BirdsType.RoseRingParakeet);
            birds[i+8]=new Parrot(BirdsType.SulfurCrestedCockatoo);
            birds[i+9]=new Parrot(BirdsType.GrayParrot);
            birds[i+10]=new Parrot(BirdsType.Pigeons);
            birds[i+11]=new Shorebirds(BirdsType.GreatAuk);
            birds[i+12]=new Shorebirds(BirdsType.HornedPuffin);
            birds[i+13]=new Shorebirds(BirdsType.AfricanJacana);
            birds[i+14]=new Waterfowl(BirdsType.Ducks);
            birds[i+15]=new Waterfowl(BirdsType.Geese);
            birds[i+16]=new Waterfowl(BirdsType.Swans);
        }

        //gray parrot is a kind of parrot not a prey, here we test whether exception will be thrown.
        new Prey(BirdsType.GrayParrot);

        //create a new Conservatory
        Conservatory conservatory=new Conservatory();

        //add all the birds into this conservatory
        for(int i=0;i< birds.length;i++){
            conservatory.addNewBirdToConser(birds[i]);
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
