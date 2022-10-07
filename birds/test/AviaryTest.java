import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
    private BirdClass bird7;
    private  Aviary aviary1;
    private BirdClass[] birdArr = new BirdClass[10];
    @Before
    public void setUp(){
        bird1 = new Owl();
        bird2 = new Parrot(BirdsType.GrayParrot);
        bird4 = new Shorebirds(BirdsType.HornedPuffin);
        bird5 = new FlightlessBird(BirdsType.Emus);
        bird6 = new FlightlessBird(BirdsType.Kiwis);
        bird7 = new Prey(BirdsType.Hawks);
        aviary1 = new Aviary();

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

    @Test
    public void testGetBirdsInAviary(){
        aviary1.checkAndAdd(bird4);
        aviary1.checkAndAdd(bird1);

        try {
            aviary1.checkAndAdd(bird5);
        }catch(RuntimeException e){
            System.out.println(e.toString());
        }

    }

    //This test will throw exception an extinct bird type cannot be added into the aviary
    @Test
    public void testAddExtinctBird(){
        try {
            aviary1.checkAndAdd(bird6);
        }catch(IllegalArgumentException e){
            System.out.println(e.toString());
        }

    }

    //This test will throw exception when an aviary is full
    @Test
    public void testMaximumNum(){

        try {
            for(int i = 1; i <= 10; i++){
                aviary1.checkAndAdd(birdArr[i-1]);
                System.out.println(aviary1.getBirdsInAviary().size());
            }
        }catch(RuntimeException e){
            System.out.println(e.toString());
        }

    }

    @Test
    public void testGetNumOfBirds(){
        for(int i = 1; i <= 4; i++){
            aviary1.checkAndAdd(birdArr[i-1]);
        }
        assertEquals(4, aviary1.getNumOfBirds());
    }

    //Test whether the correct aviary type can be get
    @Test
    public void testGetAviaryType(){
        aviary1.checkAndAdd(bird7); //add hawk to this aviary
        assertEquals(AviaryType.PREY, aviary1.getAviaryType());
    }

    //This test will throw exception because an owl is added into the PREY aviary
    @Test
    public void testAviaryTypeException(){
        aviary1.checkAndAdd(bird7); //add hawk to this aviary
        assertEquals(AviaryType.PREY, aviary1.getAviaryType());
        try {
            aviary1.checkAndAdd(bird1);
            assertEquals(AviaryType.PREY, aviary1.getAviaryType());
        }catch(RuntimeException e){
            System.out.println(e.toString());
        }

    }

}
