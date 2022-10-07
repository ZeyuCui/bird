import org.junit.Before;

/**
 * @Description
 * @Author
 */
public class ConservatoryTest {
    private BirdClass bird1;
    private BirdClass bird2;
    private BirdClass bird4;
    private BirdClass bird5;
    private  Aviary aviary1;
    private  Conservatory conservatory1;
    @Before
    public void setUp(){
        bird1 = new Owl();
        bird2 = new Parrot(BirdsType.GrayParrot);
        bird4 = new Shorebirds(BirdsType.HornedPuffin);
        bird5 = new FlightlessBird(BirdsType.Emus);
        aviary1 = new Aviary();
        conservatory1 = new Conservatory();
    }
}
