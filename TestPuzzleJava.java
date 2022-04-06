import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);

        String getAlphabet = generator.getRandomLetter();
        System.out.println(getAlphabet);

        String getPassword = generator.generatePassword();
        System.out.println(getPassword);

        ArrayList<String> setPassword = generator.getNewPasswordSet(6);
        System.out.println(setPassword);
		
    	//..
		// Write your other test cases here.
		//..
	}
}
