package ChapterFive;

import java.util.Scanner;
public class AutoPolicyTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        AutoPolicy policy = new AutoPolicy(123455667 , "Toyota Camary" , "NJ");
        AutoPolicy policy1 = new AutoPolicy(235576544 , "Ford Fusion" , "ME");
     //   AutoPolicy policy2 = new AutoPolicy(234556555 , "Venza" , "Vi");




       policyInNoFaultState(policy);
       policyInNoFaultState(policy1);
      // policyInNoFaultState(policy2);

        AutoPolicy policy2 = new AutoPolicy(234556555 , "Venza" , "Vi");
        System.out.println("Enter a car # make");
        int number = input.nextInt();
        policy.setAccountNumber(number);
        System.out.println();

        System.out.println("Enter your model");
        String make = input.nextLine();
        policy.setMakeAndModel(make);
        System.out.println();

        System.out.println("Enter your state");
        String state = input.nextLine();
        policy.setState(state);
        System.out.println();

        System.out.printf(" the car details are : %d%n %s%n %s%n  ",policy.getAccountNumber(),policy.getMakeAndModel(), policy.getState());


    }
    public static void policyInNoFaultState(AutoPolicy policy){
        System.out.println("The auto policy");
        System.out.printf("Account #: %d; Car: %s; State %s %s a no-fault state%n%n", policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(),(policy.isNofaultState() ? "is" : "is not"));
    }
}
