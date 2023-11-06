import Utils.Validation;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String gender;
    public Student(int id,String name ,String gender){
        this.id=id;
        this.name=name;
        this.gender=gender;
    }
    public Student (){}
    public void inputStudent( Scanner input){
        id = Validation.ReadInteger("Enter student ID:",input);
        input.nextLine();
        System.out.println("Enter name:");
        name= input.nextLine();
        System.out.println("Enter Gender:");
        gender = input.nextLine();
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
