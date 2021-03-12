import java.lang.*;
import java.util.*;
import java.io.*;
public class calc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice, num;
        double ans;

        do {

            System.out.println("Welcome to Mini Calculator... \nChoose one of the Following operation.");
            System.out.println("Press 1 for Square Root");
            System.out.println("Press 2 for Factorial");
            System.out.println("Press 3 for Natural logarithm");
            System.out.println("Press 4 for Power function");
            System.out.println("Press 0 to Exit");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the Number");
                    num = sc.nextInt();

                    try{
                        ans = Math.sqrt(num);
                        printAns(ans);
                    }catch (Exception e){
                        System.out.println(e);
                    }

                    break;

                case 2:
                    System.out.println("Enter the Number");
                    num = sc.nextInt();
                    long sum = 1;
                    for(int i=2; i<=num; i++) {
                        sum = sum * i;
                    }
                    printAns(sum);
                    break;

                case 3:
                    System.out.println("Enter the Number");
                    num = sc.nextInt();

                    try{
                        ans = Math.log(num);
                        printAns(ans);
                    }catch (Exception e) {
                        System.out.println(e);
                    }
                    break;

                case 4:
                    System.out.println("Enter the base number");
                    num = sc.nextInt();
                    System.out.println("Enter the power number");
                    int power = sc.nextInt();

                    try{
                        ans = Math.pow(num, power);
                        printAns(ans);
                    }catch (Exception e) {
                        System.out.println(e);
                    }
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Please choose correct option");
                    break;
            }

        }while(choice != 0);

    }

    public static void  printAns(double ans){
        System.out.println("------------------------------------------------");
        System.out.println("Your answer is " + ans);
        System.out.println("------------------------------------------------");
    }
}

