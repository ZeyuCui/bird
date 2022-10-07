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
    private  Aviary aviary1;
    @Before
    public void setUp(){
        bird1 = new Owl();
        bird2 = new Parrot(BirdsType.GrayParrot);
        bird4 = new Shorebirds(BirdsType.HornedPuffin);
        bird5 = new FlightlessBird(BirdsType.Emus);
        aviary1 = new Aviary();
    }

    @Test
    public void testAddBird(){
        if(aviary1.checkAddNewBird(bird1)){
            aviary1.addNewBird(bird1);
        }
        for (BirdClass birdClass : aviary1.getBirdsInAviary()){
            System.out.println(birdClass.getType());}
    }
}
