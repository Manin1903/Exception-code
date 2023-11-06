package Utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validation {
    public static int ReadInteger(String message, Scanner input){
        while (true){
            try{
                System.out.println(message);
                return input.nextInt();
            }catch (InputMismatchException ex){
                System.out.println("Error !! value must be integer");
                input.nextLine();
            }
        }
    }
}
