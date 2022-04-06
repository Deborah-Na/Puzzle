
import java.util.ArrayList;
import java.util.Random;
public class PuzzleJava{

    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> randomNums = new ArrayList<Integer>();
        Random randMachine = new Random();
        for(int i=1; i < 11; i++){
            //need to add +1 or it will only go up to 19
            randomNums.add(randMachine.nextInt(20)+1);
        }
        return randomNums;
    }
    public String getRandomLetter(){
        Random randMachine = new Random();

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char randomAlphabet = alphabet.charAt(randMachine.nextInt(26));

        return String.valueOf(randomAlphabet);
    }

    public String generatePassword(){
        String password ="";

        for(int i=1; i< 9; i++){
            password += getRandomLetter();
        }
        return password; 
    }

    public ArrayList<String> getNewPasswordSet(int number){
        ArrayList<String> setPassword = new ArrayList<String>();

        for(int i=1; i<= number; i++){
            setPassword.add(generatePassword());
        }
        return setPassword;
    }

}