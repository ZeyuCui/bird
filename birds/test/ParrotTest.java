import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParrotTest {//test parrot

    //create a new parrot
    private Parrot p;
    @Before
    public void setUp(){
        p=new Parrot(BirdsType.GrayParrot);
    }

    @Test
    public void setVocabulary() {
        p.setVocabulary(200);
    }

    @Test
    public void setFavoriteSaying() {
        p.setFavoriteSaying("Peekaboo");
    }

    @Test
    public void getVocabulary() {
        assertEquals(200,p.getVocabulary().intValue());
    }

    @Test
    public void getFavoriteSaying() {
        assertEquals("Peekaboo",p.getFavoriteSaying());
    }
}