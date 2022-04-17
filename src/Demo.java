import java.util.Random;
import static java.lang.Boolean.*;
import java.io.*;

class Demo{
    public static void main(String[] Args) throws FileNotFoundException {

        PrintStream output = new PrintStream("E:\\Desktop\\Results.txt");
        System.setOut(output);

        for(int i = 0; i < 10000; i++) {
            String result = rngHoning().toString(); //returns result of honing as String for printing
            System.out.println("Attempt " + (i+1) + ": " + result); //prints result
        }
    }

    static Boolean rngHoning(){
        Random rand = new Random(); //init random number generator
        int upperBound = 10; //sets upper limit to 9
        int rng = rand.nextInt(upperBound); //generates number from 0 to 9, inclusive
        int failCheck = rand.nextInt(upperBound); //generates number from 0 to 9, inclusive

        if(rng == failCheck){
            return FALSE;
        } else {
            return TRUE;
        }
    }
}