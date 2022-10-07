import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * @Description
 * @Author
 */
public class ConservatoryTest {
    private BirdClass bird1;
    private BirdClass bird2;
    private BirdClass bird4;
    private BirdClass bird5;
    private  Conservatory conservatory1;
    @Before
    public void setUp(){
        bird1 = new Owl();
        bird2 = new Parrot(BirdsType.GrayParrot);
        bird4 = new Shorebirds(BirdsType.HornedPuffin);
        bird5 = new FlightlessBird(BirdsType.Emus);
        conservatory1 = new Conservatory();
    }

    //Test whether the bird can be added into an aviary
    @Test
    public void testAddNewBirdToConser(){
        conservatory1.addNewBirdToConser(bird1);
        ArrayList<Aviary> aviaryArr= conservatory1.getMyAviaries();
        for (Aviary aviary : aviaryArr){
            ArrayList<BirdClass> birds= aviary.getBirdsInAviary();
            for(BirdClass bird : birds){
                System.out.println(bird.getType());
            }
        }
    }

    //This test will throw exception because the actual aviary number exceeds the maximum aviary number a conservatory can have
    @Test
    public void testMaximumAviaryInConservatory(){
        for(int i = 0; i < 200; i++){
            conservatory1.addNewBirdToConser(bird1);
        }
    }

    //Test the function in conservatory to check whether a bird is in the conservatory
    @Test
    public void testLookUpBird(){
        conservatory1.addNewBirdToConser(bird1);
        conservatory1.addNewBirdToConser(bird2);
        conservatory1.lookUpBird(bird1);
    }

    //Test the function in conservatory to check whether a bird is in the conservatory
    @Test
    public void testLookUpBirdNotIn(){
        conservatory1.addNewBirdToConser(bird1);
        conservatory1.lookUpBird(bird2);
    }

    //Test the function getNumOfAviaries() to get aviary number
    @Test
    public void testCheckNumOfAviary(){
        for(int i = 0; i < 50; i++){
            conservatory1.addNewBirdToConser(bird1);
        }
        assertEquals(10, conservatory1.getNumOfAviaries());
    }
    @Test
    public void testPrintMap(){
        for(int i = 0; i < 50; i++){
            conservatory1.addNewBirdToConser(bird1);
        }
        conservatory1.printMap();
    }


}
