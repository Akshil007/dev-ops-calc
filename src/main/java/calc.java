import java.lang.*;
import java.util.*;
import java.io.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class calc {
    private static final Logger logger = LogManager.getLogger(calc.class);

    public static void main(String[] args) throws IOException {

        System.setProperty("log4j.configurationFile","../resources/log4j2.xml");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //Scanner sc = new Scanner(System.in);


        int choice, num;
        double ans;

        do {

            System.out.println("Welcome to Mini Calculator... \nChoose one of the Following operation.");
            System.out.println("Press 1 for Square Root");
            System.out.println("Press 2 for Factorial");
            System.out.println("Press 3 for Natural logarithm");
            System.out.println("Press 4 for Power function");
            System.out.println("Press 0 to Exit");

            choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1:
                    System.out.println("Enter the Number");
                    num = Integer.parseInt(br.readLine());

                    try{
                        ans = sqrt(num);
                        logger.info("SQRT of "+num+"="+ans);
                        printAns(ans);
                    }catch (Exception e){
                        logger.error("Something went wrong in square root function");
                        System.out.println(e);
                    }

                    break;

                case 2:
                    System.out.println("Enter the Number");
                    num = Integer.parseInt(br.readLine());
                    long sum=fact(num);
                    logger.info("FACT of "+num+"="+sum);
                    printAns(sum);
                    break;

                case 3:
                    System.out.println("Enter the Number");
                    num = Integer.parseInt(br.readLine());

                    try{
                        ans = n_log(num);
                        logger.info("Natural log of "+num+"="+ans);
                        printAns(ans);
                    }catch (Exception e) {
                        logger.error("Something went wrong in square log function");
                        System.out.println(e);
                    }
                    break;

                case 4:
                    System.out.println("Enter the base number");
                    num = Integer.parseInt(br.readLine());
                    System.out.println("Enter the power number");
                    int power = Integer.parseInt(br.readLine());
                    try{
                        ans = power(num,power);
                        logger.info("Power of "+num+"with power "+power+"="+ans);
                        printAns(ans);
                    }catch (Exception e) {
                        logger.error("Something went wrong in square power function");
                        System.out.println(e);
                    }
                    break;

                case 0:
                    logger.info("Program Finished");
                    break;

                default:
                    System.out.println("Please choose correct option");
                    break;
            }

        }while(choice != 0);

    }
    public static double sqrt(int num)
    {
        return Math.sqrt(num);
    }

    public static long fact(int num)
    {
        long sum = 1;
        for(int i=2; i<=num; i++) {
            sum = sum * i;
        }
        return sum;
    }
    public static double n_log(int num)
    {
        return Math.log(num);
    }

    public static double power(int num,int power)
    {
        return Math.pow(num, power);
    }

    public static void  printAns(double ans){
        System.out.println("------------------------------------------------");
        System.out.println("Your answer is " + ans);
        System.out.println("------------------------------------------------");
    }
}

