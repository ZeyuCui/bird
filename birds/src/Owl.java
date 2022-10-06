import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author
 */
public class Owl extends BirdClass {
    //Has a facial disk that frame the eyes and bill


    public Owl(BirdsType type) {
        super.setType(type);
    }

    public Owl(String name, Boolean isExtinct,BirdsType type) {
        super(name, isExtinct);
        super.setType(type);
    }

    public Owl(String name, Boolean isExtinct, Integer wings,BirdsType type) {
        super(name, isExtinct, wings);
        super.setType(type);
    }
}
