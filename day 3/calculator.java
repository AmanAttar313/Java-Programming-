import java.util.*;
public class calculator{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number :");
        int number1=sc.nextInt();
        System.out.println("enter second number:");
        int number2=sc.nextInt();
        // for input operator
        System.out.println("enter a operator (+,-,*,/)");
        char operator=sc.next().charAt(0);
        double result;
       if (operator=='+') {
        result=number1+number2;
        System.out.println("multiplication is :"+result);
        
       }else if (operator=='-') {
        result=number1-number2;
        System.out.println("subtraction is :"+ result);
        
       }else if(operator=='*'){
        result=number1*number2;
        System.out.println("addition is "+ result);
       }else if (operator=='/') {
        if(number2 !=0){
        result=number1/number2;
        System.out.println("division is :"+ result);
        }else{
            System.out.println("error in division by zero");
        }
       }else {
        System.out.println("invalid operator you enter");
       }

       
        
    }
}