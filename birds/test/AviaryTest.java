import org.junit.Before;
import org.junit.Test;

/**
 * @Description
 * @Author
 */
public class AviaryTest {
    private BirdClass bird1;
    private BirdClass bird2;
    private BirdClass bird4;
    private BirdClass bird5;
    private BirdClass bird6;
    private  Aviary aviary1;
    @Before
    public void setUp(){
        bird1 = new Owl();
        bird2 = new Parrot(BirdsType.GrayParrot);
        bird4 = new Shorebirds(BirdsType.HornedPuffin);
        bird5 = new FlightlessBird(BirdsType.Emus);
        bird6 = new FlightlessBird(BirdsType.Kiwis);
        aviary1 = new Aviary();
        BirdClass[] birdArr = new BirdClass[10];
        for(int i = 1; i <= 10; i++){
            birdArr[i - 1] = new Prey(BirdsType.Hawks);
        }
    }

    //Test whether the bird can be added into an aviary correctly
    @Test
    public void testAddBird(){
        if(aviary1.checkAddNewBird(bird1)){
            aviary1.addNewBird(bird1);
        }
        for (BirdClass birdClass : aviary1.getBirdsInAviary()){
            System.out.println(birdClass.getType());}
    }

    //Test whether the bird can be added into an aviary correctly
    @Test
    public void testAddCheckBird(){
        aviary1.checkAndAdd(bird1);
        for (BirdClass birdClass : aviary1.getBirdsInAviary()){
            System.out.println(birdClass.getType());}
    }
    //This test will throw exception an extinct bird type cannot be added into the aviary
    @Test
    public void testAddExtinctBird(){
        aviary1.checkAndAdd(bird6);
        for (BirdClass birdClass : aviary1.getBirdsInAviary()){
            System.out.println(birdClass.getType());}
    }


}
