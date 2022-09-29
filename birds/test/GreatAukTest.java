import org.junit.Before;
import org.junit.Test;

/**
 * @Description
 * @Author
 */
public class GreatAukTest {

    private Bird auk;
    @Before
    public void setUp(){
        auk = new GreatAuk();
    }

    @Test
    public void testAukName(){
        System.out.println(auk.getName());
    }

    @Test
    public void testAukFood(){
        GreatAuk greatAuk = (GreatAuk)auk;
        System.out.println(greatAuk.getFood().toString());
    }


}
