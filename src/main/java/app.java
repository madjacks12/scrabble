import models.Scrabble;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Guest on 1/2/18.
 */
public class app {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter A Word and find out its Scrabble value!");
        try {
            String inputString = bufferedReader.readLine();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}

