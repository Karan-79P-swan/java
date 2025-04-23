import java.util.Scanner;
public class class1 {
    

    public static class Student{
        String name;
        int age;
        double percent;
    }

    public static void main(String[] args) {
        class Car{
            String name;
            String type;
            int noOfWheels;
            
        }

        Scanner sc = new Scanner(System.in);  
        Student A1 = new Student();
        A1.name = "KARAN";
        A1.age = 18;
        A1.percent = 90;

        System.out.println(A1.name);
        System.out.println(A1.age);
        System.out.println(A1.percent);

        Student A2 = new Student();
        A2.name = "Sunil";
        A2.age = 28;
        A2.percent = 72;
        System.out.println();
        System.out.println(A2.name);
        System.out.println(A2.age);
        System.out.println(A2.percent);


        Car altoCar = new Car();
        altoCar.name = "Alto";
        altoCar.type = "400_CC";
        altoCar.noOfWheels = 4;
        System.out.println();
        System.out.println(altoCar.name);
        System.out.println(altoCar.noOfWheels);
        System.out.println(altoCar.type);
    }
    
}
