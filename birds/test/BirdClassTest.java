import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

//This class will test every function and some exception condition in BirdClass
public class BirdClassTest {
    private BirdClass bird1;
    private BirdClass bird2;
    private BirdClass bird4;
    private BirdClass bird5;
    private BirdsNearWater bird6;
    private BirdsNearWater bird7;
    @Before
    public void setUp(){
        bird1 = new Owl();
        bird2 = new Parrot(BirdsType.GrayParrot);
        bird4 = new Shorebirds(BirdsType.HornedPuffin);
        bird5 = new FlightlessBird(BirdsType.Emus);
        bird6 = new Shorebirds(BirdsType.AfricanJacana, BodyOfWater.WETLANDS);

    }

    //Test whether we can get the water habitat of bird
    @Test
    public void testWaterBird(){
        assertEquals(BodyOfWater.WETLANDS, bird6.getWaterSources());
    }

    //This test will throw exception because a bird type which don't belong to parrot's category is passed to parrot's constructor
    @Test
    public void testInvalidBirdType(){

        try {
            BirdClass bird3 = new Parrot(BirdsType.Owls);
        }catch(IllegalArgumentException e){
            System.out.println(e.toString());
        }
    }


    //Test whether the BirdType of a BirdClass can be get correctly
    @Test
    public void testGetType(){
        assertEquals("Owls", bird1.getType().toString());
    }

    //Test whether the Category of a BirdClass can be get correctly
    @Test
    public void testGetCategory(){
       assertEquals("SHOREBIRDS", bird4.getCategory().toString());
    }

    //Test whether the wings of a BirdClass can be get correctly
    @Test
    public void testGetWings(){
        assertEquals("2", bird1.getWings().toString());
        assertEquals("0", bird5.getWings().toString());
    }

    //Test whether the Characteristic of a BirdClass can be get correctly
    @Test
    public void testGetCharacteristic(){
        assertEquals("Has a facial disk that frame the eyes and bill", bird1.getCharacteristic());
    }

    @Test
    public void testGetExtinct(){
        assertEquals("false", bird1.getIsExtinct().toString());
    }

}
