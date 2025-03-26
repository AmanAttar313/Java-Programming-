import java.util.*;
public class maxnumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the first number");
        int firstnumber=sc.nextInt();
        System.out.println("enter second number");
        int secondnumber=sc.nextInt();
        System.out.println("enter third number");
        int thirdnumber=sc.nextInt();

        if (firstnumber>secondnumber||firstnumber> thirdnumber) {
            System.out.println("first number is max number"+firstnumber);

            
        }else if(secondnumber>firstnumber|| secondnumber>thirdnumber){
            System.out.println("second number is max number"+secondnumber);
        }else{
            System.out.println("third number is max number "+thirdnumber);
        }

        } 
    
}
