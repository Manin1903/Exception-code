import Utils.Validation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value;
        Scanner input = new Scanner(System.in);
        Student student = new Student();
        student.inputStudent(input);
        System.out.println(student);




//        try{
//            System.out.println("Enter tha value:");
//            value = input.nextInt();
//            System.out.println("Value is:"+value);
//        }catch ( InputMismatchException ex){
//            System.out.println("Value must be an integer only!!");
//        }
//        System.out.println("This is another statement!");

    }
}