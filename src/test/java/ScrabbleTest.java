import models.Scrabble;
import org.junit.*;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Guest on 1/2/18.
 */
public class ScrabbleTest {
    @Test
    public void calculateScore_returnsScoreForSingleLetter_1() throws Exception {
        Scrabble testScrabble = new Scrabble();
        testScrabble.fillUpHashMap();
        Integer expected = 1;
        assertEquals(expected, testScrabble.calcTotalScore("a"));
    }

//    @Test
//    public void calculateScore_returnsScoreForSingleLetter_1() throws Exception {
//        Scrabble testScrabble = new Scrabble();
//        testScrabble.fillUpHashMap();
//        Integer expected = 5;
//        assertEquals(expected, testScrabble.calcTotalScore("aeiou"));
//    }

}
