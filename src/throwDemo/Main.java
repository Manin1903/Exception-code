package throwDemo;

import customException.StudentException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    public static void myMethod() throws InputMismatchException,IndexOutOfBoundsException,ArithmeticException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value for a:");
        int a = input.nextInt();
        System.out.println("value of A is:"+a);

        int [] value ={4,5,6,0,7};
        System.out.println("My value is:"+value[3]);
        int result= a /value[0];
        System.out.println("result is:"+result);
        //input
        // aritthm
        //array
    }
    public static  int division(int a, int b){
        if(a%2!=0) throw  new ArithmeticException("A can not odd");
        if(b%2!=0) throw  new ArithmeticException("B can not odd");
        if(b<a) return a/b;
        else  throw new ArithmeticException("A must be greater than B");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.println("Enter a:");
        a = input.nextInt();
        System.out.println("Enter b:");
        b = input.nextInt();
        try{
            System.out.println("Result:"+division(a,b));
        }
       catch (ArithmeticException ex){
           System.out.println("Error!!"+ex.getMessage());
       }


    }
}
