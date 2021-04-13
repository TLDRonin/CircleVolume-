// Asami, Brian - CS-170-01 - Lab 2
//Driver class 
package VolumeCaluculation;
import java.util.Scanner;

public class CircleVolumeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Values (spaces inbetween each number)");
        //Print message to prompt user to input values
        CircularVolume cv = new CircularVolume();
       
        //Number of input variables
        
        //
        String input = sc.nextLine();
        Scanner check = new Scanner(input);
        //Created a scanner for validation

        if (VolumeValidator2.validateDouble(check)) {    //Validate input data
            String[] inputArr = input.split(" ");
            //Split input into an array

            switch(inputArr.length) {
            //Choosing which method will be called depending on how many numbers were in the input
            case (1):
                    cv.computeVolume(Double.parseDouble(inputArr[0]));
                    break;
            case (2):
                    cv.computeVolume(Double.parseDouble(inputArr[0]), Double.parseDouble(inputArr[1]));
                    break;
            case (3):
                    cv.computeVolume(Double.parseDouble(inputArr[0]), Double.parseDouble(inputArr[1]), Double.parseDouble(inputArr[2]));
                    break;
            }
        } else {
            sc.close();
            throw new IllegalArgumentException();
            //Throw exception if input data doesn't pass the validation check
        }
        sc.close();
    }
}