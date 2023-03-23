import java.util.Scanner;
public class AssignLab {

    public static
    String assignLab(int capacityOfLab1, int capacityOfLab2, int capacityOfLab3, int numberOfStudents){

        int Lab1Utilization = capacityOfLab1-numberOfStudents;
        int Lab2Utilization = capacityOfLab2-numberOfStudents;
        int Lab3Utilization = capacityOfLab3-numberOfStudents;

        if(Lab1Utilization < 0 && Lab2Utilization < 0 && Lab3Utilization < 0)
            return "Not enough Capacity";

        if(Lab1Utilization < 0)
            Lab1Utilization = Integer.MAX_VALUE;
        if(Lab2Utilization < 0)
            Lab2Utilization = Integer.MAX_VALUE;
        if(Lab3Utilization < 0)
            Lab3Utilization = Integer.MAX_VALUE;

        if(Lab1Utilization < Lab2Utilization && Lab1Utilization < Lab3Utilization)
            return "L1";
        else if(Lab2Utilization < Lab1Utilization && Lab2Utilization < Lab3Utilization)
            return "L2";
        else
            return "L3";


    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Capacity of Lab 1:");
        int lab1Capacity = input.nextInt();
        System.out.println("Please Enter Capacity of Lab 2:");
        int lab2Capacity = input.nextInt();
        System.out.println("Please Enter Capacity of Lab 3:");
        int lab3Capacity = input.nextInt();
        System.out.println("Please Enter Number of Students:");
        int numberOfStudents = input.nextInt();

        System.out.println("the available lab for the students is: " + assignLab(lab1Capacity, lab2Capacity, lab3Capacity, numberOfStudents));
    }
}
