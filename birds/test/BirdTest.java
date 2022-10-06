import org.junit.Before;
import org.junit.Test;

/**
 * @Description
 * @Author
 */
public class BirdTest {
    private BirdClass birdClass;

    @Before
    public void setUp(){
        birdClass = new Pigeon(BirdsType.RoseRingParakeet);
    }
    @Test
    public void testCharacteristic(){
        System.out.println(birdClass.getCharacteristic());
        birdClass.setCharacteristic("aaa");
        System.out.println(birdClass.getCharacteristic());
    }
}
