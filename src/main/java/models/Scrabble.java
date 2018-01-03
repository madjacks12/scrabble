package models;

import java.util.Map;
import java.util.HashMap;

/**
 * Created by Guest on 1/2/18.
 */
public class Scrabble {
    public Map<String, Integer> characterScore;

    public Scrabble() {
        this.characterScore = new HashMap<>();
    }

    public void fillUpHashMap(){
        //fill a-z scores here
        characterScore.put("a", 1);
        characterScore.put("b", 3);
        characterScore.put("c", 3);
        characterScore.put("d", 2);
        characterScore.put("e", 1);
        characterScore.put("f", 4);
        characterScore.put("g", 2);
        characterScore.put("h", 4);
        characterScore.put("i", 1);
        characterScore.put("j", 8);
        characterScore.put("k", 5);
        characterScore.put("l", 1);
        characterScore.put("m", 3);
        characterScore.put("n", 1);
        characterScore.put("o", 1);
        characterScore.put("p", 3);
        characterScore.put("q", 10);
        characterScore.put("r", 1);
        characterScore.put("s", 1);
        characterScore.put("t", 1);
        characterScore.put("u", 1);
        characterScore.put("v", 4);
        characterScore.put("w", 4);
        characterScore.put("x", 8);
        characterScore.put("y", 4);
        characterScore.put("z", 10);



    }

    public Integer calcTotalScore(String input){
        
        return characterScore.get(input);
        //go through input word
        //retrieve individual values for each key (character of word)
        //add it to a score to keep track of
        //return score at bottom
    }

}
